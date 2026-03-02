import java.util.Scanner;

public class TwoDimensionalArraySum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int numberOfRows = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        int numberOfColumns = scanner.nextInt();

        if (numberOfRows <= 0 || numberOfColumns <= 0) {
            System.out.println("Invalid input");
            scanner.close();
            return;
        }

        int[][] matrix = new int[numberOfRows][numberOfColumns];

        int totalSum = 0;

        System.out.println("Enter elements:");
        for (int row = 0; row < numberOfRows; row++) {

            for (int column = 0; column < numberOfColumns; column++) {

                matrix[row][column] = scanner.nextInt();
                totalSum = totalSum + matrix[row][column];
            }
        }

        System.out.println("Sum of elements: " + totalSum);

        scanner.close();
    }
}