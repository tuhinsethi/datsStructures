package tuhinwork;

public class binary2decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		binary2dec(101100);
		dec2Binary(44);
	}

	public static void binary2dec(int n) {
		int ans = 0;
		int multiplier = 1;

		while (n != 0) {
			int rem = n % 10;
			ans = rem * multiplier + ans;
			multiplier = multiplier * 2;

			n=n/10;
	
		
		}
		System.out.println(ans);
	}
	public static void dec2Binary(int n) {
		int ans=0;
		int mul=1;
		
		while(n!=0) {
			int rem = n%2;
			ans=rem*mul+ans;
			mul=mul*10;
			n=n/2;
			
		}
		System.out.println(ans);
	}

}
