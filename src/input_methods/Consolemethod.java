package input_methods;
import java.io.Console;
// Console is designed for reading passwords since it reads passwords without echoing characters to the screen

public class Consolemethod {
    public static void main(String[] args) {
        Console console = System.console();

        if (console == null){
            System.out.println("No console available!");
            return;
        }

        String username = console.readLine("Username: ");
        // Readpassword returns a char[] for security:
        char[] password = console.readPassword("Password: ");
        System.out.println("Welcome " + username);
    }
}
