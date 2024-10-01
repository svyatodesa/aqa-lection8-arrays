import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    sumIgnoreSections(inArr(args));
    }

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
    public static int sumIgnoreSections(int[] arg){
        int sumArrElement = 0;
        for (int i = 0; i < arg.length; i++ ){
            if (arg[i] == 6){

                if (arg[i] == 7) {
                    return sumArrElement += arg[i];
                }

                return sumArrElement;
            }
            else {
                return sumArrElement += arg[i];
            }
        }
             return sumArrElement;
    }
}