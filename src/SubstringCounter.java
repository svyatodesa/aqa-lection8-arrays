import java.util.Scanner;

public class SubstringCounter {

    public static int countCodeLikeSubstrings(String input) {
        int count = 0;
        for (int i = 0; i < input.length() - 3; i++) {
            // Перевіряємо, чи підрядок починається з "co" і закінчується на "e"
            if (input.startsWith("co", i) && input.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int count = countCodeLikeSubstrings(input);
        System.out.println("Number of 'code'-like substrings: " + count);

        scanner.close();
    }
}

