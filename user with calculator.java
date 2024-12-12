import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username = "Mark";
        int Password = 1234;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter username:");
        String inputUsername = sc.nextLine();
        
        System.out.println("Enter password:");
        int inputPassword = sc.nextInt();
        
        if (inputUsername.equals(username) && inputPassword == Password) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed!");
        }
        
        
    }
}