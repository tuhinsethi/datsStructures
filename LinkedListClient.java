package tuhinwork;

public class LinkedListClient {
	public static void main(String[] args) throws Exception {
		LinkedList list = new LinkedList();

		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);

		list.display();

		System.out.println(list.getAt(2));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());

		System.out.println(list.removeFirst());
		list.display();
		list.addFirst(200);
		System.out.println(list.removeLast());
		list.display();
		
		
	}
}
