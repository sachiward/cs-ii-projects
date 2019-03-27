
public class selection_sort {

	public static void main(String[] args) {
		int n=1;
		int count = 0; 
		int [] num = new int[1000];
		int tempa; int a=0; int b=1;
		System.out.printf("Please type integers, terminate with a 0: ");
		while (n != 0) {
			n = StdIn.readInt();
			num[count] = n;
			count++;
		}
		while(a<count-1){
			b=a+1;
			while(b<=count-1){
				if(num[b]<num[a]){
					tempa=num[a];
					num[a]=num[b];
					num[b]=tempa; 
				}
				b++;
			}
			a++;
		}
		int flag=1;
		while(flag<count){
		System.out.printf("%d ", num[flag]);
		flag++;
		}
}
}