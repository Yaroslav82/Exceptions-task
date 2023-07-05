package tasks.task_01;

import java.util.Scanner;

public class Main {

    private final static String DEFAULT_ENTER = "Enter a number: ";
    private final static String DEFAULT_OUTPUT = "The number is ";

    public static void main(String[] args) {
        getOutput(getData());
    }

    private static double getData() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print(DEFAULT_ENTER);
            // Лучше использовать scanner.nextDouble(), однако в таком случае получить NumberFormatException невозможно
            return Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }

    private static void getOutput(double num) {
        System.out.println(DEFAULT_OUTPUT + num);
    }
}
