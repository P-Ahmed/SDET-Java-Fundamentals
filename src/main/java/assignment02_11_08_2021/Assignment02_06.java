/*Write a program to print prime numbers from 2 to n [n is a number that will be taken from user input]*/

package assignment02_11_08_2021;

import java.util.Scanner;

public class Assignment02_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the last number until which you want to print prime numbers: ");
        int n = scanner.nextInt();

        System.out.println("The prime numbers are: ");
        for (int j = 2; j <= n; j++) {
            int counter = 0;
            for (int i = 1; i <= j; i++) {
                if (j % i == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                System.out.println(j + " ");
            }
        }
    }
}
