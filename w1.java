package tuhinwork;
import java.util.Scanner;
public class w1 {
	 public static void main(String args[] ) throws Exception {
	        /* Sample code to perform I/O:
	         * Use either of these methods for input

	        //BufferedReader
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String name = br.readLine();                // Reading input from STDIN
	        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

	        //Scanner
	        Scanner s = new Scanner(System.in);
	        String name = s.nextLine();                 // Reading input from STDIN
	        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

	        */

	        // Write your code here
	        Scanner s = new Scanner(System.in);
	        String name = s.nextLine();  
	       
	       System.out.println(ins(name));
            int a1= Integer.parseInt("10 15 20");

            System.out.println(a1);
	    
	    

	    }
	    public static int ins(String inp){
	        String a,b="";
	        int a1=0,b1=0,ans=0;
	        for(int i=0;i<inp.length();i++){
	            if(inp.charAt(i)==' '){
	                a= inp.substring(0,i);
	                b=inp.substring(i+1,inp.length());
	                a1= Integer.parseInt(a);
	                b1= Integer.parseInt(b);
	        
	        
	            }
	            
	        }
	        for(int i=1;i<999;i++){
	            if(a1%i==0 && b1%i==0){
	                ans+=1;
	                
	            }
	        }
	        
	        return ans;
	    }

	    
	    public void abc() {
	    	
	    	
	    	
	    }
}
