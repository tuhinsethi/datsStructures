package tuhinwork;

import java.util.Scanner;

public class suduku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		int[][] arr = new int[9][9];
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				arr[row][col] = scn.nextInt();
			}

		}

		sudoku(arr, 0, 0);
	}
	public static void sudoku(int[][] arr, int row, int col) {

		if (row == arr.length) {
			display(arr);
			return;
		}

		if (col == arr[0].length) {
			sudoku(arr, row + 1, 0);
			return;
		}

		if (arr[row][col] != 0) {
			sudoku(arr, row, col + 1);
			return;
		}

		// self work : 1->9
		for (int i = 1; i <= 9; i++) {

			if (isItSafe(arr, row, col, i)) {
				arr[row][col] = i;

				sudoku(arr, row, col + 1);

				arr[row][col] = 0;
			}
		}

	}

	public static void display(int[][] arr) {

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
		System.out.println("-------------------------");
	}
	public static boolean isItSafe(int[][] arr, int row, int col, int val) {

		return isItSafeRow(arr, row, val) && isItSafeCol(arr, col, val) && isItSafeCell(arr, row, col, val);
	}

	public static boolean isItSafeRow(int[][] arr, int row, int val) {

		for (int col = 0; col < arr[0].length; col++) {
			if (arr[row][col] == val) {
				return false;
			}
		}

		return true;
	}

	public static boolean isItSafeCol(int[][] arr, int col, int val) {

		for (int row = 0; row < arr.length; row++) {
			if (arr[row][col] == val) {
				return false;
			}
		}

		return true;
	}

	public static boolean isItSafeCell(int[][] arr, int row, int col, int val) {

		int rs = row - row % 3;
		int cs = col - col % 3;

		for (int r = rs; r < rs + 3; r++) {

			for (int c = cs; c < cs + 3; c++) {

				if (arr[r][c] == val) {
					return false;
				}
			}
		}

		return true;

	}

}
