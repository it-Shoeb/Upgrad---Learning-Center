package DSA;
import java.util.Arrays;


public class Recursion {

    // public static void printNum(int n) {
    // // base case/condition
    // if (n == 0) {
    // return;
    // }

    // // decending order
    // // System.out.println(n + "dec");
    // // print the statement

    // printNum(n - 1);
    // // Recursion //Function calling itself

    // // ascending order
    // // System.out.println(n + "acs");
    // // print the statement
    // } // print number in ascending or decending order

    // Write a recursive function to find the factorial of a number.

    // public static int factorial(int n) {
    // if (n == 1 || n == 0) {
    // return 1;
    // }

    // int fact_n = n * factorial(n - 1);
    // return fact_n;
    // }

    // Print numbers from 1 to N using recursion.

    // public static void tillNumber(int n, int i) {
    // if (n == i) {
    // return;
    // }

    // System.out.println(i);
    // tillNumber(n, i+1);
    // }

    // Find the nth Fibonacci number using recursion.

    // public static void fibonacci(int n, int a, int b) {
    // if (n == 0) {
    // return;
    // }

    // int c = a + b;
    // System.out.print(c + " ");
    // fibonacci(n - 1, b, c);
    // }

    // public static void printNaturalNum(int n, int i, int sum) {
    // if (n == i) {
    // sum += i;
    // System.out.println(sum);
    // return;
    // }
    // sum += i;
    // printNaturalNum(n, i + 1, sum);
    // }

    // print x^n (stack heigh = n)

    public static void printStackTillN(int n, int x, int i) {
        if (n == i) {
            return;
        }

        int xPowerofN = x * n;
        System.out.println(xPowerofN);
        printStackTillN(xPowerofN, x, i - 1);
    }

    public static void main(String[] args) {
        // printNaturalNum(5, 1, 0);
        // System.out.println(factorial(3));
        // tillNumber(5, 0);
        // int a = 0;
        // int b = 1;
        // System.out.print(a + " ");
        // System.out.print(b + " ");
        // fibonacci(5, a, b);
        // printStackTillN(4, 4, 4);

        // msg();

        // java.util.Scanner input = new java.util.Scanner(System.in);
        // int n = input.nextInt();
        // int[] num = new int[n];
        // int aar[] = getNum(n, num);

        // for (int val : aar) {
        // System.out.print(val + " ");
        // }

        // System.out.println(fibonacciNum(n));
        // System.out.println(0);
        // System.out.println(1);
        // int a = fibonacciNum(n);
        // System.out.println(a);

        // Binary Search with recursion
        // there is an array size of n compare middle element with a target element
        // |_______^________| array of n
        //

        // int[] arr = { 1, 1, 2, 3, 5, 8, 13 };
        // System.out.println(binarySearch(0, arr.length - 1, 8, arr));
        // System.out.println(arr[binarySearch(0, arr.length - 1, 8, arr)]);

        // int[] arr = { 1, 2, 3, 4, 5 };

        // sumTriangle(arr);

        // String text = "JAVA";
        // while (text.equalsIgnoreCase("JAVA")) {
        //     text = text.toLowerCase();
        //     System.out.println("Loop");
        // }

        // System.out.println(text);

        // int[] arr = {5,4,3,2,1};
        // Arrays.sort(arr);
        // for (Object elem : arr) {
        //     System.out.print(elem + " ");
        // }

    }

    static void sumTriangle(int[] arr) {
        int[] newArr = new int[arr.length - 1];

        if (arr.length == 1) {
            return;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            newArr[i] = arr[i] + arr[i + 1];
        }

        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println("]");

        sumTriangle(newArr);
    }

    // static int binarySearch(int startIndex, int endIndex, int target, int[] arr)
    // {
    // if (startIndex > endIndex) {
    // return -1;
    // }

    // int mid = startIndex + (endIndex - startIndex) / 2;

    // if (arr[mid] == target) {
    // return mid;
    // }

    // if (arr[mid] > target) {
    // return binarySearch(startIndex, mid - 1, target, arr);
    // }

    // return binarySearch(mid + 1, endIndex, target, arr);
    // }

    // static int fibonacciNum(int n) {
    // if (n == 0 || n == 1) {
    // return 1;
    // }

    // return fibonacciNum(n - 1) + fibonacciNum(n - 2);
    // }

    // static int[] getNum(int n, int[] num) {
    // if (n == 0) {
    // return num;
    // }
    // Scanner input = new Scanner(System.in);
    // int val = input.nextInt();
    // num[n - 1] = val;
    // getNum(n - 1, num);
    // return num;
    // }

    // static void msg() {
    // System.out.println("msg");
    // msg1();
    // System.out.println("msg return");
    // }

    // static void msg1() {
    // System.out.println("msg1");
    // msg2();
    // System.out.println("msg1 return");
    // }

    // static void msg2() {
    // System.out.println("msg2");
    // msg3();
    // System.out.println("msg2 return");
    // }

    // static void msg3() {
    // System.out.println("msg3");
    // msg4();
    // System.out.println("msg3 return");
    // }

    // static void msg4() {
    // System.out.println("msg4");
    // }

    // Sum triangle from array
    // Input : A = {1, 2, 3, 4, 5}
    // Output : [48]
    // [20, 28]
    // [8, 12, 16]
    // [3, 5, 7, 9]
    // [1, 2, 3, 4, 5]
}
