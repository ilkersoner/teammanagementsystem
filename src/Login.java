import java.util.Scanner;

public class Login {

	
		
	public void run() {
		    Scanner keyboard = new Scanner (System.in);
		    Scanner input = new Scanner (System.in);
		    String inpUser = keyboard.nextLine();
		    String inpPass = keyboard.nextLine(); // gets input from user

		    if (inpUser.equals("manager") && inpPass.equals("manager")) {
		        System.out.print("manager login successful");
		    }
		    else if(inpUser.equals("admin") && inpPass.equals("admin")){
		    	System.out.print("admin login successful");
		    }
		    else {
		        System.out.print("wrong id or pw");
		    }
		
	}
}