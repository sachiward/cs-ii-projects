public class calculator {

	static void parse(char[] input, char[] parsed, double[] parsed_d, int a, int[] q) {
		int x;
		int m;
		int v = 0;
		double total;

		for (x = 0; x < a; x++) {
			int len = 0;
			if ('0' <= input[x] && input[x] <= '9') {
				total = 0;
				int flag = 0;
				int exp = 0;

				for (m = x; input[m] != ' ' && (int) input[m] != 13; m++) {
					if ('0' <= input[m] && input[m] <= '9') {
						if (flag == 0) {
							total = ((double) input[m] - 48) + total * 10;
						} else {
							total = total + (((double) input[m] - 48) / Math.pow(10.0, exp));
						}
					} else if (input[m] == '.') {
						flag = 1;
					}
					if (flag == 1) {
						exp++;
					}
					len++;
				}
				parsed[v] = 'd';
				parsed_d[v] = total;
				v++;
			} else {
				if (input[x] != ' ' && (int) input[x] != 13) {
					parsed[v] = input[x];
					v++;
				}
			}
			x = x + len;
		}

		q[0] = v;

	}

	static void fill_stack(char[] parsed, double[] parsed_d, double[] my_stack, int z, int[] pointer) {
		int q = 0;
		for (q = 0; q <= z; q++) {
			if (parsed[q] == 'd') {
				my_stack[pointer[0]] = parsed_d[q];
				pointer[0]++;
			} else if (parsed[q] == '+') {
				process(parsed, my_stack, pointer, '+');
			} else if (parsed[q] == '-') {
				process(parsed, my_stack, pointer, '-');
			} else if (parsed[q] == '/') {
				process(parsed, my_stack, pointer, '/');
			} else if (parsed[q] == '*') {
				process(parsed, my_stack, pointer, '*');
			}
		}
		process(parsed, my_stack, pointer, parsed[z - 1]);
	}

	static void process(char[] parsed, double[] my_stack, int[] pointer, char op) {
		double total;
		total = pop(my_stack, op, pointer);
		if (pointer[0] > 1) {
			push(total, my_stack, pointer);
		}
	}

	static double pop(double[] my_stack, char op, int[] pointer) {
		if (pointer[0] >= 2) {
			double num1 = my_stack[pointer[0] - 1];
			double num2 = my_stack[pointer[0] - 2];
			my_stack[pointer[0] - 1] = 0;
			if (op == '-') {
				return (num2 - num1);
			} else if (op == '+') {
				return (num1 + num2);
			} else if (op == '*') {
				return (num1 * num2);
			} else {// division//
				return (num2 / num1);
			}
		}
		if (pointer[0] == 1) {
			if (op == '-') {
				return (my_stack[pointer[0] - 1] - my_stack[pointer[0]]);
			} else if (op == '+') {
				return (my_stack[pointer[0] - 1] + my_stack[pointer[0]]);
			} else if (op == '*') {
				return (my_stack[pointer[0] - 1] * my_stack[pointer[0]]);
			} else {// division//
				return (my_stack[pointer[0] - 1] / my_stack[pointer[0]]);
			}
		} else {
			return my_stack[0];
		}
	}

	static void push(double total, double[] my_stack, int[] pointer) {
		pointer[0]--;
		my_stack[pointer[0] - 1] = total;
	}

	public static void main(String[] args) {
		char c;

		System.out.printf("Please type in an expression to calculate (type 'exit' to quit program):");
		c = StdIn.readChar();
		while (c != 'e') {

			char[] input = new char[1000];
			double[] my_stack = new double[1000];
			int a = 0;
			int x = 0;

			char[] parsed = new char[1000];
			double[] parsed_d = new double[1000];
			int[] q = new int[1];
			int[] pointer = new int[1];

			while (c != '\n' && c != '\0') {
				input[a] = c;
				a++;
				c = StdIn.readChar();
			}

			while (x < a) {
				System.out.printf("%c", input[x]);
				x++;
			}
			x = 0;

			parse(input, parsed, parsed_d, a, q);

			fill_stack(parsed, parsed_d, my_stack, q[0], pointer);

			double answer = my_stack[0];

			System.out.printf(" equals %f\n", answer);

			// clear old results
			for (x = 0; x < a; x++) {
				input[x] = 0;
			}
			a = 0;

			System.out.printf("Please type in an expression to calculate (type 'exit' to quit program):");
			c = StdIn.readChar();
		}
		if (c == 'e') {
			System.exit(0);
		}

	}

}
