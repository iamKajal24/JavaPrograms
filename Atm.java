package OOPS11;

import java.util.Scanner;

//CREATE ATM class to implement the ATM functionality  
public class ATM {

	public static void main(String[] args) // main method starts
	{
		// declare and initialize balance, withdraw, and deposit
		int balance = 100000, withdraw, deposit;

		// create scanner class object to get choice of user
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("automated teller machine");
			System.out.println("choose 1 for withdraw");
			System.out.println("choose 2 for deposit");
			System.out.println("Checkbox 3 for Check balance");
			System.out.println("choose 4 for exit");
			System.out.println("choose the operation you want to perform");

			// get choice from user
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enter money to be withdraw :");

				// get the withdraw money from user
				withdraw = sc.nextInt();

				// check whether the balance is greater than or equal to the withdrawal amount
				if (balance >= withdraw) {
					// remove the withdraw amount from the total balance
					balance = balance - withdraw;
					System.out.println("please collect your money ");
				} else {
					// show custom error message
					System.out.println("insufficient Balance");
				}
				System.out.println("");
				break;

			case 2:
				System.out.println("enter money to be deposited:");

				// get deposit amount from to user
				deposit = sc.nextInt();

				// add the deposit amount to the total balance
				balance = balance + deposit;
				System.out.println("your money has beeen successfully deposited");
				System.out.println("");
				break;

			case 3:
				// displaying the total balance of the user
				System.out.println("Balance :" + balance);
				System.out.println("");
				break;

			case 4:
				// exit from the menu
				System.exit(0);
			}
		}
	}
}
