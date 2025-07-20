import java.util.InputMismatchException;
import java.util.Scanner;

public class ScientificCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            displayMenu();
            performOperation(scanner);
            System.out.println(); // spacing
        }
    }

    // === Menu Display Method ===
    public static void displayMenu() {
        System.out.println("===== Scientific Calculator =====");
        System.out.println("1.  Addition");
        System.out.println("2.  Subtraction");
        System.out.println("3.  Multiplication");
        System.out.println("4.  Division");
        System.out.println("5.  Square Root");
        System.out.println("6.  Power (x^y)");
        System.out.println("7.  Sine");
        System.out.println("8.  Cosine");
        System.out.println("9.  Tangent");
        System.out.println("10. Natural Logarithm (ln x)");
        System.out.println("11. Logarithm Base 10");
        System.out.println("12. Absolute Value");
        System.out.println("13. Round to Nearest Long");
        System.out.println("14. Ceiling");
        System.out.println("15. Floor");
        System.out.println("16. Minimum of Two");
        System.out.println("17. Maximum of Two");
        System.out.println("0.  Exit");
    }
    private static void performOperation(Scanner scanner) {
        try {
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Exiting calculator. Goodbye!");
                System.exit(0);
            }
            switch (choice) {
                case 1 -> {
                    double[] numbers = getTwoNumbers(scanner);
                    System.out.println("Result: " + add(numbers[0], numbers[1]));
                }
                case 2 -> {
                    double[] numbers = getTwoNumbers(scanner);
                    System.out.println("Result: " + subtract(numbers[0], numbers[1]));
                }
                case 3 -> {
                    double[] numbers = getTwoNumbers(scanner);
                    System.out.println("Result: " + multiply(numbers[0], numbers[1]));
                }
                case 4 -> {
                    double[] numbers = getTwoNumbers(scanner);
                    if (numbers[1] == 0) {
                        System.out.println("Error: Cannot divide by zero.");
                    } else {
                        System.out.println("Result: " + divide(numbers[0], numbers[1]));
                    }
                }
                case 5 -> {
                    System.out.print("Enter number: ");
                    double num = scanner.nextDouble();
                    if (num < 0) {
                        System.out.println("Error: Cannot take square root of a negative number.");
                    } else {
                        System.out.println("Result: " + calculateSquareRoot(num));
                    }
                }
                case 6 -> {
                    System.out.print("Enter base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter exponent: ");
                    double exponent = scanner.nextDouble();
                    System.out.println("Result: " + calculatePower(base, exponent));
                }
                case 7 -> {
                    System.out.print("Enter angle in degrees: ");
                    double degrees = scanner.nextDouble();
                    System.out.println("Result: " + calculateSine(degrees));
                }
                case 8 -> {
                    System.out.print("Enter angle in degrees: ");
                    double degrees = scanner.nextDouble();
                    System.out.println("Result: " + calculateCosine(degrees));
                }
                case 9 -> {
                    System.out.print("Enter angle in degrees: ");
                    double degrees = scanner.nextDouble();
                    if (degrees % 180 == 90) {
                        System.out.println("Error: Tangent is undefined at 90°, 270°, etc.");
                    } else {
                        System.out.println("Result: " + calculateTangent(degrees));
                    }
                }
                case 10 -> {
                    System.out.print("Enter number: ");
                    double num = scanner.nextDouble();
                    if (num <= 0) {
                        System.out.println("Error: Natural log is undefined for zero or negative numbers.");
                    } else {
                        System.out.println("Result: " + calculateNaturalLogarithm(num));
                    }
                }
                case 11 -> {
                    System.out.print("Enter number: ");
                    double num = scanner.nextDouble();
                    if (num <= 0) {
                        System.out.println("Error: Log base 10 is undefined for zero or negative numbers.");
                    } else {
                        System.out.println("Result: " + calculateLogarithmBase10(num));
                    }
                }
                case 12 -> {
                    System.out.print("Enter number: ");
                    double num = scanner.nextDouble();
                    System.out.println("Result: " + Math.abs(num));
                }
                case 13 -> {
                    System.out.print("Enter number: ");
                    double num = scanner.nextDouble();
                    System.out.println("Result: " + roundNumber(num));
                }
                case 14 -> {
                    System.out.print("Enter number: ");
                    double num = scanner.nextDouble();
                    System.out.println("Result: " + ceilingNumber(num));
                }
                case 15 -> {
                    System.out.print("Enter number: ");
                    double num = scanner.nextDouble();
                    System.out.println("Result: " + floorNumber(num));
                }