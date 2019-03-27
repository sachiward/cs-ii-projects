public class merge_sort {

	static void merge(int[] numbers, int lo, int hi, int middle) {
		int[] temp = new int[1000];
		int k = lo;
		int c = middle + 1;
		int z = lo;

		while (k <= middle && c <= hi) {
			if (numbers[k] <= numbers[c]) {
				temp[z] = numbers[k];
				k++;
			} else {
				temp[z] = numbers[c];
				c++;
			}
			z++;
		}
		// while statement to finish inputing left side
		while (k <= middle) {
			temp[z] = numbers[k];
			k++;
			z++;
		}
		// while statement to finish inputing right side
		while (c <= hi) {
			temp[z] = numbers[c];
			c++;
			z++;
		}
		// numbers=temp
		k = lo;
		while (k <= hi) {
			numbers[k] = temp[k];

			k++;
		}
	}

	static void merge_func(int[] numbers, int lo, int hi) {
		int middle = (hi + lo) / 2;
		if (lo != hi) {
			merge_func(numbers, lo, middle);
			merge_func(numbers, middle + 1, hi);

		}
		merge(numbers, lo, hi, middle);
	}

	public static void main(String[] args) {
		int n = 1;
		int count = 0;
		int[] numbers = new int[1000];

		// fill array
		System.out.printf("Please type integers, terminate with a -1: ");
		n = StdIn.readInt();
		while (n != -1) {
			numbers[count] = n;
			count++;
			n = StdIn.readInt();
		}

		merge_func(numbers, 0, count - 1);

		// print array
		int flag = 0;
		while (flag < count) {
			System.out.printf("%d ", numbers[flag]);
			flag++;
		}
	}

}
