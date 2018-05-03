public class TrafficSemaphore {
    // This class shows the name of the color on the console depending on input value and next condition:
    //
    // The first two minutes the green light is on.
    // Then three minutes is yellow light.
    // And next five minutes is red light.

    private static final String RED = "Красный";
    private static final String YELLOW = "Жёлтый";
    private static final String GREEN = "Зелёный";
    private static final double FULL_LIGHTING_CYCLE = 10;           // for 10 minutes traffic light changes all colors from green to red (2 + 3 + 5 = 10)

    public TrafficSemaphore() {
    }

    private String pickedColorFromTime(double excess) {             // this method are pick color, depending on the fission residue by
        StringBuilder answer = new StringBuilder();                 // FULL_LIGHTING_CYCLE  (FULL_LIGHTING_CYCLE = 10)
        if (excess >= 0 && excess < 2) {
            answer.append(GREEN);
        } else if (excess >= 2 && excess < 5) {
            answer.append(YELLOW);
        } else if (excess >= 5 && excess < 10) {
            answer.append(RED);
        }
        return answer.toString();
    }

    private boolean isInputLargerThenZero(double input) {           // this method is necessary to prevent from using negative time.
        boolean larger = false;                                     // Method checks input and returns boolean depending on input value
            if (input >= 0) {
                larger = true;
            }
            return larger;
    }

    public void showColorDependingOnTime(double minute) {           // this method displays traffic light color on console depending on time in minutes
        if (isInputLargerThenZero(minute)) {                        // if input value is below zero then displays notice about it
            double fissionResidue = minute % FULL_LIGHTING_CYCLE;
            System.out.println("Светофор показывает: " + pickedColorFromTime(fissionResidue) + " цвет");
        } else {
            System.out.println("Введено отрицательное время!");
        }
    }
}
