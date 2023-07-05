package tasks.task_02;

import java.util.Scanner;

public class Main {

    private final static int[] PRICES = new int[] {25, 12, 43, 20, 42};

    private final static Scanner scanner = new Scanner(System.in);

    private final static String DEFAULT_ENTER = "Enter index: ";
    private final static String DEFAULT_OUTPUT = "The price is ";
    private final static String INVALID_INPUT = "Invalid value!";
    private final static String INVALID_INDEX = "Index out of bounds!";

    public static void main(String[] args) {
        getOutput(findPrice(getIndex()));
    }

    private static int getIndex() {
        try {
            System.out.print(DEFAULT_ENTER);
            int index = Integer.parseInt(scanner.nextLine());

            if (validateIndex(index)) {
                return index;
            } else {
                System.out.println(INVALID_INDEX);
                return getIndex();
            }
        } catch (NumberFormatException e) {
            System.out.println(INVALID_INPUT);
            return getIndex();
        }
    }

    private static boolean validateIndex(int index) {
        return index >= 0 && index < PRICES.length;
    }

    private static int findPrice(int index) {
        return PRICES[index];
    }

    private static void getOutput(int price) {
        System.out.println(DEFAULT_OUTPUT + price);
    }
}
