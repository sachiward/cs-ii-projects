
public class WaitClickTest {

	static void waitClick(double [] p){
		while(StdDraw.mousePressed() == false) {}
		while(StdDraw.mousePressed() == true) {}
		p[0]=StdDraw.mouseX();
		p[1]=StdDraw.mouseY();
	}
	
	static void exitOnClick(){
		while(StdDraw.mousePressed() == false) {}
		System.exit(0);
	}
	
	public static void main(String[] args) {
		double [] p = new double[2];
		
		StdDraw.enableDoubleBuffering();
		StdDraw.setCanvasSize(900, 900);
		StdDraw.setScale(0, 899);
		StdDraw.setPenRadius(0);
		
		waitClick(p) ;
		StdDraw.filledRectangle(p[0], p[1], 20, 20);
		StdDraw.show();
		
		exitOnClick();

	}

}
