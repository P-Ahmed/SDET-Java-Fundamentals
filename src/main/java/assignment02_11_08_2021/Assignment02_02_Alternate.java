package assignment02_11_08_2021;

import java.util.Scanner;

public class Assignment02_02_Alternate {
    static int count = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your achieved number of course number 1:");
        int courseOne = scanner.nextInt();
        System.out.println("Enter your achieved number of course number 2:");
        int courseTwo = scanner.nextInt();
        System.out.println("Enter your achieved number of course number 3:");
        int courseThree = scanner.nextInt();
        System.out.println("Enter your achieved number of course number 4:");
        int courseFour = scanner.nextInt();

        Assignment02_02_Alternate obj = new Assignment02_02_Alternate();
        double CGPA = (obj.gradeCalculation(courseOne) + obj.gradeCalculation(courseTwo) + obj.gradeCalculation(courseThree) + obj.gradeCalculation(courseFour))/4;

        System.out.println("Your CGPA of 4 courses: " + CGPA);

        if (count > 0) {
            System.out.println("Among 4 courses, you have failed in " + count + " courses.");
        }
    }

    public double gradeCalculation(int courseNumber){
        if (courseNumber >= 80.00 && courseNumber <= 100.00) {
            return 4.00;
        } else if (courseNumber >= 75.00 && courseNumber <= 79.99) {
            return 3.75;
        } else if (courseNumber >= 70.00 && courseNumber <= 74.99) {
            return 3.50;
        } else if (courseNumber >= 65.00 && courseNumber <= 69.99) {
            return 3.25;
        } else if (courseNumber >= 60.00 && courseNumber <= 64.99) {
            return 3.00;
        } else if (courseNumber >= 55.00 && courseNumber<= 59.99) {
            return 2.75;
        } else if (courseNumber >= 50.00 && courseNumber <= 54.99) {
            return 2.50;
        } else if (courseNumber >= 45.00 && courseNumber <= 49.99) {
            return 2.25;
        } else if (courseNumber >= 40.00 && courseNumber <= 44.99) {
            return 2.00;
        } else if (courseNumber >= 00.00 && courseNumber <= 39.99) {
            count++;
            return 0.00;
        }
        else{
            return 0;
        }
    }
}
