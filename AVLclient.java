package tuhinwork;

public class AVLclient {
	public static void main(String[] args) {
		int[] arr = { 20, 25, 30, 10, 5, 15, 27, 19, 16 };

		AVLtree tree = new AVLtree();

		for (int i = 0; i < arr.length; i++) {
			tree.insert(arr[i]);
		}

		tree.display();
	
	}
	
	

}
