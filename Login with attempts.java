import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int attempt = 0;
	
    	while (attempt<5) {
		   System.out.println("Enter your Username");
		   String username = sc.nextLine();
		   System.out.println("Enter your password");
		   String password = sc.nextLine();
		   String status = validator(username, password);
	   	if(status.equals("successfully")) {
		      System.out.println("Log in successfully! ");
		   break;
		   
  		}else if (status.equals("Failed")) {
		     System.out.println("Login Failed! Please try again");
		    attempt++;
		    System.out.println("Attempt:" + attempt);
		    System.out.println();
		    
		}
		
	}
	        if (attempt==5){
               System.out.println("Youve reach 5 attempts try later");
               sc.close();
               
            }
     }            
     private static String validator(String username, String password) {
    String defaultUsername = "Mark";
    String defaultPassword = "1234";
          if (username.equals(defaultUsername) && password.equals(defaultPassword)) {
               return "successfully";
          }else{
               return "Failed";
          }
                                              
    }
}
               
                  