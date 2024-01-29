
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        Calculator calculator = new Calculator();
        int sum = calculator.add(a, b);
        int difference = calculator.subtract(a, b);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}

