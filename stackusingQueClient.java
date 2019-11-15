package tuhinwork;

public class stackusingQueClient {
	public static void main(String[] args) throws Exception {

		stackUsingQuePopEff ds = new stackUsingQuePopEff();
		ds.push(10);
		ds.push(20);
		ds.push(30);
		ds.push(40);
		ds.push(50);
		ds.push(60);
		ds.push(70);

		System.out.println(ds.pop());

		System.out.println("---");
		ds.display();

	}
}
