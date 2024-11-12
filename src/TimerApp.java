import java.util.Timer;
import java.util.TimerTask;

public class TimerApp{
    public static void main(String[] args) {
        TimerApp timerApp = new TimerApp();
        timerApp.startTimer();
    }

    public void startTimer() {
        TimerTask everySecond = new TimerTask() {
            private int secondsElapsed = 0;
            @Override
            public void run() {
                System.out.println("Час що минув від початку: " + secondsElapsed + " секунд");
                secondsElapsed++;
            }
        };
        TimerTask everyFiveSeconds = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Минуло 5 секунд!");
            }
        };
        Timer timer = new Timer();
        timer.schedule(everySecond, 0, 1000);
        timer.schedule(everyFiveSeconds, 0, 5000);
    }
}

