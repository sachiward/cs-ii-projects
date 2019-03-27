public class ttt {

	static void player_x(char [][] board) {
		System.out.printf("Pick an open spot, 1 through 9.  An 'x' will be placed there   ");
		int input;
		input = StdIn.readInt();	
		if (input == 1) {board[0][0] = 'x';}
		if (input == 2) {board[0][1] = 'x';}
		if (input == 3) {board[0][2] = 'x';}
		if (input == 4) {board[1][0] = 'x';}
		if (input == 5) {board[1][1] = 'x';}
		if (input == 6) {board[1][2] = 'x';}
		if (input == 7) {board[2][0] = 'x';}
		if (input == 8) {board[2][1] = 'x';}
		if (input == 9) {board[2][2] = 'x';}
	}

	static void player_o(char [][] board) {
		System.out.printf("Pick an open spot, 1 through 9.  An 'o' will be placed there   ");
		int input;
		input = StdIn.readInt();	
		if (input == 1) {board[0][0] = 'o';}
		if (input == 2) {board[0][1] = 'o';}
		if (input == 3) {board[0][2] = 'o';}
		if (input == 4) {board[1][0] = 'o';}
		if (input == 5) {board[1][1] = 'o';}
		if (input == 6) {board[1][2] = 'o';}
		if (input == 7) {board[2][0] = 'o';}
		if (input == 8) {board[2][1] = 'o';}
		if (input == 9) {board[2][2] = 'o';}
	}

	static void print_board(char [][] board){
		System.out.printf("\n");
		System.out.printf(" %c | %c | %c\n", board[2][0], board[2][1], board[2][2]);
		System.out.printf("-----------\n");
		System.out.printf(" %c | %c | %c\n", board[1][0], board[1][1], board[1][2]);
		System.out.printf("-----------\n");
		System.out.printf(" %c | %c | %c\n", board[0][0], board[0][1], board[0][2]);
		System.out.printf("\n");
		
	}
	
	static void check_win(char [][] board){
		if (board[0][0] == 'x' && board[0][1] == 'x' && board[0][2] == 'x') {
			System.out.printf("PLAYER 'X' WINS!!!\n\n");
			System.exit(0);
		}
		if (board[0][0] == 'o' && board[0][1] == 'o' && board[0][2] == 'o') {
			System.out.printf("PLAYER 'O' WINS!!!\n\n");
			System.exit(0);
		}

		if (board[1][0] == 'x' && board[1][1] == 'x' && board[1][2] == 'x') {
			System.out.printf("PLAYER 'X' WINS!!!\n\n");
			System.exit(0);
		}
		if (board[1][0] == 'o' && board[1][1] == 'o' && board[1][2] == 'o') {
			System.out.printf("PLAYER 'O' WINS!!!\n\n");
			System.exit(0);
		}

		if (board[2][0] == 'x' && board[2][1] == 'x' && board[2][2] == 'x') {
			System.out.printf("PLAYER 'X' WINS!!!\n\n");
			System.exit(0);
		}
		if (board[2][0] == 'o' && board[2][1] == 'o' && board[2][2] == 'o') {
			System.out.printf("PLAYER 'O' WINS!!!\n\n");
			System.exit(0);
		}

		if (board[0][0] == 'x' && board[1][0] == 'x' && board[2][0] == 'x') {
			System.out.printf("PLAYER 'X' WINS!!!\n\n");
			System.exit(0);
		}
		if (board[0][0] == 'o' && board[1][0] == 'o' && board[2][0] == 'o') {
			System.out.printf("PLAYER 'O' WINS!!!\n\n");
			System.exit(0);
		}

		if (board[0][1] == 'x' && board[1][1] == 'x' && board[2][1] == 'x') {
			System.out.printf("PLAYER 'X' WINS!!!\n\n");
			System.exit(0);
		}
		if (board[0][1] == 'o' && board[1][1] == 'o' && board[2][1] == 'o') {
			System.out.printf("PLAYER 'O' WINS!!!\n\n");
			System.exit(0);
		}

		if (board[0][2] == 'x' && board[1][2] == 'x' && board[2][2] == 'x') {
			System.out.printf("PLAYER 'X' WINS!!!\n\n");
			System.exit(0);
		}
		if (board[0][2] == 'o' && board[1][2] == 'o' && board[2][2] == 'o') {
			System.out.printf("PLAYER 'O' WINS!!!\n\n");
			System.exit(0);
		}

		if (board[0][0] == 'x' && board[1][1] == 'x' && board[2][2] == 'x') {
			System.out.printf("PLAYER 'X' WINS!!!\n\n");
			System.exit(0);
		}
		if (board[0][0] == 'o' && board[1][1] == 'o' && board[2][2] == 'o') {
			System.out.printf("PLAYER 'O' WINS!!!\n\n");
			System.exit(0);
		}

		if (board[0][2] == 'x' && board[1][1] == 'x' && board[2][0] == 'x') {
			System.out.printf("PLAYER 'X' WINS!!!\n\n");
			System.exit(0);
		}
		if (board[0][2] == 'o' && board[1][1] == 'o' && board[2][0] == 'o') {
			System.out.printf("PLAYER 'O' WINS!!!\n\n");
			System.exit(0);
		}
		
	}
	
	public static void main(String[] args) {

		char[][] board = new char[3][3];

		// initialize board
		board[0][0] = '1';
		board[0][1] = '2';
		board[0][2] = '3';
		board[1][0] = '4';
		board[1][1] = '5';
		board[1][2] = '6';
		board[2][0] = '7';
		board[2][1] = '8';
		board[2][2] = '9';
		///////////////////
		
		print_board(board);	
		int q;
		q=1;	
		while (q<9){
		player_x(board);
		print_board(board);
		check_win(board);
		player_o(board);
		print_board(board);
		check_win(board);
		q++;
}
	
		System.out.printf("THIS GAME ENDS IN A DRAW\n\n");

	}
}