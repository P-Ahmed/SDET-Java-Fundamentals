/*2. Write a program to convert double type value to an integer type value*/

package assignment01_07_08_2021;

import java.util.Scanner;

public class Assignment01_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a double type value: ");
        double value = scanner.nextDouble();

//        int intValue = (int) value;
//        System.out.println(intValue);

        System.out.println((int) value);
    }
}
