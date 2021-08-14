/*5. Write a program to solve (a+b)^2 by taking input a and b from the user [^2 means whole square]*/

package assignment01_07_08_2021;

import java.util.Scanner;

public class Assignment01_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter number b: ");
        double b = scanner.nextDouble();

        System.out.println(Math.pow(a,2) + 2 * a * b + Math.pow(b,2));
    }
}
