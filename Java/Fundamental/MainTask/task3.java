import java.util.Scanner;
public class task3 {
    public static void main(String[] args)  {
        System.out.println("enter count of numbers");
        Scanner console = new Scanner(System.in);
        String name = console.next();
        int n = Integer.parseInt(name);
        for (int i = 0; i < n; i+=1) {
            int a = (int) (Math.random() * (10000+ 1));
            System.out.println(a);
        }for (int i = 0; i < n; i+=1) {
            int b = (int) (Math.random() * (10000 + 1));
            System.out.print(b+" ");
        }
    }
}