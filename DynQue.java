package tuhinwork;

public class DynQue extends Queue {

	@Override
	public void enqueue(int item) {

		if (isFull()) {

			int[] na = new int[this.data.length * 2];

			// copy
			for (int i = 0; i < this.size; i++) {

				int idx = (i + this.front) % this.data.length;
				na[i] = this.data[idx];

			}

			this.data = na;
			this.front = 0;

		}

		try {
			super.enqueue(item);
		} catch (Exception e) {

		}

	}
}
