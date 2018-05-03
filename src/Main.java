public class Main {
    public static void main(String[] args) {
        TrafficSemaphore trafficSemaphore = new TrafficSemaphore();
        SemaphoreTester semaphoreTester = new SemaphoreTester();
        semaphoreTester.checkSemaphore(trafficSemaphore);
    }
}
