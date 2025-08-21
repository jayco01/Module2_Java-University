package Lesson_10;

import java.util.Arrays;

public class Recursion {
    public static int findMaxNumInArray(int[] arr) {
        int maxNum = Integer.MIN_VALUE;
        int index = 0;

        return recursiveFindMaxNumInArray(maxNum, arr, index);
    }

    private static int recursiveFindMaxNumInArray(int maxNum, int[] arr, int index) {
        if (index == arr.length ) return maxNum;

        maxNum = (maxNum < arr[index]) ? arr[index] : maxNum;

        return recursiveFindMaxNumInArray(maxNum, arr, index + 1);
    }
}
