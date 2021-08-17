/*1. Write a program to sum of digits of a number by taking from user input.*/

package assignment03_14_08_2021;

import java.util.Scanner;

public class Assignment03_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;

        while (number != 0) {
            int rem = number % 10; // to get the last digit of the number
            number = number / 10; // to get rid of the last digit of the number
            sum = sum + rem; // adding the gotten digit from "rem" one by one
        }
        System.out.println("Summation of the digits of your inputted number: " + sum);
    }


}
