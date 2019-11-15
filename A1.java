package tuhinwork;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {

		System.out.println("hola");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of B");
		int a = 1;
		int b = sc.nextInt();

		int sum = 0;

		for (int i = 0; i < b; i++) {

			System.out.println(sum);

			sum = a + sum;

		}
		System.out.println(isPrime(17));
		// System.out.println(Factorial(b));
	}

	public static boolean isPrime(int n) {

		if (n % 2 == 0 || n % 3 == 0) {
			return false;
		}
		for (int i = 4; i < n; i++) {

			if (n % i == 0) {
				return false;
			}

		}
		return true;
	}

	public static int Factorial(int n) {

		if (n != 0) {
			return n * Factorial(n - 1);

		} else
			return 1;

	}

}