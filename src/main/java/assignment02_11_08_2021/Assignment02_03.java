/*3. Create a math quiz program. Scenario: 2 numbers will generate randomly and prompt user to input the summation
of 2 numbers. If user inputs the correct summation, print "Answer is correct" and user will get 1 point. if user
inputs wrong summation,  then user will get 0 point. Finally after 5 iteration, total score will be shown.*/

package assignment02_11_08_2021;

import java.util.Scanner;

public class Assignment02_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = 1;
        int max = 100;
        int pointsCounter = 0;

        System.out.println("\nWelcome to the math quiz!");
        System.out.println("Kindly always input integer number.");
        System.out.println("\nQuiz begins:\n");
        try{
            for (int i = 1; i<=5; i++){
                int numberOne = (int) (Math.random()*(max-min)+min);
                int numberTwo = (int) (Math.random()*(max-min)+min);
                System.out.println("Question number "+i+":");
                System.out.println("What is the sum of "+numberOne+" and "+numberTwo+"?");
                int sum = scanner.nextInt();
                if ((numberOne + numberTwo == sum)){
                    System.out.println("Correct!");
                    pointsCounter++;
                }
                else {
                    System.out.println("Wrong!");
                }
            }
        } catch (Exception e){
            System.out.println("\nYour exception is: "+e);
            System.out.println("You have inputted other than integer number!");
            System.out.println("You have failed!!!");
            System.exit(0);
        }

        System.out.println("\nQuiz end! Your total score is "+pointsCounter+" out of 5");


    }
}
