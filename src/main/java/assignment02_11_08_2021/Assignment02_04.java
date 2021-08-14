/*4. Write a program to check balance and withdraw money from ATM booth using switch case and if else (1. Check balance, 2. Withdraw Money, 3. Deposit Money)
Notes:
a. If user inputs wrong PIN more than 3 times, following error should be shown: "You have entered wrong PIN more than 3 times. Card has blocked." and takes the valid PIN again
b. If user inputs an amount that is not divisible by 500, then system should throw an error message as "Balance is not divisible by 500. Please try with another amount" and takes the valid input again
c. If user inputs more than balance, then system should throw an error message as "Not enough balance. Please input valid amount" and takes the valid input again*/

package assignment02_11_08_2021;

import java.util.Scanner;

public class Assignment02_04 {
    static int amount = 5000;
    static Scanner scanner;

    public static void checkBalance() {
        System.out.println("Your balance is: " + amount + ".");
    }

    public static void withdrawMoney() {
        System.out.println("Enter the amount to withdraw which have in your current balance:");
        System.out.println("Entered amount must be multiplied by 500!");
        int withdrawingAmount = scanner.nextInt();
        if (withdrawingAmount % 500 == 0) {
            if (withdrawingAmount <= amount) {
                amount = amount - withdrawingAmount;
                System.out.println("Withdraw successful!!\nYour current balance is " + amount + ".");
                System.exit(0);
            } else {
                System.out.println("Your account does not have that much balance.\n");
                withdrawMoney();
            }
        } else {
            System.out.println("Withdrawing amount is not multiplied by 500.\n");
            withdrawMoney();
        }
    }

    public static void depositMoney() {
        System.out.println("Enter the amount of money you wish to deposit: ");
        System.out.println("Depositing amount must be multiplied by 500!");
        int depositingAmount = scanner.nextInt();
        if (depositingAmount % 500 == 0) {
            amount = amount + depositingAmount;
            System.out.println("Your money has been successfully deposited!\nYour current balance is " + amount + ".");
        } else {
            System.out.println("Depositing amount is not multiplied by 500.\n");
            depositMoney();
        }

        System.exit(0);
    }

    public static void pinChecking() {
        String myPin = "tycoon";
        int pinCounter = 1;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter your PIN: ");
            String pin = scanner.next();
            if (pinCounter < 3) {
                if (pin.equals(myPin)) {
                    System.out.println("Your pin is correct!\n");
                    break;
                } else {
                    System.out.println("Wrong PIN entered!");
                    pinCounter++;
                }
            } else {
                if (pin.equals(myPin)) {
                    System.out.println("Your pin is correct!\n");
                    break;
                } else {
                    System.out.println("\nYou have entered wrong PIN more than 3 times. \nYour card is blocked!!!");
                    System.exit(0);
                }
            }
        }
    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        System.out.println("Welcome to the Simplicity ATM Booth!");
        System.out.println("1. Check balance");
        System.out.println("2. Withdraw money");
        System.out.println("3. Deposit money");
        System.out.println("0. Leave");
        int userInput = scanner.nextInt();

        switch (userInput) {
            case 1:
                pinChecking();
                checkBalance();
                break;
            case 2:
                pinChecking();
                withdrawMoney();
                break;
            case 3:
                pinChecking();
                depositMoney();
                break;
            default:
                System.exit(0);
        }
    }
}
