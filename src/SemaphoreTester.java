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

    public void checkSemaphore(TrafficSemaphore trafficSemaphore) { // Method creates instance of TrafficSemaphore class, and uses method
        while (true) {                                              // showColorDependingOnTime of this class. Because scanner are used it is
            System.out.println("Введите время от 0 в минутах");     // necessary to apply try catch
            Scanner scanner = new Scanner(System.in);
            try {
                double input = scanner.nextDouble();
                trafficSemaphore.showColorDependingOnTime(input);
            } catch (InputMismatchException e) {
                System.out.println("Введено некорректное значение!");
            }
            System.out.println();
        }
    }
}
