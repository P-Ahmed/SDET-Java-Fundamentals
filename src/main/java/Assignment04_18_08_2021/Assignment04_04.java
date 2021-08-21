/*4. Write a program to find the position of a matched value from an array. If not matched, return -1 using function.
Given array is: {10,5,2,3,2,7,7,15,10}
Input: User inputs 7
Output: Position: 5
*/

package Assignment04_18_08_2021;

import java.util.Scanner;

public class Assignment04_04 {
    static int number;
    static int[] array = {10, 5, 2, 3, 2, 7, 7, 15, 10};

    public static int gettingPosition() {

        int position = 0;
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != number) {
                counter++;
                continue;
            } else {
                position = i;
                break;
            }
        }
        if (counter == array.length) {
            return -1;
        } else {
            return position;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number you wish to find: ");
        number = scanner.nextInt();

        if (gettingPosition() == -1) {
            System.out.println("\nUsers inputted number is not found in the array.\noutput: -1 ");
        } else {
            System.out.println("\nInput: User inputs " + number);
            System.out.println("Output: Position: " + gettingPosition());
        }
    }
}
