import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int starter = input.nextInt();
        int mainCourse = input.nextInt();
        int dessert = input.nextInt();
        int drink = input.nextInt();

        double sum = 0;
        if (starter != 0) {
            sum = 5 * starter;
        } else if (mainCourse != 0) {
            sum = 10 * mainCourse;

        } else if (dessert != 0) {
            sum = 4.5 * dessert;

        } else if (drink != 0) {
            sum = 2.5 * drink;

        }

    }
}

// Instructions

// You are assigned to develop a Java program to calculate the total bill for
// customers at a restaurant. The program should calculate the bill based on the
// items ordered and their prices from the given menu. Additionally, the program
// should apply any applicable discounts or service charges based on the
// following rules:

// Consider the following menu:

// Starter: $5.00

// Main Course: $10.00

// Dessert: $4.50

// Drinks: $2.50

// Additional rules:

// If dessert is also ordered along with main course, apply 20% discount on the
// price of dessert

// If the total bill is above $30, apply a 5% discount or if the total bill is
// above $50, apply a 10% discount.

// If both conditions are true then apply rule 1 then check for the rule 2. If
// total bill still exceeds $30 or $50, apply the discount.

// Implement the program using if-else statements.
// Input: 1 1 1 1
// Quantities of Starter, Main Course, Dessert and Drinks are separated by a
// space.
// Output: 21.1

// The output of the program should be the total bill amount after applying any
// discounts or service charges.

// // Q5
// int temp = input.nextInt();

// if (temp < 10) {
// System.out.println("skiing");
// } else if (temp >= 10 && temp < 20) {
// System.out.println("hiking");
// } else if (temp >= 20 && temp < 30) {
// System.out.println("cycling");
// } else if (temp >= 30) {
// System.out.println("swimming");
// }

// Instructions

// Develop a Java program to provide weather recommendations based on the
// current temperature. The program should suggest activities according to the
// following criteria:

// If the temperature is below 10°C, recommend skiing.
// If the temperature is between 10°C and 20°C (inclusive), recommend hiking.
// If the temperature is between 20°C and 30°C (inclusive), recommend cycling.
// If the temperature is above 30°C, recommend swimming.
// Implement the program using if-else statements.

// Input: 15
// Output: hiking

// Q4

// import java.util.Scanner;

// public class Main {
// public static void main(String[] args) {

// Scanner input = new Scanner(System.in);
// boolean qualification = input.nextBoolean();
// int experience = input.nextInt();

// if (qualification && experience > 2) {
// System.out.println("Applicant is eligible.");
// } else {
// System.out.println("Applicant is not eligible.");

// }

// }
// }

// Design a Java program to assess the eligibility of job applicants for a
// specific job position. The program should take into account the applicants'
// qualifications and experience. Implement the program using if-else
// statements.

// If applicant has the qualification and experience more than 2 years, then
// applicant is eligible.
// Input: true
// 2
// The input to the program should consist of the following details for each
// applicant:
// Qualifications (boolean): Whether the applicant possesses the required
// qualifications for the job position. (true if qualified, false otherwise)
// Experience (int): The number of years of relevant experience the applicant
// has.

// Output: Applicant is not eligible.
// Input: true
// 4
// Output: Applicant is eligible

// Q3

// import java.util.Scanner;

// public class jm1 {
// public static void main(String[] args) {

// Scanner input = new Scanner(System.in);
// int score = input.nextInt();

// switch (score) {
// case 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100:
// System.out.println("Grade A");
// break;
// case 80, 81, 82, 83, 84, 85, 86, 87, 88, 89:
// System.out.println("Grade B");
// break;
// case 70, 71, 72, 73, 74, 75, 76, 77, 78, 79:
// System.out.println("Grade C");
// break;
// case 60, 61, 62, 63, 64, 65, 66, 67, 68, 69:
// System.out.println("Grade D");
// break;
// default:
// System.out.println("Grade F");
// break;
// }

// }
// }

// Problem Statement:

// You're tasked with creating a program to assign grades to students based on
// their test scores. The program should take the student's test score as input
// and determine their grade based on the following criteria:

// Score Range 90-100: Grade A
// Score Range 80-89: Grade B
// Score Range 70-79: Grade C
// Score Range 60-69: Grade D
// Score Below 60: Grade F

// Input: 95
// Output: A

// Implement a Java program using switch-case statements to determine the grade
// based on the given test score.

// Q2
// import java.util.Scanner;

// public class jmq {
// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);

// // String category = input.next();
// // boolean eligible = input.nextBoo/lean();
// String category = "clothing";
// boolean eligible = true;

// if (category == "electronics") {
// if (eligible) {
// System.out.println(1000 - (1000 / 10));
// }
// } else if (category == "clothing") {
// if (eligible) {
// System.out.println(1000 - (1000 / 20));
// }
// } else if (category == "grocery") {
// System.out.println(1000);
// }

// }
// }

// // You're developing a program to determine the final price of a product
// based
// // on its category and the customer's eligibility for a discount. The program
// // should use nested if-else statements to calculate the final price.

// // Instructions:
// // Write a Java program to implement the product price calculation logic
// using
// // nested if-else statements.
// // Ensure that the program takes inputs for the product category and the
// // customer's discount eligibility.
// // Calculate the final price based on the following rules:
// // If the product category is "electronics" and the customer is eligible for
// a
// // discount, apply a 10% discount on the base price.
// // If the product category is "clothing" and the customer is eligible for a
// // discount, apply a 20% discount on the base price.
// // If the product category is "grocery", no discount is applicable.
// // If the customer is not eligible for a discount, the final price remains
// the
// // same as the base price.

// // Your task is to implement the Java program and provide the test cases to
// // ensure the accuracy of the price calculation logic.
// // Input: 1000
// // Electronics
// // true
// // Output: 900.0