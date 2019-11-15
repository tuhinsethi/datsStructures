package tuhinwork;

public class nQueens {
	static int counter = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void NQueens(boolean[][] board, int row, String ans) {
		if (row == board.length) {
			System.out.println(ans);
			return;
		}
		for (int col = 0; col < board[0].length; col++) {
			if (isItSafeToPlaceQueen(board, row, col)) {
				board[row][col] = true;
				NQueens(board, row + 1, ans + "{" + row + "-" + col + "}");
				board[row][col] = false;
			}
		}
	}
	public static void display(boolean[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("----------------------");
	}
	public static boolean isItSafeToPlaceQueen(boolean[][] board, int row, int col) {
		// vertically up
		int r = row - 1;
		int c = col;
		while (r >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
		}
		// diagonally left
		r = row - 1;
		c = col - 1;
		while (r >= 0 && c >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c--;
		}
		// diagonally right
		r = row - 1;
		c = col + 1;
		while (r >= 0 && c < board[0].length) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c++;
		}
		return true;
	}
	public static void NQueens2(boolean[][] board, int row, String ans, int qpsf, int total) {
		if (qpsf == total) {
			System.out.println(ans);
			return;
		}
		if (row == board.length) {
			return;
		}
		for (int col = 0; col < board[0].length; col++) {
			if (isItSafeToPlaceQueen(board, row, col)) {
				board[row][col] = true;
				NQueens2(board, row + 1, ans + "{" + row + "-" + col + "}", qpsf + 1, total);
				board[row][col] = false;
			}
		}
		NQueens2(board, row + 1, ans, qpsf, total);
	}
}
