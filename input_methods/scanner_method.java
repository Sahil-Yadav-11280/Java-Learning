package input_methods;
// import scanner class
// create a scanner object and use it to read inputs
import java.util.Scanner;

public class scanner_method {
    public static void main(String[] args) {

        // creating scanner object
        Scanner scanner = new Scanner(System.in);

        // Read a string
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        // Read an integer
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        // Read a double (decimal number)
        System.out.println("Enter your height (in meters): ");
        double height = scanner.nextDouble();

        // Output the data:
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);

        // Close the scanner:
        scanner.close();

    }
}
