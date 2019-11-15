package tuhinwork;

import java.util.Arrays;

public class mazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int mazePathTD(int cr, int cc, int er, int ec, int[][] strg) {
		if (cr == er && cc == ec) {
			return 1;
		}
		if (cr > er || cc > ec) {
			return 0;
		}
		if (strg[cr][cc] != 0) {
			return strg[cr][cc];
		}
		int ch = mazePathTD(cr, cc + 1, er, ec, strg);
		int cv = mazePathTD(cr + 1, cc, er, ec, strg);
		strg[cr][cc] = ch + cv;
		return ch + cv;
	}

	public static int mazePathBU(int er, int ec) {
		int[][] strg = new int[er + 2][ec + 2];
		for (int row = er; row >= 0; row--) {
			for (int col = ec; col >= 0; col--) {
				if (row == er && col == ec) {
					strg[row][col] = 1;
				} else {
					strg[row][col] = strg[row + 1][col] + strg[row][col + 1];
				}
			}
		}
		return strg[0][0];
	}

	public static int mazePathBUSE(int er, int ec) {
		int[] strg = new int[ec + 1];
		Arrays.fill(strg, 1);
		for (int slide = er - 1; slide >= 0; slide--) {
			for (int col = ec; col >= 0; col--) {
				if (col == ec) {
					strg[col] = 1;
				} else {
					strg[col] = strg[col] + strg[col + 1];
				}
			}
		}
		return strg[0];
	}

	public static int mazePathBUSED(int er, int ec) {
		int diag = 0;
		int[] strg = new int[ec + 1];
		Arrays.fill(strg, 1);
		for (int slide = er - 1; slide >= 0; slide--) {
			for (int col = ec; col >= 0; col--) {
				if (col == ec) {
					strg[col] = 1;
					diag = 1;
				} else {
					int sum = strg[col] + strg[col + 1] + diag;
					diag = strg[col];
					strg[col] = sum;
				}
			}
}
		return strg[0];
	}
}
