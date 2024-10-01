import java.util.*;


public class Main {
    public static void main(String[] args) {

        resultSumm(dellArrayMinMax(inArr()));
    }
    public static Integer[] inArr(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("запишіть довжину: ");
        int size = scanner.nextInt();
        Integer[] array = new Integer[size];
        System.out.println("запишіть єлемент масиву:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;

    }
 // переводимо array -> arrayList для видалення мин і макс
    public static Integer[] dellArrayMinMax(Integer[] arr){
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        list.remove(Collections.max(list));
        list.remove(Collections.min(list));
        arr = list.toArray(new Integer[list.size()]);
        System.out.println(arr);
        return arr;
    }
    public static int resultSumm(Integer[]arr){
        int result = 0;
        for (int i = 0; i < arr.length; i ++){
            result += arr[i];

        }
        int sum = result / arr.length;
        System.out.println(sum);
        return  sum;
    }


}