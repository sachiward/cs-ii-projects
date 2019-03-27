
public class box_graphic {

	static void draw_box(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4, double n){
		double x5, x6, x7, x8, y5, y6, y7, y8;
		
		if(n>0){
		StdDraw.line(x1, y1, x2, y2);
		StdDraw.line(x2, y2, x3, y3);
		StdDraw.line(x3, y3, x4, y4);
		StdDraw.line(x4, y4, x1, y1);
		StdDraw.show();
		
		x5=(x1+x2)/2; x6=(x2+x3)/2; x7=(x3+x4)/2; x8=(x4+x1)/2;
		y5=(y1+y2)/2; y6=(y2+y3)/2; y7=(y3+y4)/2; y8=(y4+y1)/2;
	
		draw_box(x5, y5, x6, y6, x7, y7, x8, y8, n-1);
		
		}
	}
	
	public static void main(String[] args) {
		double n;
		
		System.out.printf("Please type in a value for n: ");
		n = StdIn.readDouble();
		
		StdDraw.enableDoubleBuffering();
		StdDraw.setCanvasSize(600, 600);
		StdDraw.clear(StdDraw.BLACK);
		StdDraw.setScale(0, 599);
		StdDraw.setPenRadius(0.0025);
		StdDraw.setPenColor(StdDraw.WHITE);
		
		draw_box(15, 585, 585, 585, 585, 15, 15, 15, n);
		
		StdDraw.show();

	}

}
