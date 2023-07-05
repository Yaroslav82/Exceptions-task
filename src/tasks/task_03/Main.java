package tasks.task_03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private final static double MONEY = 200;

    private final static String DEFAULT_ENTER = "Enter price: ";
    private final static String PAYMENT_OK = "You can pay for this product!";
    private final static String PAYMENT_BAD = "There is not enough money on your card :(";

    public static void main(String[] args) {
        getOutput(isPayable(getPrice()));
    }

    private static double getPrice() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print(DEFAULT_ENTER);
            return scanner.nextDouble();
        } catch (InputMismatchException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean isPayable(double price) {
        return price <= MONEY;
    }

    private static void getOutput(boolean payable) {
        if (payable) {
            System.out.println(PAYMENT_OK);
        } else {
            System.out.println(PAYMENT_BAD);
        }
    }
}
