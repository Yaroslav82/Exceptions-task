package tasks.task_02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private final static int[] PRICES = new int[] {25, 12, 43, 20, 42};

    private final static String DEFAULT_ENTER = "Enter index: ";
    private final static String DEFAULT_OUTPUT = "The price is ";

    public static void main(String[] args) {
        getOutput(findPrice(getIndex()));
    }

    private static int getIndex() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print(DEFAULT_ENTER);
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            throw new RuntimeException(e);
        }
    }

    private static int findPrice(int index) {
        if (index < 0 || index >= PRICES.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return PRICES[index];
    }

    private static void getOutput(int price) {
        System.out.println(DEFAULT_OUTPUT + price);
    }
}
