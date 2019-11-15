package tuhinwork;

public class boardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int boardPath(int curr, int end) {
		if (curr == end) {
			return 1;
		}
		if (curr > end) {
			return 0;
		}
		int sum = 0;
		for (int dice = 1; dice <= 6; dice++) {
			sum += boardPath(curr + dice, end);
		}
		return sum;
	}
	public static int boardPathTD(int curr, int end, int[] strg) {
		if (curr == end) {
			return 1;
		}
		if (curr > end) {
			return 0;
		}
		if (strg[curr] != 0) {
			return strg[curr];
		}
		int sum = 0;
		for (int dice = 1; dice <= 6; dice++) {
			sum += boardPathTD(curr + dice, end, strg);
		}
		strg[curr] = sum;
		return sum;
	}
	public static int boardPathBU(int n) {
		int[] strg = new int[n + 6];
		strg[n] = 1;
		for (int i = n - 1; i >= 0; i--) {
			strg[i] = strg[i + 1] + strg[i + 2] + strg[i + 3] + strg[i + 4] + strg[i + 5] + strg[i + 6];
		}
		return strg[0];
	}
	public static int boardPathBUSE(int n) {
		int[] strg = new int[6];
		strg[0] = 1;
		for (int slide = 1; slide <= n; slide++) {
			int sum = strg[0] + strg[1] + strg[2] + strg[3] + strg[4] + strg[5];
			strg[5] = strg[4];
			strg[4] = strg[3];
			strg[3] = strg[2];
			strg[2] = strg[1];
			strg[1] = strg[0];
			strg[0] = sum;
		}
		return strg[0];
	}
}