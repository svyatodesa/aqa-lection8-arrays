import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    differenceLargestSmallest(inArr(args));
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
public static void differenceLargestSmallest(Integer[]arg){
    List<Integer> list = new ArrayList<>(Arrays.asList(arg));
    Integer minArr = Collections.max(list);
    Integer maxArr = Collections.max(list);
    Integer result = maxArr - minArr;
    System.out.println(result);
}
}