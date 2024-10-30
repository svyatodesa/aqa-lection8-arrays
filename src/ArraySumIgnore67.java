import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraySumIgnore67 {

    public static int sumIgnoreSections(List<Integer> numbers) {
        int sum = 0;
        boolean ignore = false;

        for (int num : numbers) {
            if (num == 6) {
                ignore = true;  // Починаємо ігнорувати
            }
            if (!ignore) {
                sum += num;  // Додаємо, якщо не в ділянці 6-7
            }
            if (num == 7 && ignore) {
                ignore = false;  // Закінчуємо ігнорування після 7
            }
        }

        // Повертаємо 0, якщо сума дорівнює 0
        return sum > 0 ? sum : 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers separated by spaces: ");
        String[] input = scanner.nextLine().split(" ");

        List<Integer> numbers = new ArrayList<>();
        for (String s : input) {
            try {
                numbers.add(Integer.parseInt(s));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, skipping: " + s);
            }
        }

        int result = sumIgnoreSections(numbers);
        System.out.println("Sum (ignoring 6-7 sections): " + result);

        scanner.close();
    }
}
