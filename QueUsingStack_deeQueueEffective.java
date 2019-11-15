package tuhinwork;

public class QueUsingStack_deeQueueEffective {
	DynStack primary = new DynStack();

	public void enqueue(int item) throws Exception {

		try {

			DynStack helper = new DynStack();

			while (!primary.isEmpty()) {
				helper.push(primary.pop());
			}

			primary.push(item);

			while (!helper.isEmpty()) {
				primary.push(helper.pop());
			}

		} catch (Exception e) {
			throw new Exception("Queue is Full.");
		}
	}

	public int dequeue(int item) throws Exception {

		try {
			return primary.pop();
		} catch (Exception e) {
			throw new Exception("Queue is Empty.");
		}
	}

	public int getFront(int item) throws Exception {

		try {
			return primary.peek();
		} catch (Exception e) {
			throw new Exception("Queue is Empty.");
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

	public void display() {
		primary.display();
	}

}

