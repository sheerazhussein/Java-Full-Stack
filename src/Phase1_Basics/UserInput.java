package src.Phase1_Basics;
import java.util.Scanner; // import the Scanner tool

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create the scannner

        System.out.print("Enter your name:");
        String name = scanner.nextLine(); // Read text

        System.out.print("Enter your age:");
        int age = scanner.nextInt(); // Read number

        System.out.println("Hello " + name + ", you are " + age + " years old.");

        scanner.close(); // Good practice to close resources
    }
}
