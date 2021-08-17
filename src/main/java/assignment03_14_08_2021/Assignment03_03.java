/*3. Write a program to make a digital tasbih where the program counts each time user press enter until press 0*/

package assignment03_14_08_2021;

import java.util.Scanner;

public class Assignment03_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int sum = 0;

        System.out.println("\nPlease, read your zikir slowly!!");
        System.out.println("Press \"Enter\" key to count your tasbih: ");
        do {
            System.out.print(sum);
            sum++;
            input = scanner.nextLine();
        } while (input.isEmpty());//pressing "Enter" without typing anything makes the input empty, thus the program continues and increments 1
    }
}
