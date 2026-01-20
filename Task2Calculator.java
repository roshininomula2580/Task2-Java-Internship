import java.util.Scanner;

public class Task2Calculator {

    // Static variable (shared across class)
    static String companyName = "Java Developer Internship";

    // Instance variable (belongs to object)
    int instanceValue = 10;

    public static void main(String[] args) {

        // Local variables
        byte b = 10;          // 1 byte
        short s = 100;        // 2 bytes
        int i = 1000;         // 4 bytes
        long l = 100000L;     // 8 bytes
        float f = 10.5f;      // 4 bytes
        double d = 99.99;     // 8 bytes
        char c = 'A';         // 2 bytes
        boolean flag = true;  // 1 bit

        System.out.println("=== Primitive Data Types Demo ===");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + flag);

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Calculator Application ===");

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Choose operation (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        double result = 0;
        boolean valid = true;

        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("❌ Error: Division by zero not allowed");
                valid = false;
            }
        } else {
            System.out.println("❌ Invalid operator");
            valid = false;
        }

        if (valid) {
            System.out.printf("Result: %.2f\n", result);
        }

        // Type Casting Demo
        int intValue = 20;
        double implicitCast = intValue; // Widening casting
        double doubleValue = 45.67;
        int explicitCast = (int) doubleValue; // Narrowing casting

        System.out.println("\n=== Type Casting ===");
        System.out.println("Implicit casting (int to double): " + implicitCast);
        System.out.println("Explicit casting (double to int): " + explicitCast);

        System.out.println("\nStatic Variable: " + companyName);

        sc.close();
    }
}
