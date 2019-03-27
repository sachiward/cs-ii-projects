
public class n_factorial {

	static int factorial (int n){
		int ans;
		if (n==0){return 1;}
		if (n==1){return n;}
		ans = n * factorial(n-1);
		return ans;
	}
	
	public static void main(String[] args) {
		
		int product, n = 0;
		System.out.printf("Please type in an integer n: ");
		n = StdIn.readInt();
		product = factorial(n);
		System.out.printf("n!= %d", product);
		
	}

}
