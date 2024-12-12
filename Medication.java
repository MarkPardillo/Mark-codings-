import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String Retry;
		
		do{
		    System.out.println("Do you have a fever: (Yes or No)");
		    String fever = sc.next();
		    System.out.println("Do you have cough: (Yes or No)");
		    String cough = sc.next();
		    System.out.println("Do you have any symtoms: (Yes or No)");
		    String symtoms = sc.next();
		    
		    if (fever.equalsIgnoreCase("Yes") || cough.equalsIgnoreCase("Yes") || symtoms.equalsIgnoreCase("Yes")) {
		        System.out.println("Go to the nearest hospital you know. And stay safe!!");
		        
		    }else{
		        System.out.println("Okay! you don't have any symtoms:");
		}
		
		        System.out.println("Do you want to try again? (Yes or No)");
		        Retry = sc.next();
		        
		     }while (Retry.equalsIgnoreCase("Yes"));
		     
		     sc.close();                   
		        		        		    		    		  
	}	    
}	
