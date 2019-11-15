package tuhinwork;

public class fibb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = fibonacci(8);
		//System.out.println(a);
		int[]strg = {};
		//System.out.println(fibonacciTD(0,strg));
		System.out.println(FibonaaciBU(8));
	}

	public static int fibonacci(int n) {
		if (n == 0 || n == 1) {
			return n;
		}

		int fnm1 = fibonacci(n - 1);
		int fnm2 = fibonacci(n - 2);
		int fn = fnm1 + fnm2;
		return fn;
	}

	public static int fibonacciTD(int n, int[] strg) {
		if (n == 0 || n == 1) {
			return n;
		}
		// use
		if (strg[n] != 0) {
			return strg[n];
		}
		int fnm1 = fibonacciTD(n - 1, strg);
		int fnm2 = fibonacciTD(n - 2, strg);
		int fn = fnm1 + fnm2;
		// ans store
		strg[n] = fn;
		return fn;
	}

	public static int FibonaaciBU(int n) {
		int[] strg = new int[n + 1];
		strg[0] = 0;
		strg[1] = 1;
		for (int i = 2; i < strg.length; i++) {
			strg[i] = strg[i - 1] + strg[i - 2];
		}
		return strg[n];
	}

	public static int FibonacciBUSE(int n) {
		int[] strg = new int[2];
		strg[0] = 0;
		strg[1] = 1;
		for (int slide = 1; slide <= n - 1; slide++) {
			int sum = strg[0] + strg[1];
			strg[0] = strg[1];
			strg[1] = sum;
		}
		return strg[1];
	}
}
