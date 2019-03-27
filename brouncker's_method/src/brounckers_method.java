//works 
public class brounckers_method {

	static double bm(int n, int start) {
		if (n == start) {
			return (2 + n * n);
		}
		if (start == 1) {
			if (start == n) {
				return (2);
			}
			return (1 + (start * start) / bm(n, start + 2));
		} else {
			if (start == n) {
				return (2 + n * n);
			}
			return (2 + (start * start) / bm(n, start + 2));

		}
	}

	public static void main(String[] args) {
		int n;
		System.out.printf("Please type in an integer: ");
		n = StdIn.readInt();

		double ans= 4.000/bm(n, 1);
		
		System.out.printf("%f", ans);
	}

}
