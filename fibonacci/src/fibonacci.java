
public class fibonacci {

	static int fibonacci(int n){
		if (n==1){return 0;}
		if (n==2){return 1;}	
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	public static void main(String[] args) {
	int n, fib;
	System.out.printf("Please type in an integer k: ");
	n = StdIn.readInt();
	fib = fibonacci(n);
	System.out.printf("The %dth fibonacci number is %d", n, fib);
	}

}
