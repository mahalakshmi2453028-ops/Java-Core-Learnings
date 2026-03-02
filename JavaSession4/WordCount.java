import java.util.Scanner;

public class WordCount {

    public static int countWords(String str) {
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(countWords(input));
    }
}