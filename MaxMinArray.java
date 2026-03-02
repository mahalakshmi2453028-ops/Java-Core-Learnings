import java.util.Scanner;

public class MaxMinArray {

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

        System.out.println("Enter array elements:");
        for (int index = 0; index < arraySize; index++) {
            numbers[index] = scanner.nextInt();
        }


        int maximumValue = numbers[0];
        int minimumValue = numbers[0];

        for (int index = 1; index < arraySize; index++) {

            if (numbers[index] > maximumValue) {
                maximumValue = numbers[index];
            }

            if (numbers[index] < minimumValue) {
                minimumValue = numbers[index];
            }
        }

        System.out.println("Maximum value: " + maximumValue);
        System.out.println("Minimum value: " + minimumValue);

        scanner.close();
    }
}