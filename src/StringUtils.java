import java.util.Scanner;

public class StringUtils {
    public static String doubleChars(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            result.append(c).append(c);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String doubledString = doubleChars(input);
        System.out.println("Doubled string: " + doubledString);

        scanner.close();
    }
}
