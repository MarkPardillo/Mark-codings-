import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Input :");
		char input = sc.next().charAt(0);
		
		if ((input >= 'a' && input <= 'z') || (input >='A' && input <= 'Z' ))  {
		System.out.println(input   + ": This is a letter");
		
	}	else if (input >= '0' && input <= '9') {
		System.out.println(input   + ": This is digit");
		
	}else{
		System.out.println(input   + ": This is not a letter or a digit");
	
	}
			
	}
}