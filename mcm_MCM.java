package tuhinwork;

public class mcm_MCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int MCM(int[] arr, int si, int ei) {
		if (si + 1 == ei) {
			return 0;
		}
		int min = Integer.MAX_VALUE;
		for (int k = si + 1; k <= ei - 1; k++) {
			int fp = MCM(arr, si, k);
			int sp = MCM(arr, k, ei);
			int sw = arr[si] * arr[k] * arr[ei];
			int total = fp + sp + sw;
			if (total < min) {
				min = total;
			}
		}
		return min;
	}
	public static int MCMTD(int[] arr, int si, int ei, int[][] strg) {
		if (si + 1 == ei) {
			return 0;
		}
		if (strg[si][ei] != 0) {
			return strg[si][ei];
		}
		int min = Integer.MAX_VALUE;
		for (int k = si + 1; k <= ei - 1; k++) {
			int fp = MCMTD(arr, si, k, strg);
			int sp = MCMTD(arr, k, ei, strg);
			int sw = arr[si] * arr[k] * arr[ei];
			int total = fp + sp + sw;
			if (total < min) {
				min = total;
			}
		}
		strg[si][ei] = min;
		return min;
	}
	public static int MCMBU(int[] arr) {
		int n = arr.length;
		int[][] strg = new int[n][n];
		for (int slide = 1; slide <= n - 2; slide++) {
			for (int si = 0; si <= n - slide - 2; si++) {
				int ei = si + slide + 1;
				int min = Integer.MAX_VALUE;
				for (int k = si + 1; k <= ei - 1; k++) {
					int fp = strg[si][k];
					int sp = strg[k][ei];
					int sw = arr[si] * arr[k] * arr[ei];
					int total = fp + sp + sw;
					if (total < min) {
						min = total;
					}
				}
				strg[si][ei] = min;
			}
		}
		return strg[0][n - 1];
	}
}
