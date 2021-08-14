/*3. Write a program to take 3 inputs from user and do sum and average*/

package assignment01_07_08_2021;

import java.util.Scanner;

public class Assignment01_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Enter the third number: ");
        double num3 = scanner.nextDouble();

        double sum = num1 + num2 + num3;
        double average = ((num1 + num2 + num3) / 3);

        System.out.println("The sum of three numbers is: " + sum);
        System.out.println("The average of three numbers is: " + average);
    }
}
