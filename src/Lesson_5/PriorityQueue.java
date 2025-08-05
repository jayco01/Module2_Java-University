package Lesson_5;

public interface PriorityQueue<T extends HasPriority>  {
    void put(T elem);
    T pop();
    int size();
    int getCapacity();
}
