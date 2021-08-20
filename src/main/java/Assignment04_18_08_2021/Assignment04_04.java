/*4. Write a program to find the position of a matched value from an array. If not matched, return -1 using function.
Given array is: {10,5,2,3,2,7,7,15,10}
Input: User inputs 7
Output: Position: 5
*/

package Assignment04_18_08_2021;

import java.util.Scanner;

public class Assignment04_04 {
    public static void main(String[] args) {
        int[] array = {10, 5, 2, 3, 2, 7, 7, 15, 10};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number you wish to find: ");
        int number = scanner.nextInt();
        int position = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != number) {
                continue;
            } else {
                position = i;
                break;
            }
        }
        System.out.println("Position: " + position);
    }
}
