package DSA;
import java.util.Arrays;

public class LinearSearch {

    static int search(int[] arr, int target) {

        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    static boolean searchOnString(String str, char tar) {
        if (str.length() == 0) {
            return false;
        }
        // for (int i = 0; i < str.length(); i++) {
        // if (str.charAt(i) == tar) {
        // if (str.contains(tar)) {
        // return true;
        // }
        // }
        // }

        for (char ch : str.toCharArray()) {
            if (ch == tar) {
                return true;
            }
        }

        return false;
    }

    static int linearSearchRange(int[] arr, int start, int end, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    static int FindMinimum(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }

        int start = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (start <= arr[i]) {
                start = arr[i];
                return start;
            }
        }

        return -1;
    }

    static int min(int[] arr) {

        if (arr.length == 0) {
            return -1;
        }

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    static int[] multiDementionSearch(int[][] twoDArr, int target) {
        if (twoDArr.length == 0) {
            // return false;
            // return [];
            return null;
        }

        for (int row = 0; row < twoDArr.length; row++) {
            for (int col = 0; col < twoDArr[row].length; col++) {
                if (twoDArr[row][col] == target) {
                    // return true;
                    return new int[] { row, col };
                }
            }
        }

        // return false;
        return null;
    }

    static int multiDementionSearchMax(int[][] arr) {
        int max = Integer.MIN_VALUE;

        for (int[] row : arr) {
            for (int col : row) {
                if (col > max) {
                    max = col;
                }
            }
        }

        return max;
    }

    static int digits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            System.out.println(num);
            num = num / 10;
        }

        return count;
    }

    static boolean isEven(int arr) {

        int digit = digits(arr);

        // for (int i = 0; i < arr.length; i++) {
        // int digit = digits(arr[i]);
        // if (digit % 2 == 0) {
        // count++;
        // }
        // }

        return digit % 2 == 0;
    }

    static int evenNumbers(int[] arr) {

        if (arr.length == 1) {
            return -1;
        }

        int count = 0;
        for (int num : arr) {
            if (isEven(num)) {
                count++;
            }
        }

        return count;

        // int count = 0;

        // int i = 0;
        // while (i < arr.length) {

        // // System.out.println();
        // int length = Integer.toString(arr[i]).length();
        // if (length % 2 == 0) {
        // System.out.println(arr[i] + " " + length);
        // count++;
        // }

        // i++;
        // }

        // return count;
    }

    static void runningOneDSum(int[] nums) {
        int initialIndex = 0;
        int sum = nums[initialIndex];
        for (int i = 0; i < nums.length; i++) {
            while (initialIndex < i) {
                sum = sum + nums[i];
                System.out.println(sum + " " + nums[i]);
                initialIndex++;
            }
            nums[i] = sum;
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {

        // search in the array: return the index if the item found other wise if item
        // not found return -1 (becuase -1 index not exist)
        // int[] arr = { 10, 2, 3, 4, 12, 5, 0 };
        // int target = 0;
        // System.out.println(search(arr, target));

        // System.out.println(min(arr));

        // int[][] twoDArr = {
        // { 1, 2, 3, 4 },
        // { 5, 60 },
        // { 7, 8, 9, 10, 11, 12, 14 },
        // { 15 },
        // };
        // int target = 15;

        // // System.out.println(multiDementionSearch(twoDArr, target));
        // System.out.println(Arrays.toString(multiDementionSearch(twoDArr, target)));
        // System.out.println(multiDementionSearchMax(twoDArr));

        // int[] arr = { 12, 345, 2, 6, 7896 };
        // System.out.println(evenNumbers(arr));

        int[] nums = { 1,1,1,1,1 };
        // Output: [1,3,6,10]
        // Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

        runningOneDSum(nums);

        // String str = "shoeb";
        // char tar = 'i';
        // System.out.println(searchOnString(str, tar));

        // System.out.println(Arrays.toString(str.toCharArray()));
        // System.out.println(linearSearchRange(arr, 1, 3, 12));

        // System.out.println(FindMinimum(arr));

    }
}
