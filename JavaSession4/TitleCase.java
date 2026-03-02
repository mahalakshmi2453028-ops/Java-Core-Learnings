import java.util.Scanner;

public class TitleCase {

    public static String toTitleCase(String str) {
        String[] words = str.split(" ");
        String result = "";

        for (String word : words) {
            result += word.substring(0, 1).toUpperCase() +
                      word.substring(1).toLowerCase() + " ";
        }

        return result.trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(toTitleCase(input));
    }
}