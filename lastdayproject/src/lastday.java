
public class lastday {
//n^2=4*(n/2)^2
	//0100=4
	static int my_square(int n){
		if (n==0){return 0;}
		if (n==1){return 1;}
		else{
			
		}
		my_square();
	}
	
	public static void main(String[] args) {
		int n;
		System.out.printf("Please type in a non negative integer: ");
		n=StdIn.readInt();
		
		int answer=my_square(n);
		
		System.out.printf("n^2 = %d", answer);

	}

}

//n^2, but no pow and no *