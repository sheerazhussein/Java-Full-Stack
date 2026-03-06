package src.Phase1_Basics;

// Methods (Reusable Code)

// Instead of writing the same code twice, wrap it in a method.

public class Methods {

    // 1. Define the method
    public static void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // 2. Define a method that returns a value
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // 3. Call the methods 
        sayHello("Alice");
        sayHello("Sheeraz Hussein");

        int sum = addNumbers(10, 55);
        System.out.println("Sum is: " + sum);
    }
}
