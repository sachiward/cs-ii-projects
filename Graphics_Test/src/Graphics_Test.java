
public class Graphics_Test {

	public static void main(String[] args) {
		StdDraw.enableDoubleBuffering();
		StdDraw.setCanvasSize(900, 900);
		StdDraw.setScale(0, 899);
		StdDraw.setPenRadius(0);
		StdDraw.setPenColor(78, 242, 204);
		StdDraw.filledCircle(450, 450, 200);
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.line(450, 0, 450, 899);
		StdDraw.line(0, 450, 899, 450);
		
	
		
		StdDraw.show();
		
	}

}
