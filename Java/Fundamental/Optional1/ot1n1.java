import java.util.Arrays;
import java.util.Scanner;

public class ot1n1 {
    public static void main(String[] arg) {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        String[] strArr = str.split(" ");
        int[] arr = new int[strArr.length];
        int max = 0;
        for ( int i = 0; i < strArr.length; i ++) {
            arr[i] = Integer.parseInt(strArr[i]);
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        Arrays.sort(arr);
        int min = arr[0];
        int maxLength = (String.valueOf(max)).length();
        int minLength = (String.valueOf(min)).length();


        System.out.println(" Самое короткое число - " + min + " с длинной - " + minLength);
        System.out.println(" Самое длинное число - " + max + " с длинной - " + maxLength);



    }
}

