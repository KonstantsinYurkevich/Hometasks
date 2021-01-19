import java.util.Scanner;
public class HelloUser {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}