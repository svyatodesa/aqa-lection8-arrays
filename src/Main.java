import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        catDog(inString());
        }
  // вводимо строку з консолі
    public static String inString(){
    Scanner scanner = new Scanner(System.in);
    String newString = scanner.nextLine();
    System.out.println(newString);
    return newString;
    }

    public static boolean catDog(String arg){
        boolean cat = arg.contains("cat");
       boolean dog = arg.contains("dog");
        int countCat = 0;
        int countDog = 0;
         for(int i = 0; i < arg.length(); i++){
            if (cat){
                countCat++;
            }
            if(dog){
                countDog++;
            }
            if(countCat > 0 && countDog > 0 &&  countCat == countDog){
                System.out.println(true);
                return true;
            }
        }
return false;
    }


}