
public class midterm1 {

	static void draw_circles(int n, int t, double cx, double cy, double rad) {

		if (t < n) {
			rad = rad / 2;

			if (t % 2 == 1) {
				// odd, horizontal
				double ucy = cy + rad;
				double lcy = cy - rad;

				StdDraw.setPenColor(0, 0, 0);
				StdDraw.filledCircle(cx, ucy, rad);
				StdDraw.filledCircle(cx, lcy, rad);
				StdDraw.show();

				draw_circles(n, t + 1, cx, ucy, rad);
				draw_circles(n, t + 1, cx, lcy, rad);
			}

			if (t % 2 == 0) {
				// even, vertical
				double lcx = cx - rad;
				double rcx = cx + rad;

				StdDraw.setPenColor(255, 0, 0);
				StdDraw.filledCircle(lcx, cy, rad);
				StdDraw.filledCircle(rcx, cy, rad);
				StdDraw.show();

				draw_circles(n, t + 1, lcx, cy, rad);
				draw_circles(n, t + 1, rcx, cy, rad);
			}
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

		StdDraw.setPenColor(255, 0, 0);
		StdDraw.filledCircle(400, 400, 300);
		StdDraw.show();
		
		draw_circles(n, 1, 400.0, 400.0, 300.0);
	}

}
