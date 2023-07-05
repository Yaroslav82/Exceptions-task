package tasks.task_04;

import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    private final static int MIN_TEMPERATURE = -10;
    private final static int MAX_TEMPERATURE = 35;

    private final static String DEFAULT_ENTER = "Enter temperature of device: ";
    private final static String VALID_TEMPERATURE = "Device is ready to work!";
    private final static String INVALID_TEMPERATURE = "The device cannot work outside the temperature spectrum";
    private final static String INVALID_INPUT = "Invalid value!";

    public static void main(String[] args) {
        try {
            getOutput(getTemp());
        } catch (InvalidTemperatureException e) {
            System.out.println(e.getMessage());
        }
    }

    private static double getTemp() {
        try {
            System.out.print(DEFAULT_ENTER);
            return Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println(INVALID_INPUT);
            return getTemp();
        }
    }

    private static boolean validateTemp(double temperature) {
        return temperature >= MIN_TEMPERATURE && temperature <= MAX_TEMPERATURE;
    }

    private static void getOutput(double temperature) throws InvalidTemperatureException {
        if (validateTemp(temperature)) {
            System.out.println(VALID_TEMPERATURE);
        } else {
            throw new InvalidTemperatureException(INVALID_TEMPERATURE);
        }
    }
}
