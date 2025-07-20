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