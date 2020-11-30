import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] creatRandom(){
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("List of array: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.println(arr[i] + "");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.creatRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nInput value random: ");
        int x = scanner.nextInt();
        try {
            System.out.println("Value index " + x + " is " + arr[x]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Value out");
        }
    }
}
