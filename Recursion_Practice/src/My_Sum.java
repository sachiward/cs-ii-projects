
public class My_Sum {

	static int my_sum (int n){
		int ans;
		if (n==1){return n;}
		ans = n + my_sum(n-1);
		return ans;
	}
	
	public static void main(String[] args) {

		int sum, n = 0;
		System.out.printf("Please type in an integer n: ");
		n = StdIn.readInt();
		sum = my_sum(n);
		System.out.printf("n= %d", sum);


	}

}
