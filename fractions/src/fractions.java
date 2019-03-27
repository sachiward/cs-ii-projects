
public class fractions {
	
	public static int gcd(int a, int b){
		   if(a == 0) return b;
		   if(b == 0) return a;
		   if(a > b) return gcd(b, a % b);
		   return gcd(a, b % a);
		}
	
	static class Frac{
		int num; int den;
		
		Frac(int n, int d){
			this.num=n; this.den=d;
		}
	
		
		void printFrac(int num, int den){
			int x;
			x= gcd(num, den);
			if (x>0){
				num=num/x;
				den=den/x;
			}
			System.out.printf("%d", num);
			System.out.printf("/");
			System.out.printf("%d", den);
			
		}
	}
	public static void main(String[] args) {
	int c; double z;
		Frac bob = new Frac(4,7);

		
		
	}

}
