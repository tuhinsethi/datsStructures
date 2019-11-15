package tuhinwork;
import java.util.Scanner;
public class w3 {
static 	int sumLocal=0;


	
		

		public  static void main(String[] args) {
			Scanner s = new Scanner(System.in);

			
			int elements = s.nextInt();
			String name = s.nextLine();

			sum(name);
			double e = sumLocal / elements;

			int f = ((int) e )+1;
			System.out.println(f); //

		}

		public static void sum(String name) {

			if (name.length() == 0) {
				return ;
			}
			for (int i = 0; i < name.length(); i++) {
				if (name.charAt(i) == ' ') {

					sumLocal += Integer.parseInt(name.substring(0, i));

					name = name.substring(i + 1, name.length());
				}

			}

			sum(name);

		}
	}
	
