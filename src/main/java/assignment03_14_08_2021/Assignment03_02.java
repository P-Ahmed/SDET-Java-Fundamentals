/*Write a program to show range of prime numbers from 2 to n using while loop [n is the number by user input]*/

package assignment03_14_08_2021;

import java.util.Scanner;

public class Assignment03_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the last number until which you want to print prime numbers: ");
        int n = scanner.nextInt();

        System.out.println("\nThe prime numbers are: ");
        int j = 2;
        while (j <= n) {
            int i = 1, counter = 0;
            while (i <= j) {
                if (j % i == 0) {
                    counter++;
                }
                i++;
            }
            if (counter == 2) {
                System.out.print(j + " ");
            }
            j++;
        }
        System.out.println();
    }
}
