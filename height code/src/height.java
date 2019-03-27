
public class height {

	static class Person{
		// data fields
		int age;
		char gender;
		double height;
		
		// constructor
		Person (int a, double b, char c){
		age=a;
		height=b;
		gender=c;
		
		//methods, don't put static before bc they are in the class person
		double getHeight(){
			return height;
		}
		
		void setHeight(double val){
			height=val;
		}
		
	
		double getHeightInFeet(){
			return height/12;
			
		}
		int whoIsOlder (Person david){
			if(age>david.age){return 1;}
			else if (age<david.age){return 0;}
			else {return 2;}
		}
		
		}
	}
	public static void main(String[] args) {
		
		/*index = 1;
		double val = 74;

		set_height(index, height, val);
		index = get_height();

		System.out.printf("%f", height);*/
		
		int x; double height; double val;double feet;
		Person david = new Person(35, 71.5, 'm');
		Person myisha= new Person(18, 67, 'f');
		height=david.getHeight();
		val=68;
		myisha.setHeight(val);
		feet= myisha.getHeightInFeet();
		
		myisha.whoIsOlder(david); //return 1 if myisha, 0 if david
	}

}

