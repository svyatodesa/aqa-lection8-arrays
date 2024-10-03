import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public abstract class Main {
    public static void main(String[] args) {
            sumWithoutUnlucky13(args);

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
    public  static int summElemetsArr(int[]arg){
        int sum = 0;
        for (int i =0; i < arg.length; i++){
            sum = arg[i] + arg[i];
        }
        System.out.println(sum);
        return sum;
    }
    public static int sizaArr(int[] arg){
        if(arg.length == 0){
            System.out.println("0");
        }return arg.length;

    }

    public  static  void sumWithoutUnlucky13(int[]arg){
        sizaArr(arg);
        for(int i = 0; i < arg.length; i++){
            if (arg[i] == 13){
                int[] copyArg = Arrays.copyOfRange(arg,0,arg[i]-1);
                summElemetsArr(copyArg);

            }
            break;
        }
        summElemetsArr(arg);
   }

}