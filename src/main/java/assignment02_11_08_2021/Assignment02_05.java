/*5. Take a number as input from the user. Now write a program to show table of the given numbers*/

package assignment02_11_08_2021;

import java.util.Scanner;

public class Assignment02_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to show it's multiplications: ");
        int number = scanner.nextInt();

        System.out.println("\nMultiplications of number " + number + " up to 10 are:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + "*" + i + "=" + (number * i));
        }
    }
}
