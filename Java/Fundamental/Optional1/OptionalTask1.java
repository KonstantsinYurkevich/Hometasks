package OptionalTask1;

import java.util.Arrays;
import java.util.Scanner;


public class OptionalTask1 {
    public static void main(String[] args) {
        OptionalTask1 tasksFromFirstToForth = new OptionalTask1();
        tasksFromFirstToForth.runAllTasks();
    }

    private static int number;
    private static int[] array;


    public void runAllTasks() {
        OptionalTask1 task = new OptionalTask1();
        task.nNumbersFromConsole();
        task.findShortestAndLongestNumbersAndTheirLengthAndPrintIt();
        task.printNumbersInAscendingOrderAndInDescendingOrderTheirLength();
        task.PrintNumbersThoseLengthLessAndMoreThenAverageLengthAndItsLength();
        task.findNumberThoseHaveMinReiteratingIfMoreThoseNumbersPrintFirst();
    }

    public void nNumbersFromConsole() {
        System.out.print("Введите количество чисел:");
        Scanner console = new Scanner(System.in);
        number = console.nextInt();
        array = new int[number];
        System.out.println("Введите числа:");
        for (int i = 0; i < number; i++) {
            array[i] = console.nextInt();
        }
    }

    public void findShortestAndLongestNumbersAndTheirLengthAndPrintIt() {

        System.out.println("1.Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.");

        int shortestNumber = array[0];
        int longestNumber = shortestNumber;
        String shortestNumberAsString = String.valueOf(array[0]);
        int lengthMin = shortestNumberAsString.length();
        int lengthMax = lengthMin;

        for (int number1: array) {
            String numberAsString = String.valueOf(number1);
            if (numberAsString.length() < lengthMin) {
                shortestNumber = number1;
                lengthMin = numberAsString.length();
            }
            if (numberAsString.length() > lengthMax) {
                longestNumber = number1;
                lengthMax = numberAsString.length();
            }
        }
        System.out.println("Самое короткое число: " + shortestNumber + "." + " Его длина: " + lengthMin + ".");
        System.out.println("Самое длинное число: " + longestNumber + "." + " Его длина: " + lengthMax + ".");

    }

    public void printNumbersInAscendingOrderAndInDescendingOrderTheirLength() {
        System.out.println("2.Вывести числа в порядке возрастания (убывания) значений их длины.");
        int[] lengthArray = new int[number];
        for (int i = 0; i < number; i++) {
            lengthArray[i] = String.valueOf(array[i]).length();
        }
        for (int i = 0; i < lengthArray.length - 1; i++) {
            for (int j = lengthArray.length - 1; j > i; j--) {
                if (lengthArray[j] < lengthArray[j - 1]) {
                    int temp1 = lengthArray[j];
                    lengthArray[j] = lengthArray[j - 1];
                    lengthArray[j - 1] = temp1;
                    int temp2 = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp2;
                }
            }
        }
        System.out.println("Числа в порядке возрастания значений их длины:");
        for (int element : array) {
            System.out.println(element);
        }
        System.out.println("Числа в порядке убывания значений их длины:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
        System.out.println();
    }

    public void PrintNumbersThoseLengthLessAndMoreThenAverageLengthAndItsLength() {
        System.out.println("3.Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем " +
                "числам, а также длину.");
        int[] lengthArray = new int[number];
        for (int i = 0; i < number; i++) {
            lengthArray[i] = String.valueOf(array[i]).length();
        }
        int sum = 0;
        for (int j : lengthArray) {
            sum = sum + j;
        }
        double medium = sum / (number * 1.0);
        System.out.println("Средняя длинна чисел = " + medium);
        System.out.println("Числа, длина которых, меньше средней длины по всем числам:");
        boolean thereAreNotNumbersWhoseLengthIsLessThanAverageLengthForAllNumbers = true;
        for (int i = 0; i < lengthArray.length; i++) {
            if (lengthArray[i] < medium) {
                System.out.println(array[i]);
                thereAreNotNumbersWhoseLengthIsLessThanAverageLengthForAllNumbers = false;
            }
        }
        if (thereAreNotNumbersWhoseLengthIsLessThanAverageLengthForAllNumbers) {
            System.out.println("Чисел, длина которых, меньше средней длины по всем числам - нет.");
        }
        System.out.println();
        System.out.println("Числа, длина которых, больше средней длины по всем числам:");
        boolean thereAreNotNumbersWhoseLengthIsGreaterThanAverageLengthForAllNumbers = true;
        for (int i = 0; i < lengthArray.length; i++) {
            if (lengthArray[i] > medium) {
                System.out.println(array[i]);
                thereAreNotNumbersWhoseLengthIsGreaterThanAverageLengthForAllNumbers = false;
            }
        }
        if (thereAreNotNumbersWhoseLengthIsGreaterThanAverageLengthForAllNumbers) {
            System.out.println("Чисел, длина которых, больше средней длины по всем числам - нет");
        }
        System.out.println();
    }

    public void findNumberThoseHaveMinReiteratingIfMoreThoseNumbersPrintFirst() {
        System.out.println( "4.Найти число, в котором количество различных цифр минимально. Если таких чисел " +
                "несколько, найти первое из них.");
        char[] arrayOfTheFirstNumber = String.valueOf(array[0]).toCharArray();
        Arrays.sort(arrayOfTheFirstNumber);
        int differentDigitsCounterOfRequiredNumber = 1;
        for (int j = 0; j < arrayOfTheFirstNumber.length - 1; j++) {
            if (arrayOfTheFirstNumber[j] != arrayOfTheFirstNumber[j + 1]) {
                differentDigitsCounterOfRequiredNumber++;
            }
        }
        int numberInWhichAmountOfDifferentDigitsMinimum = array[0];
        for (int i = 1; i < array.length; i++) {
            char[] arrayOfNumber = String.valueOf(array[i]).toCharArray();
            Arrays.sort(arrayOfNumber);
            int differentDigitsCounter = 1;
            for (int j = 0; j < arrayOfNumber.length - 1; j++) {
                if (arrayOfNumber[j] != arrayOfNumber[j + 1]) {
                    differentDigitsCounter++;
                }
            }
            if (differentDigitsCounter < differentDigitsCounterOfRequiredNumber) {
                differentDigitsCounterOfRequiredNumber = differentDigitsCounter;
                numberInWhichAmountOfDifferentDigitsMinimum = array[i];
            }
        }
        System.out.println("Число, в котором количество различных цифр минимально: "
                + numberInWhichAmountOfDifferentDigitsMinimum);
        System.out.println();
    }
}
