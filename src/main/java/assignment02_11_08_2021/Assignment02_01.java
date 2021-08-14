/*1. Write a program that takes a year from user and print whether that year is a leap year or not*/

package assignment02_11_08_2021;

import java.util.Scanner;

public class Assignment02_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year to check if it is leap year or not.");

        int year = scanner.nextInt();

        if (year % 4 == 0) { //if year is divided by 4, then it is a leap year. otherwise it is not a leap year.
            if (year % 100 != 0) { //after that, if year is not divided by 100, then it is a leap year. otherwise it needs to be checked dividing by 400.
                System.out.println(year + " is a leap year.");
            } else {
                if (year % 400 == 0) { //if year is divided by 400, then it is a leap year. otherwise it is not a leap year.
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is not a leap year.");
                }
            }
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
