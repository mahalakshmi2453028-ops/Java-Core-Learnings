package JavaSession2;
import java.util.Scanner;
public  class  FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int numberOfTerms = scanner.nextInt();
        if (numberOfTerms <= 0) {
            System.out.println("Invalid input");
        } else {
            int firstNumber = 0;
            int secondNumber = 1;
            System.out.println("Fibonacci Series:");
            for (int count = 1; count <= numberOfTerms; count++) {
                System.out.print(firstNumber + " ");
                int nextNumber = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = nextNumber;
            }
        }

        scanner.close();
    }
}
