package Lesson_5;


import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPriorityQueue<T extends HasPriority> implements PriorityQueue<T> {
    // TODO: Implement Array Prio Queue using an array as the data storage

    private T[] data;
    private int capacity;
    private int size;

    public ArrayPriorityQueue( Class<T> tClass,int capacity ) {
        try
        {
            this.capacity = capacity;
            data = (T[]) Array.newInstance(tClass,capacity);
            this.size = 0;
        }
        catch (Exception e)
        {
            System.out.println("Error Creating ArrayPriorityQueue. Message: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public void put(T elem) {
        T[] newTArray;
        int newCapacity;

        if (data[capacity-1] != null) {
            newCapacity = capacity + 1;
            newTArray = (T[]) Array.newInstance(elem.getClass(), newCapacity);
        } else {
            newTArray = data;
        }

        if(data[0] == null) {
            data[0] = elem;
        }
        else {
            for (int i = data.length - 1; i >= 0 ; i--) {
                if (data[i] == null) { continue; }

                if (data[i].getPriority() >= elem.getPriority()) {
                    newTArray[i+1] = elem;
                    newTArray[i] = data[i];
                } else {
                    newTArray[i+1] = data[i];
                    if (i == 0) {
                        newTArray[i] = elem;
                    }
                }
            }
        }
        size++;
        data = newTArray;
    }

    @Override
    public T pop() {
        T temp = data[0];
        if(data[0] == null) {
            return null;
        }

        for (int i = 0; i < capacity - 1 ; i++) {
            data[i] = data[i + 1];
        }
        size--;
        return temp;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "ArrayPriorityQueue{" +
                "data=" + Arrays.toString(data) +
                '}';
    }
}
