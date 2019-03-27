
public class koch {

	static void randomRGB(int[] rgb) {
		rgb[0] = (int) (Math.random() * 255);
		rgb[1] = (int) (Math.random() * 255);
		rgb[2] = (int) (Math.random() * 255);

	}

	static void kcurve(double n, double x1, double y1, double angle, double length) {
		double angle2, angle3, angle4, cangle;
		double x2, y2, x3, y3, x4, y4, x5, y5;

		// angles//////////////////////
		cangle = angle;
		angle2 = cangle + (Math.PI / 3);
		cangle = angle2;
		angle3 = cangle - (Math.PI * 2 / 3);
		cangle = angle3;
		angle4 = cangle + (Math.PI / 3);
		cangle = angle4;
		//////////////////////////////

		// points///////////////////////////////
		x2 = x1 + ((1.0 / 3.0) * length) * (Math.cos(angle));
		y2 = y1 + ((1.0 / 3.0) * length) * (Math.sin(angle));

		x3 = x2 + ((1.0 / 3.0) * length) * (Math.cos(angle2));
		y3 = y2 + ((1.0 / 3.0) * length) * (Math.sin(angle2));

		x4 = x3 + ((1.0 / 3.0) * length) * (Math.cos(angle3));
		y4 = y3 + ((1.0 / 3.0) * length) * (Math.sin(angle3));

		x5 = x4 + ((1.0 / 3.0) * length) * (Math.cos(angle4));
		y5 = y4 + ((1.0 / 3.0) * length) * (Math.sin(angle4));
		////////////////////////////////////////

		if (n > 0) {

			kcurve(n - 1, x1, y1, angle, length / 3);
			kcurve(n - 1, x2, y2, angle2, length / 3);
			kcurve(n - 1, x3, y3, angle3, length / 3);
			kcurve(n - 1, x4, y4, angle4, length / 3);

		}

		else {

			StdDraw.line(x1, y1, x2, y2);
			StdDraw.line(x2, y2, x3, y3);
			StdDraw.line(x3, y3, x4, y4);
			StdDraw.line(x4, y4, x5, y5);
			StdDraw.show();

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
