
public class tttgraphics {

	static void waitClick(double[] p) {
		while (StdDraw.mousePressed() == false) {
		}
		while (StdDraw.mousePressed() == true) {
		}
		p[0] = StdDraw.mouseX();
		p[1] = StdDraw.mouseY();
		
		if (p[0]<200 && p[0]>0){p[0]=100;}
		if (p[0]<400 && p[0]>200){p[0]=300;}
		if (p[0]<600 && p[0]>400){p[0]=500;}
		if (p[1]<200 && p[1]>0){p[1]=100;}
		if (p[1]<400 && p[1]>200){p[1]=300;}
		if (p[1]<600 && p[1]>400){p[1]=500;}
	}

	static void player_x(double [] p, char [][] board) {
		waitClick(p);	
		if (p[0] == 100 && p [1] == 100) {board[0][0] = 'x';}
		if (p[0] == 300 && p [1] == 100) {board[0][1] = 'x';}
		if (p[0] == 500 && p [1] == 100) {board[0][2] = 'x';}
		if (p[0] == 100 && p [1] == 300) {board[1][0] = 'x';}
		if (p[0] == 300 && p [1] == 300) {board[1][1] = 'x';}
		if (p[0] == 500 && p [1] == 300) {board[1][2] = 'x';}
		if (p[0] == 100 && p [1] == 500) {board[2][0] = 'x';}
		if (p[0] == 300 && p [1] == 500) {board[2][1] = 'x';}
		if (p[0] == 500 && p [1] == 500) {board[2][2] = 'x';}
		StdDraw.setPenRadius(.01);
		StdDraw.setPenColor(255, 0, 0);
		StdDraw.line(p[0]-60, p[1]+60, p[0]+60, p[1]-60);
		StdDraw.line(p[0]+60, p[1]+60, p[0]-60, p[1]-60);
		StdDraw.show();
	}
	
	static void player_o(double [] p, char [][] board) {
		waitClick(p);
		if (p[0] == 100 && p [1] == 100) {board[0][0] = 'o';}
		if (p[0] == 300 && p [1] == 100) {board[0][1] = 'o';}
		if (p[0] == 500 && p [1] == 100) {board[0][2] = 'o';}
		if (p[0] == 100 && p [1] == 300) {board[1][0] = 'o';}
		if (p[0] == 300 && p [1] == 300) {board[1][1] = 'o';}
		if (p[0] == 500 && p [1] == 300) {board[1][2] = 'o';}
		if (p[0] == 100 && p [1] == 500) {board[2][0] = 'o';}
		if (p[0] == 300 && p [1] == 500) {board[2][1] = 'o';}
		if (p[0] == 500 && p [1] == 500) {board[2][2] = 'o';}
		StdDraw.setPenRadius(.01);
		StdDraw.setPenColor(0, 75, 196);
		StdDraw.circle(p[0], p[1], 60);
		StdDraw.show();
	}
	
