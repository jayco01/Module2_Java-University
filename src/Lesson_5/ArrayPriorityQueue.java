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
        if (size == capacity) {
            enlargeArrayCapacity();
        }

        int index = size - 1;
        while (index >= 0 && data[index].getPriority() < elem.getPriority()) {
            data[index + 1] = data[index];
            index--;
        }

        data[index + 1] = elem;
        size++;
    }



    @Override
    public T pop() {
        if(data[0] == null || size == 0) {
            return null;
        }

        T highestPrio = data[0];

        // shift all elements to the left/beginning
        for (int i = 0; i < size - 1 ; i++) {
            data[i] = data[i + 1];
        }

        size--;
        data[size] = null;//delete last value

        if (size <= capacity/4) {
            shrinkArrayCapacity();
        }

        return highestPrio;
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

    public void enlargeArrayCapacity() {
        capacity *= 2;
        T[] newArray = (T[]) Array.newInstance(data.getClass(), capacity);
        System.arraycopy(data, 0, newArray, 0, size);
        data = newArray;
    }

    private void shrinkArrayCapacity() {
        T[] newTArray = (T[]) Array.newInstance(data.getClass().getComponentType(), capacity/2);
        System.arraycopy(data, 0, newTArray, 0, size);
        data = newTArray;
    }
}
