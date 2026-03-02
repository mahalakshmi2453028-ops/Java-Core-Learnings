import java.util.Scanner;

public class EvenOddCountProgram {

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

        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Enter elements:");
        for (int index = 0; index < arraySize; index++) {

            numbers[index] = scanner.nextInt();

            if (numbers[index] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);

        scanner.close();
    }
}