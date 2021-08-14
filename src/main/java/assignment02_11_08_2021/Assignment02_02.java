/*2.Write a program to calculate CGPA and find grade from 4 subjects (GPA will based upon your university*/

package assignment02_11_08_2021;

import java.util.Scanner;

public class Assignment02_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number[] = new int[4];
        int count = 0;
        double totalGrade = 0;

        try {
            for (int i = 0; i <= 3; i++) {
                System.out.println("Enter your achieved number of course number " + (i + 1) + ":");
                number[i] = scanner.nextInt();
            }
        } catch (Exception e) {
            System.out.println("\nThe exception is: "+ e);
            System.out.println("Kindly re-run the program and input only integer number.");
            System.exit(0);
        }

        //checking numbers against grades and adding them for final grade calculation
        for (int i = 0; i < 4; i++) {
            if (number[i] >= 80.00 && number[i] <= 100.00) {
                totalGrade = totalGrade + 4.00;
            } else if (number[i] >= 75.00 && number[i] <= 79.99) {
                totalGrade = totalGrade + 3.75;
            } else if (number[i] >= 70.00 && number[i] <= 74.99) {
                totalGrade = totalGrade + 3.50;
            } else if (number[i] >= 65.00 && number[i] <= 69.99) {
                totalGrade = totalGrade + 3.25;
            } else if (number[i] >= 60.00 && number[i] <= 64.99) {
                totalGrade = totalGrade + 3.00;
            } else if (number[i] >= 55.00 && number[i] <= 59.99) {
                totalGrade = totalGrade + 2.75;
            } else if (number[i] >= 50.00 && number[i] <= 54.99) {
                totalGrade = totalGrade + 2.50;
            } else if (number[i] >= 45.00 && number[i] <= 49.99) {
                totalGrade = totalGrade + 2.25;
            } else if (number[i] >= 40.00 && number[i] <= 44.99) {
                totalGrade = totalGrade + 2.00;
            } else if (number[i] >= 00.00 && number[i] <= 39.99) {
                totalGrade = totalGrade + 0.00;
                count++;
            }
        }
        double CGPA = totalGrade / 4;
        System.out.println("Your CGPA of 4 courses: " + CGPA);

        if (count > 0) {
            System.out.println("Among 4 courses, you have failed in " + count + " courses.");
        }

    }
}
