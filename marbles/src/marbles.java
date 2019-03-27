
public class marbles {

	static double combination(double n, double k) {
		double ans, tn=n, tk=k, tk1=k;
		if(tk==1){return tn;}
		if(tk1==1){return tn;}
		if(tk==tn){return 1;}
		if(tk1==tn){return 1;}
		tn--;
		tk1--;
		ans = combination(tn, tk1) + combination(tn, tk);
		return ans;
	}

//!!!!!!!!//
	static double my_pow(double x, double y) {
		double ans=x; double count=1;
		if(y==1){return ans;}
		ans=ans*x; count++;
		if(count<=y){
		return(my_pow(ans, y-1));	}
		else{
			return ans;
		}
	}

	static double prob(double n, double k, double p, double q) {

		if (p == 0) {return 0;}
		if (p == 1) {return 1;}
		if (n == 0) {return 0;}
		
		return (combination(n, k) * my_pow(p, k) * my_pow(q, n - k));

	}

	public static void main(String[] args) {
		System.out.printf("Please type in a total number of marbles: ");
		double total = StdIn.readDouble();
		System.out.printf("Please type in how many marbles are red: ");
		int red = StdIn.readInt();
		System.out.printf("Please type in how many marbles you want to pick: ");
		double n = StdIn.readDouble();
		System.out.printf("Please type in how many marbles you want to be red: ");
		double k = StdIn.readDouble();
		double white = total - red;
		double p = red / total;
		double q = white / total;
		double ans=	prob(n, k, p, q);
		
		System.out.printf("The probability is %f", ans);
	}

}
