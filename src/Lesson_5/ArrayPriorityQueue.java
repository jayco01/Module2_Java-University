package Lesson_5;


import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPriorityQueue<T extends HasPriority> implements PriorityQueue<T> {
    // TODO: Implement Array Prio Queue using an array as the data storage

    private T[] data;
    private int size;

    public ArrayPriorityQueue( Class<T> tClass,int size) {
        try
        {
            this.size = size;
            data = (T[]) Array.newInstance(tClass,size);
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
        int newSize;

        if (data[size-1] != null) {
            newSize = size + 1;
            newTArray = (T[]) Array.newInstance(elem.getClass(), newSize);
        } else {
            newSize = data.length;
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
        data = newTArray;


//        else {
//            for (int i = size - 1; i >= 0 ; i--) {
//                if (data[i] == null) {
//                    continue;
//                }
//                else if(elem.getPriority() >= data[i].getPriority() ) {
//                    newTArray[i + 1] = elem;
//                    newTArray[i] = data[i];
//                    i--;
//                }
//                else {
//                    newTArray[i + 1] = data[i];
//                }
//            }
//            data = newTArray;
//        }

    }

    @Override
    public T pop() {
        T temp = data[0];
        if(data[0] == null) {
            return null;
        }

        for (int i = 0; i < size - 1 ; i++) {
            data[i] = data[i + 1];
        }
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
