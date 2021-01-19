import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner console = new Scanner(System.in);
        String name = console.next();
        System.out.println("Hello, " + name + "!");
    }
}