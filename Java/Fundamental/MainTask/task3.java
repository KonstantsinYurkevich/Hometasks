import java.util.Scanner;
public class task3 {
    public static void main(String[] args)  {
        System.out.println("enter count of numbers");
        Scanner console = new Scanner(System.in);
        int count = console.nextInt();
        Random rand = new Random();
        int [] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =  rand.nextInt();
            System.out.println(arr[i] + " ");
        }
        System.out.println();
        for ( int i = 0; i < arr.length; i ++){
            System.out.print( arr [i] + " ");
        }
    }
}
