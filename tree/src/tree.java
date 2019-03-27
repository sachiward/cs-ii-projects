
public class tree {

	static void draw_tree (double x1, double y1, double angle, double length, int n){
	double langle, rangle, x2, y2; 
	
		if(n>0){
			
			//new length
			length=(0.655)*length; 
		
			//new point
			x2=x1+length*(Math.cos(angle));
			y2=y1+length*(Math.sin(angle));
			
			StdDraw.line(x1, y1, x2, y2);
			StdDraw.show();
			
			//new angles
			langle=angle+(Math.PI/6); 
			rangle=angle-(Math.PI/6);
		
			draw_tree(x2, y2, langle, length, n-1);	
			draw_tree(x2, y2, rangle, length, n-1);	
	}	
	}
	
	public static void main(String[] args) {
		int n;
		System.out.printf("Please type in a recursive depth: ");
		n = StdIn.readInt();
		
		StdDraw.enableDoubleBuffering();
		StdDraw.setCanvasSize(800, 800);
		StdDraw.setScale(0, 799);
		StdDraw.setPenRadius(0.00205);
	
		draw_tree(400, 50, (Math.PI)/2, 400, n);
		
		StdDraw.show();


	}

}
