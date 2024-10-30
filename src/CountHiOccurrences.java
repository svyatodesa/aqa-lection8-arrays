import java.util.Scanner;

public class CountHiOccurrences {

    public static int countHi(String str) {
        int count = 0;
        int index = 0;

        // Використовуємо цикл для пошуку всіх входжень "hi"
        while ((index = str.indexOf("hi", index)) != -1) {
            count++;
            index += 2;  // Переходимо до символу після знайденого підрядка
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();  // Зчитування рядка з консолі

        int result = countHi(input);  // Виклик методу для підрахунку
        System.out.println("Count of 'hi': " + result);  // Виведення результату

        scanner.close();  // Закриваємо сканер
    }
}
