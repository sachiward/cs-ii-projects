//not working!

public class golden_ratio {

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
	
	static void draw_rect (int n, double l, double cx, double cy){
		double s, l2, phi;
		
		phi = 1.6180339887;
		s = l / phi;

		if (n > 0) {
			if ((n % 2) == 0) {
				// even
				StdDraw.rectangle(cx, cy, s / 2, l / 2);
				StdDraw.show();
				l2=s;
				s=l-s;
				cy = cy + (s / 2);
				

			} else {
				// odd
				StdDraw.rectangle(cx, cy, l / 2, s / 2);
				StdDraw.show();
				s=l-s;
				l2=s;
				cx = cx + (l2 / 2);
			}

			draw_rect(n - 1, l2, cx, cy);
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
		
		draw_rect(n, 600, 350, 350);
	}

}
