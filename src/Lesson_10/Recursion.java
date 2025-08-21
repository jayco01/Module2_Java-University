package Lesson_10;

import java.util.Arrays;

public class Recursion {
//    public static int FindMaxNumInArray(int[] arr) {
//        int maxNum = Integer.MIN_VALUE;
//        int[] newArray;
//
//        if(arr[0] > maxNum) {
//            maxNum = arr[0];
//        }
//        if(0 == arr.length) return maxNum;
//
//        newArray = Arrays.copyOfRange(arr, 1, arr.length);
//        FindMaxNumInArray(newArray);
//        return maxNum;
//    }

    public static int FindMaxNumInArray(int[] arr) {
        int greaterNum;
        int[] newArray;

        if(arr[0] > arr[1]) {
            greaterNum = arr[0];
            Arrays.
        }
        if(0 == arr.length) return maxNum;

        newArray = Arrays.copyOfRange(arr, 1, arr.length);
        FindMaxNumInArray(newArray);
        return maxNum;
    }
}
