import java.util.Scanner;
public class Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String firstname = sc.nextLine();
		String lastname = sc.nextLine();
		String suffixname = sc.nextLine();
		
		Name (firstname, lastname,suffixname);
				
}
	
	public static void Name(String firstname, String lastname, String suffixname) {
	    String name = "My name is" + " " + firstname +" " + lastname + " " + suffixname;
	    System.out.println(name);

	}
}