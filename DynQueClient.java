package tuhinwork;

public class DynQueClient {
	public static void main(String[] args) throws Exception {

		DynQue dq = new DynQue();

		dq.enqueue(10);
		dq.enqueue(20);
		dq.enqueue(30);
		dq.enqueue(40);
		dq.enqueue(50);
		System.out.println(dq.dequeue());
		System.out.println(dq.dequeue());
		dq.enqueue(60);
		dq.enqueue(70);
		dq.enqueue(80);

		dq.display();

//		displayReverse(dq, 0);
		actualReverse(dq);

		dq.display();

	}

	public static void displayReverse(DynQue q, int count) throws Exception {

		if (count == q.size()) {
			return;
		}

		int temp = q.dequeue();
		q.enqueue(temp);

		displayReverse(q, count + 1);

		System.out.println(temp);

	}

	public static void actualReverse(DynQue q) throws Exception {

		if (q.isEmpty()) {
			return;
		}

		int temp = q.dequeue();
		actualReverse(q);
		q.enqueue(temp);

	}
}
