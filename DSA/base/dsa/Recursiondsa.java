
// public class Recursion {
//     // 🟢 Level 1: Basics (Understanding recursion)
//     // Write a recursive function to find the factorial of a number.

//     // x = 5, 4 X 3 X 2 X 1= 24;

//     public static int factorial(int x) {
//         if (x == 0) {
//             return 1;
//         }

//         int newVal = factorial(x - 1);
//         int val = newVal * x;

//         return val;
//     }

//     // Print numbers from 1 to N using recursion.
//     public static int printOneToN(int n) {
//         if (n == 0) {
//             return 1;
//         }

//         printOneToN();

//         return 1;
//     }
//     // Print numbers from N to 1 using recursion.
//     // Find the sum of first N natural numbers using recursion.
//     // Calculate the power of a number (xⁿ) using recursion.
//     // 🟡 Level 2: Slightly Intermediate (Pattern + Logic)
//     // Find the nth Fibonacci number using recursion.
//     // Print Fibonacci series up to N terms recursively.
//     // Find the sum of digits of a number using recursion.
//     // Reverse a string using recursion.
//     // Check if a string is a palindrome using recursion.
//     // 🟠 Level 3: Intermediate (Thinking Recursively)
//     // Count the number of zeros in a number using recursion.
//     // Find the GCD of two numbers using recursion.
//     // Perform binary search using recursion.
//     // Solve Tower of Hanoi problem.
//     // Print all subsequences of a string.
//     // 🔴 Level 4: Advanced (Backtracking + Trees)
//     // Generate all permutations of a string.
//     // Solve N-Queens problem using recursion.
//     // Solve Sudoku using recursion (backtracking).
//     // Find all subsets of an array.
//     // Word break problem (check if string can be segmented).
//     // 🟣 Level 5: Expert (Optimization + DP + Complex Recursion)
//     // Solve Fibonacci using recursion with memoization.
//     // Solve 0/1 Knapsack problem using recursion.
//     // Matrix Chain Multiplication using recursion.
//     // Palindrome Partitioning using recursion.
//     // Solve Rat in a Maze problem.
//     // ⚫ Bonus Challenge (Very Advanced)
//     // Implement Merge Sort using recursion.
//     // Implement Quick Sort using recursion.
//     // Solve expression evaluation (like "23-45") using recursion.
//     // Generate all valid parentheses combinations.
//     // Solve Josephus Problem using recursion.

//     // public static void powerOfXtillN(int x, int n, int i) {
//     public static int powerOfXtillN(int x, int n) {
//         // if (i == 1 || i == 0) {
//         // return;
//         // }

//         // int powerOfX = x * n;
//         // System.out.println(powerOfX);
//         // powerOfXtillN(powerOfX, n, i - 1);

//         // x^n = x * (x^n-1);

//         if (x == 1 || n == 0) {
//             return 1;
//         }

//         int xPower = powerOfXtillN(x, n - 1);
//         // x, n - 1
//         // 2, 5 - 1 = 4
//         // 2, 4 - 1 = 3
//         // 2, 3 - 1 = 2
//         // 2, 2 - 1 = 1

//         int xPow = x * xPower;
//         return xPow;
//     }

//     public static void main(String[] args) {
//         // int x = 2, n = 5;
//         // int ans = powerOfXtillN(x, n);
//         // System.out.println(ans);
//         // powerOfXtillN(x, x,);

//         // 1. // System.out.println(factorial(4));
//     }
// }