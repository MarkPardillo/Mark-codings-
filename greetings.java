public class Main {
    public static String greetUser(String name) {
        return "Hello, " + name + "!";
    }

    public static void main(String[] args) {
        String greeting = greetUser("Alice");
        System.out.println(greeting);
    }
}