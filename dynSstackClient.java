package tuhinwork;

public class dynSstackClient {
	public static void main(String[] args) throws Exception {

		DynStack ds = new DynStack();
		ds.push(10);
		ds.push(20);
		ds.push(30);
		ds.push(40);
		ds.push(50);
		ds.push(60);
		ds.push(70);
		ds.display();

		actualReverse(ds, new DynStack());

		ds.display();

		int[] arr = { 50, 30, 20, 40, 25, 45, 60, 70 };

		int[] ans = nextGreaterElementIndex(arr);
		for (int val : ans) {
			System.out.println(val);
		}

		int[] arr1 = { 100, 20, 30, 90, 60, 50, 70, 80, 120, 110, 50 };

		int[] span = stockSpan(arr1);
		for (int val : span) {
			System.out.println(val);
		}
	}

	public static void displayReverse(DynStack s) throws Exception {

		if (s.size() == 0) {
			return;
		}

		int temp = s.pop();
		displayReverse(s);

		System.out.println(temp);
		s.push(temp);

	}

	public static void actualReverse(DynStack s, DynStack helper) throws Exception {

		if (s.size() == 0) {

			if (helper.size() == 0) {
				return;
			}

			int temph = helper.pop();
			actualReverse(s, helper);
			s.push(temph);

			return;
		}
		int temp = s.pop();
		helper.push(temp);

		actualReverse(s, helper);

	}

	public static void nextGreaterElement(int[] arr) throws Exception {

		DynStack s = new DynStack();

		for (int i = 0; i < arr.length; i++) {

			while (!s.isEmpty() && s.peek() < arr[i]) {
				System.out.println(s.pop() + " -> " + arr[i]);
			}

			s.push(arr[i]);
		}

		while (!s.isEmpty()) {
			System.out.println(s.pop() + " -> -1");
		}

	}

	public static int[] nextGreaterElementIndex(int[] arr) throws Exception {

		int[] ans = new int[arr.length];

		DynStack s = new DynStack();

		for (int i = 0; i < arr.length; i++) {

			while (!s.isEmpty() && arr[s.peek()] < arr[i]) {
				ans[s.pop()] = arr[i];
			}

			s.push(i);
		}

		while (!s.isEmpty()) {
			ans[s.pop()] = -1;
		}

		return ans;

	}

	public static int[] stockSpan(int[] arr) throws Exception {

		DynStack stack = new DynStack();

		int[] ans = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {

			while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
				stack.pop();
			}

			if (stack.isEmpty()) {
				ans[i] = i + 1;
			} else {
				ans[i] = i - stack.peek();
			}

			stack.push(i);

		}

		return ans;

	}
}
