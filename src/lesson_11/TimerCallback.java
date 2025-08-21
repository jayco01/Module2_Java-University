package lesson_11;

public interface TimerCallback {
    void onTick(int timeRemaining);
    void onFinished();
}
