package tuhinwork;

public class GTclient {
	// 10 3 20 2 50 0 600 0 30 1 70 0 40 2 80 0 90 0
		public static void main(String[] args) {

		
			GenericTree gt = new GenericTree();
			gt.display();
			System.out.println(gt.size());
			System.out.println(gt.max());
			System.out.println(gt.find(800));
			System.out.println(gt.ht());

			// gt.preorder();
			// gt.postorder();
			// // gt.linearize();
			// gt.display();
			// gt.levelOrder();
			// gt.levelOrderLW();
			// gt.levelOrderZZ();

			gt.multiSolver(30);}
}
