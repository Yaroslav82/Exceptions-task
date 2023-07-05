package tasks.task_01;

import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    private final static String DEFAULT_ENTER = "Enter a number: ";
    private final static String DEFAULT_OUTPUT = "The number is ";
    private final static String INVALID_INPUT = "Invalid value!";

    public static void main(String[] args) {
        getOutput(getData());
    }

    private static double getData() {
        try {
            System.out.print(DEFAULT_ENTER);
            return Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println(INVALID_INPUT);
            return getData();
        }
    }

    private static void getOutput(double num) {
        System.out.println(DEFAULT_OUTPUT + num);
    }
}
