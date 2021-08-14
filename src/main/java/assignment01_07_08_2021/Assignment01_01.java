/*1. Write a program to set your name and university in variables and print in this format:
        "Hello, I am ____. I passed from ___ university. "*/

package assignment01_07_08_2021;

import java.util.Scanner;

public class Assignment01_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kindly, enter your full name: ");
        String name = sc.nextLine();

        System.out.println("Please, enter your university name: ");
        String universityName = sc.nextLine();

        System.out.println("\"Hello, I am " + name + ". I passed from " + universityName + ".\"");
    }
}
