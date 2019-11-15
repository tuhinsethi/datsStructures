package tuhinwork;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class workProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Boolean> hall = new HashMap<String, Boolean>();
		for (int i = 1; i <= 10; i++) {

			hall.put("A" + i, false);

		}
		System.out.println(hall);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the seats you want to book");
		String n = sc.next();
		char[] wanted = n.toCharArray();
		// if available
		for (int j = 0; j < wanted.length; j=j+2) {
			if (hall.get(wanted[j]+wanted[j+1]) == true) {
				System.out.println("your choice" + wanted[j+1] + "is taken");
			}
			else {
				String s= ""+wanted[j];
				hall.put(s, true);
				System.out.println(hall);
			}

		}

		Set<Map.Entry<String, Boolean>> entries = hall.entrySet();
		for (Map.Entry<String, Boolean> entry : entries) {

		}

	}

}
