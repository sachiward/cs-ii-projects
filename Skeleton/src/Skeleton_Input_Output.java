
public class Skeleton_Input_Output {

	public static void main(String[] args) {
		String name;
		double age ;
		
		System.out.printf("Please enter your name: \n");
		name = StdIn.readString();
		
		System.out.printf("Please enter your age: \n");
		age = StdIn.readDouble();
		
		System.out.printf("Hello %s, %f is half of your age.\n",  name, age/2);
	}

}
