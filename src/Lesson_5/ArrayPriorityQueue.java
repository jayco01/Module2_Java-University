package Lesson_5;


import java.lang.reflect.Array;

public class ArrayPriorityQueue<T extends HasPriority> implements PriorityQueue<T> {
    // TODO: Implement Array Prio Queue using an array as the data storage

    private T[] data;
    private int size;

    public ArrayPriorityQueue(Class<T> Patient,int size) {
        try
        {
            this.size = size;
            data = (T[]) Array.newInstance(Patient.class, size);
        }
        catch (Exception e)
        {
            System.out.println("Error Creating ArrayPriorityQueue. Message: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public void put(T elem) {
        T[] newTArray = (T[]) Array.newInstance(elem.getClass(), size + 1);
        T temp;

        for (int i = size - 1; i >= 0 ; i--) {
            if(elem.getPriority() >= data[i].getPriority() ) {
                newTArray[i + 1] = elem;
                newTArray[i] = data[i];
            } else {
                newTArray[i + 1] = data[i];
            }
        }
        data = newTArray;
    }

    @Override
    public T pop() {

    }

    @Override
    public int size() {
        return size;
    }
}
