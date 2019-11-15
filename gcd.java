package tuhinwork;

import java.util.Scanner;

public class gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int divident = sc.nextInt(); int divisor = sc.nextInt();
		 * 
		 * while (divident % divisor != 0) {
		 * 
		 * int rem= divident%divisor; divident= divisor; divisor=rem;
		 * 
		 * } System.out.println(divisor);
		 */
		pattern(5);

	}

	public static void pattern(int n) {
		int nst = 1;
		int nsp = n - 1;

		int row = 1;
		while (row <= n) {
//work

			int csp = 1;
			while (csp <= nsp) {
				System.out.print("-");
				csp++;

			}

			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}

			// update
			row = row + 1;
			nst = nst + 2;
			nsp = nsp - 1;
			System.out.println();
		}

	}

}
