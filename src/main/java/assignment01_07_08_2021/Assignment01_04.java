/*4. Write a program to generate random numbers from minimum range to maximum range by user input*/

package assignment01_07_08_2021;

import java.util.Scanner;

public class Assignment01_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the minimum range of random numbers : ");
        int min = scanner.nextInt();
        System.out.println("Enter the maximum range of random numbers : ");
        int max = scanner.nextInt();

        double random = (Math.random() * (max - min) + min);
        System.out.println(random);

//        int randomInt = (int)(Math.random()*(max-min)+min);
//        System.out.println(randomInt);
//
//        double randomFloor = Math.floor(random);
//        System.out.println(randomFloor);
//
//        double randomCeil = Math.ceil(random);
//        System.out.println(randomCeil);
//
//        double randomRound = Math.round(random);
//        System.out.println((int)randomRound);
    }
}
