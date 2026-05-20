package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array {

    static void multiDimensionArray() {
        // 2D array = look like martric
        // | 1 2 3 |
        // | 4 5 6 |
        // | 7 8 9 |

        // 2D array = can be col of a array can be vary
        // | 1 2 | row - 0 | col - 1
        // | 4 5 6 7 8 9 | row - 1 | col - 5
        // | 7 8 9 | row - 2 | col - 2

        // 2d array define with two brackets [][]
        // int[][] twoDArray = new int[2][]; // 2 consider are 2 row column are
        // mnndatory to put, no. of is mandatory
        int[][] twoDArray = {
                { 1, 2 },
                { 4, 5, 6, 7, 8, 9 },
                { 5, 6, 11, 12 }
        };

        // for (int i = 0; i < twoDArray.length; i++) {
        // System.out.print("[");
        // int size = twoDArray[i].length;
        // System.out.println(size);
        // for (int j = 0; j < size; j++) {
        // // System.out.print(" " + twoDArray[i][j] + " ");
        // }
        // System.out.println("]");
        // }

        // for(int i=0; i<twoDArray.length; i++){
        // System.out.println(Arrays.toString(twoDArray[i]));
        // }
        for (int[] a : twoDArray) {
            for (int arr : a) {
                System.out.print(arr);
            }
            System.out.println();
        }

    }

    static void arrayList() {
        // declaration of ArrayList
        // not mandatory of mention wrapper class while create object or initialCapacity
        ArrayList<Integer> arrList = new ArrayList<Integer>(2);
        // ArrayList<Integer> arrList = new ArrayList<>();

        arrList.add(10);
        arrList.add(20);
        arrList.add(30);
        arrList.add(40);
        arrList.add(50);

        // update values at particular index
        // arrList.set(0, 99);
        // System.out.println(arrList.contains(50));
        // System.out.println(arrList);
        // arrList.remove(4);
        // System.out.println(arrList);

        // for (int i = 0; i < arrList.size(); i++) {
        // System.out.println(arrList.get(i));
        // }

        for (int a : arrList) {
            System.out.print(a + " ");
        }

    }

    static int max() {
        int[] arr = { 100, 2, 3, 40, 5, 60 };

        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }

        return maxVal;
    }

    // static ArrayList multiDimensionArrayList() {
    // Scanner input = new Scanner(System.in);

    // // for (int i = 0; i < list.size(); i++) {
    // // for (int j = 0; j < list.get(i).size(); j++) {
    // return list;
    // // }
    // // }

    // }

    static void SwapArray(int[] arr) {
        // int[] newArr = new int[arr.length];
        int temp;
        for (int i = 0; i < arr.length; i++) {
            temp = arr[(arr.length-1) - i];
            arr[arr.length - 1] = arr[i];
            arr[i] = temp;

            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        // int[] varName; // declaratoin of array: varName define in the stack
        // varName = new int[5]; // initialization: actual here object is being
        // created
        // in the memmory

        Scanner input = new Scanner(System.in);

        // System.out.println(max());
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        SwapArray(arr);

        // multiDimensionArray();
        // arrayList();
        // mentioning the datatype of to a Arraylist because we putting arraylist
        // inside
        // it
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // initialize or declare Column 3 here
        // for (int i = 0; i < 3; i++) {
        // list.add(new ArrayList<>()); // adding 3 row of arraylist insize an arraylist
        // }

        // // adding elements
        // for (int i = 0; i < list.size(); i++) {
        // for (int j = 0; j < 3; j++) {
        // list.get(i).add(input.nextInt());
        // }
        // }

        // System.out.println(list);

        // int[] arr = new int[5];
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = input.nextInt();
        // }
        // for (int a : arr) {
        // System.out.println(a);
        // }
        // int[] arr2 = { 1, 2, 3, 4, 5 };

        // System.out.println(Arrays.toString(arr2)); // change int to object of
        // array
        // (string of array)

        // for (int a : arr2) {
        // System.out.print(a + " ");
        // }

        // String[] arr3 = new String[5];
        // for (int i = 0; i < arr3.length; i++) {
        // arr3[i] = input.next();
        // }
        // for (String s : arr3) {
        // System.out.println(s);
    }
}