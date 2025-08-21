package Lesson_10;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,6,5,4};
        String str = "I really like eating Italian sandwich for lunch.";
        char charToCount = 'i';
        int numberToSum = 123;
        
        System.out.print("The Max Number in the Array is: ");
        System.out.println(Recursion.findMaxNumInArray(numbers));

        System.out.print("The Sum of all the elements in the Array is: ");
        System.out.println(Recursion.sumAllElementsInArray(numbers));
        
        System.out.print("The number of '" + charToCount + "' elements in the String is: ");
        System.out.println(Recursion.countCharOccurrences(str, charToCount));

        System.out.print("The sum of all Digits in '" + numberToSum + "' elements in the String is: ");
        System.out.println(Recursion.sumDigitsOfInt(numberToSum));

    }
}
