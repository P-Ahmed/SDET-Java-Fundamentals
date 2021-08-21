/*2. Find the second largest number from an array by user input using function*/

package Assignment04_18_08_2021;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment04_02 {
    static Scanner scanner = new Scanner(System.in);

    public static void arraySortingInDescendingOrder(int[] number) {
        Arrays.sort(number);
        for (int i = 0, j = number.length - 1, temp; i < j; i++, j--) {
            temp = number[i];
            number[i] = number[j];
            number[j] = temp;
        }
    }

    public static void main(String[] args) {
        System.out.println("How many numbers you wish to input into array?");
        int number = scanner.nextInt();

        int[] array = new int[number];

        System.out.println("Kindly don't input duplicate numbers!");
        System.out.println("Input following numbers and press \"Enter\" key!");
        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }
        arraySortingInDescendingOrder(array);

        System.out.println("The second largest number of the array is: " + array[1]);
    }
}