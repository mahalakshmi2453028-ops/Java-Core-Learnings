package JavaSession2;
import java.util.Scanner;
public class FactorialProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();
        long firstFactorial = 1;
        long secondFactorial = 1;
        for (int i = 1; i <= firstNumber; i++) {
            firstFactorial = firstFactorial * i;
        }
        for (int i = 1; i <= secondNumber; i++) {
            secondFactorial = secondFactorial * i;
        }
        System.out.println(firstFactorial);
        System.out.println(secondFactorial);
        if (firstNumber < secondNumber) {
            System.out.println(firstNumber);
        } else {
            System.out.println(secondNumber);
        }
        scanner.close();
    }
}
