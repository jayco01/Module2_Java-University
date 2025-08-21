package Lesson_10;

import java.util.Arrays;

// Count the number of occurrence of a char in a string
public class Recursion {
    public static int countCharOccurrences(String str, char ch) {
        int count = 0;
        int index = 0;

        return recursiveCountCharOccurrences(ch, count, str, index);
    }

    private static int recursiveCountCharOccurrences(char ch, int count, String str, int index) {
        if (index == str.length()) {return count;}
        char lowerCh = Character.toLowerCase(ch);
        char lowerStrCh = Character.toLowerCase(str.charAt(index));
        if(Character.compare(lowerCh, lowerStrCh) == 0) count++;

        return recursiveCountCharOccurrences(ch, count, str, index+1);
    }

    // Sum all elements in Array
    public static int sumAllElementsInArray(int[] arr) {
        int sum = 0;
        int index = 0;

        return recursiveSumAllElementsInArray(sum, arr, index);
    }

    private static int recursiveSumAllElementsInArray(int sum, int[] arr, int index) {
        if (index == arr.length) {return sum;}
        sum += arr[index];

        return recursiveSumAllElementsInArray(sum, arr, index + 1);
    }

    // Find Max Number in Array
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
