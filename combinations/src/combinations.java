
public class combinations {

	static int combination (int n, int k){
		int ans, tn=n, tk=k, tk1=k;
		if(tk==1){return tn;}
		if(tk1==1){return tn;}
		if(tk==tn){return 1;}
		if(tk1==tn){return 1;}
		tn--;
		tk1--;
		ans= combination(tn,tk1) +combination(tn, tk);
		return ans;
	}
	
	public static void main(String[] args) {
		int n, k, ans;
		System.out.printf("Please type in an integer n: ");
		n = StdIn.readInt();
		System.out.printf("Please type in an integer k: ");
		k = StdIn.readInt();
		ans = combination (n,k);
		System.out.printf("%d choose %d = %d", n, k, ans);
	}
}
