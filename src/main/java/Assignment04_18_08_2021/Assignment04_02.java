/*2. Find the second largest number from an array by user input using function*/

package Assignment04_18_08_2021;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment04_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers you wish to input?");
        int number = scanner.nextInt();

        int[] num = new int[number];

        System.out.println("Kindly don't input duplicate numbers!");
        System.out.println("Input a number and press \"Enter\" key");
        for (int i = 0; i < number; i++) {
            num[i] = scanner.nextInt();
        }
        Arrays.sort(num);

        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i]>max){
                max = num[i];
            }
        }
        System.out.println("The second max number of the array is: "+num[num.length - 2]);
    }
}