	static void check_win(char [][] board){
		if (board[0][0] == 'x' && board[0][1] == 'x' && board[0][2] == 'x') {
			StdDraw.setPenColor(0, 0, 0);
			StdDraw.filledRectangle(300, 300, 75, 20);
			StdDraw.setPenColor(255, 0, 0);
			StdDraw.text(300, 300, "PLAYER X WINS!");
			StdDraw.show();
			exitOnClick();
		}
		if (board[0][0] == 'o' && board[0][1] == 'o' && board[0][2] == 'o') {
			StdDraw.setPenColor(0, 0, 0);
			StdDraw.filledRectangle(300, 300, 75, 20);
			StdDraw.setPenColor(0, 75, 196);
			StdDraw.text(300, 300, "PLAYER O WINS!");
			StdDraw.show();
			exitOnClick();
		}

		if (board[1][0] == 'x' && board[1][1] == 'x' && board[1][2] == 'x') {
			StdDraw.setPenColor(0, 0, 0);
			StdDraw.filledRectangle(300, 300, 75, 20);
			StdDraw.setPenColor(255, 0, 0);
			StdDraw.text(300, 300, "PLAYER X WINS!");
			StdDraw.show();
			exitOnClick();
		}
		if (board[1][0] == 'o' && board[1][1] == 'o' && board[1][2] == 'o') {
			StdDraw.setPenColor(0, 0, 0);
			StdDraw.filledRectangle(300, 300, 75, 20);
			StdDraw.setPenColor(0, 75, 196);
			StdDraw.text(300, 300, "PLAYER O WINS!");
			StdDraw.show();
			exitOnClick();
		}

		if (board[2][0] == 'x' && board[2][1] == 'x' && board[2][2] == 'x') {
			StdDraw.setPenColor(0, 0, 0);
			StdDraw.filledRectangle(300, 300, 75, 20);
			StdDraw.setPenColor(255, 0, 0);
			StdDraw.text(300, 300, "PLAYER X WINS!");
			StdDraw.show();
			exitOnClick();
		}
		if (board[2][0] == 'o' && board[2][1] == 'o' && board[2][2] == 'o') {
			StdDraw.setPenColor(0, 0, 0);
			StdDraw.filledRectangle(300, 300, 75, 20);
			StdDraw.setPenColor(0, 75, 196);
			StdDraw.text(300, 300, "PLAYER O WINS!");
			StdDraw.show();
			exitOnClick();
		
		}

		if (board[0][0] == 'x' && board[1][0] == 'x' && board[2][0] == 'x') {
			StdDraw.setPenColor(0, 0, 0);
			StdDraw.filledRectangle(300, 300, 75, 20);
			StdDraw.setPenColor(255, 0, 0);
			StdDraw.text(300, 300, "PLAYER X WINS!");
			StdDraw.show();
			exitOnClick();
			
		}
		if (board[0][0] == 'o' && board[1][0] == 'o' && board[2][0] == 'o') {
			StdDraw.setPenColor(0, 0, 0);
			StdDraw.filledRectangle(300, 300, 75, 20);
			StdDraw.setPenColor(0, 75, 196);
			StdDraw.text(300, 300, "PLAYER O WINS!");
			StdDraw.show();
			exitOnClick();
		}

		if (board[0][1] == 'x' && board[1][1] == 'x' && board[2][1] == 'x') {
			StdDraw.setPenColor(0, 0, 0);
			StdDraw.filledRectangle(300, 300, 75, 20);
			StdDraw.setPenColor(255, 0, 0);
			StdDraw.text(300, 300, "PLAYER X WINS!");
			StdDraw.show();
			exitOnClick();
		
		}
		if (board[0][1] == 'o' && board[1][1] == 'o' && board[2][1] == 'o') {
			StdDraw.setPenColor(0, 0, 0);
			StdDraw.filledRectangle(300, 300, 75, 20);
			StdDraw.setPenColor(0, 75, 196);
			StdDraw.text(300, 300, "PLAYER O WINS!");
			StdDraw.show();
			exitOnClick();

		}

		if (board[0][2] == 'x' && board[1][2] == 'x' && board[2][2] == 'x') {
			StdDraw.setPenColor(0, 0, 0);
			StdDraw.filledRectangle(300, 300, 75, 20);
			StdDraw.setPenColor(255, 0, 0);
			StdDraw.text(300, 300, "PLAYER X WINS!");
			StdDraw.show();
			exitOnClick();

		}
		if (board[0][2] == 'o' && board[1][2] == 'o' && board[2][2] == 'o') {
			StdDraw.setPenColor(0, 0, 0);
			StdDraw.filledRectangle(300, 300, 75, 20);
			StdDraw.setPenColor(0, 75, 196);
			StdDraw.text(300, 300, "PLAYER O WINS!");
			StdDraw.show();
			exitOnClick();
	
		}

		if (board[0][0] == 'x' && board[1][1] == 'x' && board[2][2] == 'x') {
			StdDraw.setPenColor(0, 0, 0);
			StdDraw.filledRectangle(300, 300, 75, 20);
			StdDraw.setPenColor(255, 0, 0);
			StdDraw.text(300, 300, "PLAYER X WINS!");
			StdDraw.show();
			exitOnClick();
	
		}
		if (board[0][0] == 'o' && board[1][1] == 'o' && board[2][2] == 'o') {
			StdDraw.setPenColor(0, 0, 0);
			StdDraw.filledRectangle(300, 300, 75, 20);
			StdDraw.setPenColor(0, 75, 196);
			StdDraw.text(300, 300, "PLAYER O WINS!");
			StdDraw.show();
			exitOnClick();

		}

		if (board[0][2] == 'x' && board[1][1] == 'x' && board[2][0] == 'x') {
			StdDraw.setPenColor(0, 0, 0);
			StdDraw.filledRectangle(300, 300, 75, 20);
			StdDraw.setPenColor(255, 0, 0);
			StdDraw.text(300, 300, "PLAYER X WINS!");
			StdDraw.show();
			exitOnClick();
	
		}
		if (board[0][2] == 'o' && board[1][1] == 'o' && board[2][0] == 'o') {
			StdDraw.setPenColor(0, 0, 0);
			StdDraw.filledRectangle(300, 300, 75, 20);
			StdDraw.setPenColor(0, 75, 196);
			StdDraw.text(300, 300, "PLAYER O WINS!");
			StdDraw.show();
			exitOnClick();
		}
		
		
		}

	static void exitOnClick(){
		while(StdDraw.mousePressed() == false) {}
		System.exit(0);
	}
	
	public static void main(String[] args) {
		double[] p = new double [2];
		char [][] board = new char [3][3];
		
	
		//initialize board/////////////
		StdDraw.enableDoubleBuffering();
		StdDraw.setCanvasSize(600, 600);
		StdDraw.setScale(0, 599);
		StdDraw.setPenRadius(.0025);
		StdDraw.line(200, 0, 200, 599);
		StdDraw.line(0, 200, 599, 200);
		StdDraw.line(400, 0, 400, 599);
		StdDraw.line(0, 400, 599, 400);
		///////////////////////////////
		StdDraw.show();
				
		int q;
		q=1;	
		while (q < 6) {
			check_win(board);
			player_x(p, board);
			check_win(board);
			player_o(p, board);
			check_win(board);
			q++;
		}
			StdDraw.setPenColor(0, 0, 0);
			StdDraw.filledRectangle(300, 300, 75, 20);
			StdDraw.setPenColor(255, 255, 255);
			StdDraw.text(300, 300, "IT'S A DRAW");
			StdDraw.show();
			exitOnClick();

	}
}
