
/*public class koch {

	static void kcurve (double n, double x1, double y1, double angle, double length){
	double x2, y2, angle2;
			
			x2=x1+((1/3)*length)*(Math.cos(angle));
			y2=y1+((1/3)*length)*(Math.sin(angle));
			
			StdDraw.line(x1, y1, x2, y2);
			StdDraw.show();
			
			if () {
			
				//odd
				angle2=angle+(Math.PI/3);
			}
			else {
				angle2=angle-(Math.PI*(2/3));

			}
			kcurve(n-1, x2, y2, angle, length);
		}
	}

	public static void main(String[] args) {
		double n;
		System.out.printf("Please type in a recursive depth: ");
		n = StdIn.readDouble();
		
		
		StdDraw.enableDoubleBuffering();
		StdDraw.setCanvasSize(600, 600);
		StdDraw.setScale(0, 599);
		StdDraw.setPenRadius(0.0025);

		kcurve(n, 50, 200, 0, 500);
		
	}

}

public class koch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
*/

/*public class Koch {

    // Koch curve of order n
    public static void koch(int n, double size) {
        if (n == 0) StdDraw.goForward(size);
        else {
            koch(n-1, size);
            StdDraw.rotate(60);
            koch(n-1, size);
            StdDraw.rotate(-120);
            koch(n-1, size);
            StdDraw.rotate(60);
            koch(n-1, size);
        }
    }

    public static void main(String args[]) {
        int N = Integer.parseInt(args[0]);
        int width = 512;
        int height = (int) (2 * width / Math.sqrt(3));
        double size = width / Math.pow(3.0, N);
        StdDraw.create(width, height);

        // three Koch curves in the shape of an equilateral triangle
        StdDraw.go(0, width * Math.sqrt(3) / 2);
        StdDraw.penDown();
        koch(N, size);
        StdDraw.rotate(-120);
        koch(N, size);
        StdDraw.rotate(-120);
        koch(N, size);
        StdDraw.show();
    }
}

*/
