package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class dishantAssignment01 {
    public static void main(String[] args) {
        // 1.
        // int[] arr1 = { 1, 2, 3, 4 };
        // System.out.println(sumOfAllElements(arr1));

        // 2.
        // int[] arr2= { 5, 1, 9, 3, 7 };
        // findTheMaxAndMin(arr2);

        // 3.
        // int[] arr3 = { 1, 2, 3, 4, 5, 6 };
        // countOddAndEven(arr3);

        // 4.
        // int[] arr4 = { 1, 2, 3, 4, 5 };
        // reverseArray(arr4);

        // 5.
        // int[] arr5 = { 0, 1, 0, 3, 12 };
        // removeAllZeros(arr5);

        // 6.
        // int[] arr6 = { 10, 5, 8, 20, 15 };
        // System.out.println(secondLargestNumber(arr6));

        // 7.
        // int[] arr7 = { 1, 2, 3, 4, 5 };
        // rotateArrayByTwoStep(arr7, 2);

        // 8.
        // int[] arr8 = { 1, 3, 5, 5, 8 };
        // System.out.println(arrayNonDecreasingOrder(arr8));

        // 9.
        // Scanner input = new Scanner(System.in);
        // // int n = input.nextInt();
        // int n = 12;
        // int[] arr9 = { 10, 20, 5, 30, 15 };
        // System.out.println(countGreaterNumberThanAGivenValue(arr9, n));

        // 10. LeetCode Style: Move Zeroes Given an integer array nums, move all 0's to
        // the end while maintaining the relative order of the non-zero elements.
        int[] arr10 = { 0, 1, 0, 3, 12 };
        moveZerosToTheEnd(arr10);

        // Section B: Strings (8 Questions)

        // 11.
        // String s = "hello";
        // reverseString(s);

        // 12.
        // String s = "Radar";
        // System.out.println(checkStringIsPalindrom(s));

        // 13.
        // String s = "Education";
        // System.out.println(countVowelsInAString(s));

        // 14. Count the frequency of a given character. Example: "banana", 'a' → 3
        // String s = "banana";
        // countTheFrequency(s);

        // 15.
        // String s = "HeLLo WoRLd";
        // convertStringToLowercase(s);

        // 16. LeetCode Style: Valid Palindrome (Basic) Given a string, return true if
        // it is a palindrome after removing all non-alphabet characters and ignoring
        // case. Example: "A man a plan a canal Panama" → True
        // String s = "A man a plan a canal Panama";
        // isValidPlindrome(s);

        // 17.
        // String s = "leetcode";
        // System.err.println(findFirstUniquiCharacter(s));

        // 18. Check if two strings are Anagrams. Example: "listen" and "silent" → True
        // String a = "listen";
        // String b = "silent";
        // System.out.println(anagrams(a, b));

        // // 19.
        // int[] arr = { 1, 2, 3, 4, 5 };
        // int target = 0;
        // System.out.println(linearSearchReturnIndex(arr, target));

        // 20.
        // int[] arr = { 1, 2, 3, 4, 5 };
        // int target = 9;
        // twoSumIsEqualToTarget(arr, target);

        // 21.
        // int[] arr = { 1, 2, 3, 4, 5 };
        // System.out.println(containDuplicateIfAppearTwice(arr));

        // 22.
        // int[] arr = { 1, 2, 9 };
        // System.out.println(addOnetoTheInteger(arr));

        // 23. LeetCode Style: Best Time to Buy and Sell Stock Return the maximum profit
        // you can achieve.

        // 24.
        // printAllNumberUsingRecursion(new int[] { 1, 2, 3, 4, 5 });
    }

    // Section C: Basic Algorithms & LeetCode Easy (7 Questions)

    // 25. Find the Factorial of a number using Recursion. Example: 5 → 120

    // 24. Print all numbers from 1 to N using Recursion.
    static void printAllNumberUsingRecursion(int[] arr) {
        int start = 0;

        if (start < arr.length) {
            return;
        }

        printAllNumberUsingRecursion(arr[start++]);
        // System.out.println();
    }

    // 23. LeetCode Style: Best Time to Buy and Sell Stock Return the maximum profit
    // you can achieve.

    // 22. LeetCode Style: Plus One Given array of digits, add 1 to the integer.
    // Example: [1, 2, 9] → [1, 3, 0]

    static String addOnetoTheInteger(int[] arr) {
        // int[] newArr = new int[arr.length];

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
            if (arr[i] >= 9) {
                arr[i] = 0;
            }
        }

        return Arrays.toString(arr);
    }

    // 21. LeetCode Style: Contains Duplicate Return true if any value appears at
    // least twice.
    static boolean containDuplicateIfAppearTwice(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i] + " " + arr[j] + " ");
                if (i != j) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                System.out.println(count);

                if (count >= 2) {
                    return true;
                }

            }
        }

        return false;
    }

    // 20. LeetCode 1 - Two Sum (Easy) Return indices of two numbers that add up to
    // target.
    static void twoSumIsEqualToTarget(int[] arr, int target) {
        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            sum = arr[i] + arr[i + 1];
            if (sum == target) {
                System.out.println(arr[i] + " " + arr[i + 1]);
                return;
            }
        }

    }

    // 19. Implement Linear Search – return index or -1.
    static int linearSearchReturnIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    // Section B: Strings (8 Questions)

    // 18. Check if two strings are Anagrams. Example: "listen" and "silent" → True
    static boolean anagrams(String a, String b) {

        boolean isAnagram = false;

        if (a.length() != b.length()) {
            return false;
        }

        for (int i = 0; i < a.length(); i++) {
            if ()) {

            }
        }

        return true;
    }

    // 17. Find the first unique character (appears only once) and return its index.
    // Example: "leetcode" → 0 ('l')

    static int findFirstUniquiCharacter(String s) {
        for (int i = 0; i < s.length(); i++) {
            boolean find = false;
            for (int j = 0; j < s.length(); j++) {
                // if(s.charAt(i).equalsIgnoreCase(s.charAt(j))){}
                if (i != j) {
                    if (s.toLowerCase().charAt(i) == s.toLowerCase().charAt(j)) {
                        find = true;
                        System.out.println(find + " " + s.charAt(i) + " " + s.charAt(j));
                        break;
                    }
                }
            }

            if (find == false) {
                return i;
            }

        }

        return -1;
    }

    // 16. LeetCode Style: Valid Palindrome (Basic) Given a string, return true if
    // it is a palindrome after removing all non-alphabet characters and ignoring
    // case. Example: "A man a plan a canal Panama" → True

    static boolean isValidPlindrome(String s) {
        String a = s.toLowerCase();

        return false;
    }

    // 15. Convert the entire string to lowercase. Example: "HeLLo WoRLd" → "hello
    // world"
    static void convertStringToLowercase(String s) {
        System.out.println(s.toLowerCase());
    }

    // 14. Count the frequency of a given character. Example: "banana", 'a' → 3
    static void countTheFrequency(String s) {
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {

                }
            }
        }
    }

    // 13. Count the number of vowels in a string. Example: "Education" → 5
    static int countVowelsInAString(String s) {
        int count = 0;

        if (s.toLowerCase().contains("a")) {
            count++;
        }
        if (s.toLowerCase().contains("e")) {
            count++;
        }
        if (s.toLowerCase().contains("i")) {
            count++;
        }
        if (s.toLowerCase().contains("o")) {
            count++;
        }
        if (s.toLowerCase().contains("u")) {
            count++;
        }

        // for (int i = 0; i < s.length(); i++) {
        // if (s.toLowerCase().charAt(i) == 'a' || s.toLowerCase().charAt(i) == 'e' ||
        // s.toLowerCase().charAt(i) == 'i' ||
        // s.toLowerCase().charAt(i) == 'o'
        // || s.toLowerCase().charAt(i) == 'u') {
        // count++;
        // }
        // }

        return count;
    }

    // 12. Check whether a string is Palindrome (ignore case). Example: "Radar" →
    // True
    static boolean checkStringIsPalindrom(String s) {
        String check = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            check += s.charAt(i);
        }

        if (check.equalsIgnoreCase(s)) {
            return true;
        }

        return false;
    }

    // 11. Reverse a given string. Example: "hello" → "olleh"
    static void reverseString(String s) {
        String a = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            a += s.charAt(i);
            System.out.println(i + " " + s.charAt(i));
        }
        System.out.println(a);
    }

    // Section A: Arrays (10 Questions)

    // 10. LeetCode Style: Move Zeroes Given an integer array nums, move all 0's to
    // the end while maintaining the relative order of the non-zero elements.

    static void moveZerosToTheEnd(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                int currentIndexVal = arr[i];
                for (int j = i; j > arr.length - 2; j++) {
                    arr[j] = arr[j - 1];
                }
                arr[arr.length - 1] = currentIndexVal;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    // 9. Count numbers greater than a given value k. Example: nums = [10, 20, 5,
    // 30, 15], k = 12 → 3

    static int countGreaterNumberThanAGivenValue(int[] arr, int n) {
        int count = 0;
        for (int number : arr) {
            if (number > n) {
                count++;
            }
        }
        return count;
    }

    // 8. Check if the array is sorted in non-decreasing order. Example: [1, 3, 5,
    // 5, 8] → True

    static boolean arrayNonDecreasingOrder(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int min = arr[0];

        for (int num : arr) {
            if (min > num) {
                min = num;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (arr[i] >= min) {
                min = arr[i];
            } else {
                System.out.println(arr[i]);
                return false;
            }
        }

        return true;
    }

    // 7. Rotate the array to the right by 2 steps. Example: [1, 2, 3, 4, 5] → [4,
    // 5, 1, 2, 3]

    static void rotateArrayByTwoStep(int[] arr, int k) {

        for (int j = 1; j <= k; j++) {
            int lastIndex = arr[arr.length - 1];

            for (int i = arr.length - 1; i >= 1; i--) {
                arr[i] = arr[i - 1];
            }

            arr[0] = lastIndex;
        }
        System.out.println(Arrays.toString(arr));

    }

    // 6. Find the second largest number in an array. Example: [10, 5, 8, 20, 15] →
    // 15

    static int secondLargestNumber(int[] arr6) {
        int max = 0;
        int secondMax = 0;

        for (int number : arr6) {
            if (number > max) {
                max = number;
            }
        }

        for (int number : arr6) {
            if (max != number) {
                if (number > secondMax) {
                    secondMax = number;
                }
            }
        }
        return secondMax;
    }

    // 5. Remove all zeros from the array and shift non-zero elements to front.
    // Example: [0, 1, 0, 3, 12] → [1, 3, 12, 0, 0]

    static void removeAllZeros(int[] arr) {
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = 0;
            System.out.println(lastIndex);
            if (arr[i] == 0) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
            }

            arr[arr.length - 1] = lastIndex;
        }

        System.out.println(Arrays.toString(arr));
    }

    // 4. Reverse the array without using extra space (in-place). Example: [1, 2, 3,
    // 4, 5] →
    // [5, 4, 3, 2, 1]

    static void reverseArray(int[] arr) {
        int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[(arr.length - 1) - i];
        }

        System.out.println(Arrays.toString(newArr));
    }

    // 3. Count how many numbers are even and how many are odd. Example: [1, 2, 3,
    // 4, 5, 6]
    // → Even: 3, Odd: 3
    static void countOddAndEven(int[] arr2) {
        int odd = 0;
        int even = 0;

        for (int number : arr2) {
            if (number == 0) {
                System.out.println(0 + " couldn't consider Neither, Odd or Even! ");
            } else if (number % 2 == 0) {
                odd++;
            } else {
                even++;
            }
        }

        System.out.println(odd + " " + even);
    }

    // 2. Find the maximum and minimum element in an array. Example: [5, 1, 9, 3, 7]
    // → Max = 9, Min = 1

    static void findTheMaxAndMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int element : arr) {
            if (element > max) {
                max = element;
            }

            if (element < min) {
                min = element;
            }
        }

        System.out.println(min + " " + max);
    }

    // 1. Write a function to return the sum of all elements in an array. Example:
    // [1, 2, 3, 4] → 10
    static int sumOfAllElements(int[] arr) {
        int sum = 0;

        for (int element : arr) {
            sum += element;
        }

        return sum;
    }

}
