import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Pakibotang sa una nga number:");
		double n1 = input.nextDouble();
		
		System.out.println("Pakibotang sa ikaduha nga number: ");
		double n2 = input.nextDouble();
		
		System.out.println("Pili ka operator (+,-,*,/): ");
		char operator = input.next().charAt(0);
		
		    double result; 
		    
		     switch(operator){
		         case '+' :
		             result = n1 + n2;
		             break;
		         case '-' :
		             result = n1 - n2;
		             break;
		         case '*' :
		             result = n1 * n2;
		             break;
		          case '/' :
		              result = n1 / n2;
		              break;
		          default :
		          System.out.println("invalid ka");
		          return;
	
	}
		          	          
		          System.out.println("Ang result ay: " + result);
	}
}