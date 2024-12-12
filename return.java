import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String firstname = sc.nextLine();
		String lastname = sc.nextLine();
		String suffixname = sc.nextLine();
		
		System.out.println(Name(firstname, lastname, suffixname));
			
	}
	
	public static String Name(String firstname, String lastname, String suffixname) {
	    return "My name is: " + firstname + " " +lastname + " " + suffixname;
	}
}