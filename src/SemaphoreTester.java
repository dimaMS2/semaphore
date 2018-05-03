import java.util.InputMismatchException;
import java.util.Scanner;

public class SemaphoreTester {
    private static SemaphoreTester instance;

    public SemaphoreTester() {
    }

    public static SemaphoreTester getInstance() {
        if (instance == null) {
            instance = new SemaphoreTester();
        }
        return instance;
    }

    public void checkSemaphore(TrafficSemaphore trafficSemaphore) { // This method checks showColorDependingOnTime method of TrafficSemaphore with try catch.
        Scanner scanner = new Scanner(System.in);                   // If user will type non numerical value then this input will compare with String "stop".
        double input = 0;                                           // If input value equals "stop" then cycle is breaks else if input value not numerical and doesn't equals stop
        while (true) {                                              // in console will displays notice about not correct input value.
            System.out.println("Введите время от 0 в минутах, либо stop для выхода");
            try {
                input = scanner.nextDouble();
                trafficSemaphore.showColorDependingOnTime(input);
            } catch (InputMismatchException e) {
                String temp = scanner.nextLine();
                if (temp.equals("stop")) {
                    break;
                }
                System.out.println("Введено некорректное значение!");
            }
            System.out.println();
        }
    }
}
