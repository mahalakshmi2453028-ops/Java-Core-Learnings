import java.util.Scanner;

public class ArraySumProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int arraySize = scanner.nextInt();

        if (arraySize <= 0) {
            System.out.println("Invalid input");
            scanner.close();
            return;
        }

        int[] numbers = new int[arraySize];

        int totalSum = 0;

        System.out.println("Enter elements:");
        for (int index = 0; index < arraySize; index++) {

            numbers[index] = scanner.nextInt();
            totalSum = totalSum + numbers[index];
        }

        System.out.println("Sum of elements: " + totalSum);

        scanner.close();
    }
}