public class task4 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("no data");
        } else {
            int sumOfNumbers = 0;
            int productOfNumbers = 1;
            for (int i = 0; i < args.length; i++) {
                int n = Integer.parseInt(args[i]);
                sumOfNumbers += n;
                productOfNumbers *= n;
            }
            System.out.println("sum of numbers: " + sumOfNumbers);
            System.out.println("product of numbers: " + productOfNumbers);
        }
    }
}
