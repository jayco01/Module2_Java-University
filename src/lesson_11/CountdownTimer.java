package lesson_11;

public class CountdownTimer extends Thread{
    private int timeRemaining;
    private TimerCallback timerCallback;
    private int tickInterval;

    public CountdownTimer(int tickInterval, int timeRemaining, TimerCallback timerCallback) {
        this.tickInterval = tickInterval * 1000;
        this.timeRemaining = timeRemaining;
        this.timerCallback = timerCallback;
    }

    @Override
    public void run() {
        while (timeRemaining > 0) {
            timerCallback.onTick(timeRemaining);
            timeRemaining--;
            try {
                Thread.sleep(tickInterval);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        timerCallback.onFinished();
    }
}