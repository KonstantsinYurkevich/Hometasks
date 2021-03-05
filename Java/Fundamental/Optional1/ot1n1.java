import java.util.Scanner;

public class ot1n1 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String longInt = "", shortInt = line;
        for (String s : line.split(" ")) {
            if (s.length() > longInt.length()) longInt = s;
            if (s.length() < shortInt.length()) shortInt = s;
        }
        System.out.print("Самое длинное число: " + longInt + " Длина: " + longInt.length());
        System.out.print("\nСамое короткое число: " + shortInt + " Длина: " + shortInt.length());
    }
}
