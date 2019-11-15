package tuhinwork;

public class stackUSingQuepushEff {
	DynQue primary = new DynQue();

	public void push(int item) throws Exception {

		try {
			primary.enqueue(item);
		} catch (Exception e) {
			throw new Exception("Stack is Full.");
		}

	}

	public int pop() throws Exception {

		try {
			DynQue helper = new DynQue();

			while (primary.size() != 1) {
				helper.enqueue(primary.dequeue());
			}

			int rv = primary.dequeue();

			primary = helper;

			return rv;
		} catch (Exception e) {
			throw new Exception("Stack is Empty.");
		}

	}

	public int peek() throws Exception {

		try {
			DynQue helper = new DynQue();

			while (primary.size() != 1) {
				helper.enqueue(primary.dequeue());
			}

			int rv = primary.dequeue();
			helper.enqueue(rv);
			primary = helper;

			return rv;
		} catch (Exception e) {
			throw new Exception("Stack is Empty.");
		}

	}

	public int size() {

		return primary.size();

	}

	public boolean isEmpty() {
		return primary.isEmpty();
	}

	public boolean isFull() {
		return primary.isFull();
	}

	public void display() throws Exception {
		display(0);
	}

	private void display(int count) throws Exception {

		if (count == primary.size()) {
			return;
		}

		int temp = primary.dequeue();
		primary.enqueue(temp);

		display(count + 1);

		System.out.println(temp);

	}
}
