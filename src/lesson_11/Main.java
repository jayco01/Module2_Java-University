package lesson_11;

public class Main {
    public static void main(String[] args) {
        CountdownTimer countdownTimer = new CountdownTimer(5, 6, new TimerCallback() {
            @Override
            public void onTick(int timeRemaining) {
                System.out.println(timeRemaining);
            }

            @Override
            public void onFinished() {
                System.out.println("DONEZO");
            }
        });
        CountdownTimer countdownTimer2 = new CountdownTimer(2, 8, new TimerCallback() {
            @Override
            public void onTick(int timeRemaining) {
                System.out.println("Time: " + timeRemaining);
            }

            @Override
            public void onFinished() {
                System.out.println("Done!");
            }
        });
        countdownTimer.start();
        countdownTimer2.start();
    }
}
