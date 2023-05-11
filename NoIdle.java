import java.awt.Robot;
import java.awt.event.InputEvent;
import java.lang.Math;
import java.lang.Thread;
import java.lang.Double;

public class NoIdle {
    public static void main(String[] args) {
        try {
            while (true) {
                Robot r = new Robot();
                int button = InputEvent.BUTTON1_DOWN_MASK;
                System.out.println("Clicked!");
                r.mousePress(button);
                double random = Math.random() * 60000;
                Thread.sleep(400);
                System.out.println("Next Click in " + Double.valueOf(random).longValue() / 1000 + " Seconds.");
                r.mouseRelease(button);
                Thread.sleep(Double.valueOf(random).longValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}