import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    countEvenInts(inArr(args));
        }

    // метод бере значення з консолі і заводить в масив
    public static int[] inArr(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.print("запишіть довжину: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("запишіть єлемент масиву:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
        return array;

    }

    public static int countEvenInts(int[] arg){
        int count = 0;
        for(int k: arg){
            if(k % 2 == 0){
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
    }
