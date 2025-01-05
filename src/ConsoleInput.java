import java.io.Console;

public class ConsoleInput {
    public static void main(String[] args) {
        Console console = System.console();

        String name = console.readLine("Enter your name: ");
        char[] password = console.readPassword("Enter your password: ");
        String passwordString = new String(password);

        System.out.println("Hello, " + name + "!");
        System.out.println("Your password is: " + passwordString);
        System.out.println(password);

    }
}
