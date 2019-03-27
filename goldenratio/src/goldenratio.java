//Working code!

public class goldenratio {

	static void my_rectangle(double lx, double ly, double width, double height){
		double rx, uy;
		
		rx=lx+width;
		uy=ly+height;
		
		StdDraw.line(lx, ly, rx, ly);
		StdDraw.line(rx, ly, rx, uy);
		StdDraw.line(rx, uy, lx, uy);
		StdDraw.line(lx, uy, lx, ly);
		
		StdDraw.show();	
	}
	
	static void draw_rect (int n, int turn, double l, double x, double y){
		double s, l2, phi;
		
		phi = 1.6180339887;
		s = l / phi;
		l2=l;
		my_rectangle(50,(700-(600/phi))/2,600,600/phi);
		StdDraw.show();
		
		if (turn<n) {
			if (turn % 2==0){
				//even
				s = l / phi;
				l2=s;
				y=y+s;
				s=l-s;
				l=l2;
				my_rectangle(x,y,l,s);
				StdDraw.show();
			}
			if (turn % 2==1) {
				//odd
				s = l / phi;
				l2=s;
				x=x+s;
				s=l-s;
				l=l2;
				my_rectangle(x,y,s,l);
				StdDraw.show();
				
				} 
			
			draw_rect(n, turn+1, l, x, y);
		}
	}
	
	public static void main(String[] args) {
		int n;
		System.out.printf("Please type in a number of rectangles: ");
		n = StdIn.readInt();

		StdDraw.enableDoubleBuffering();
		StdDraw.setCanvasSize(700, 700);
		StdDraw.setScale(0, 699);
		StdDraw.setPenRadius(0.00205);
		
		
		draw_rect(n, 1, 600 ,50,(700-(600/1.6180339887))/2);

	}

}
