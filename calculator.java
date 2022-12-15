package OOPS11;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("addition");
		System.out.println("substraction");
		System.out.println("multiplication");
		System.out.println("division");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number :");
		int op1 = sc.nextInt();

		if (op1 == 1) {
			Scanner sc1 = new Scanner(System.in);
			System.out.println("enter first value");
			double a = sc1.nextDouble();

			Scanner sc2 = new Scanner(System.in);
			System.out.println("enter second value");
			double b = sc1.nextDouble();
			System.out.println(a + b);
		}

		if (op1 == 2) {

			Scanner sc1 = new Scanner(System.in);
			System.out.println("enter first value");
			float a = sc1.nextFloat();

			Scanner sc2 = new Scanner(System.in);
			System.out.println("enter second value");
			float b = sc1.nextFloat();
			System.out.println(a - b);
		}
		if (op1 == 3) {

			Scanner sc1 = new Scanner(System.in);
			System.out.println("enter first value");
			float a = sc1.nextFloat();

			Scanner sc2 = new Scanner(System.in);
			System.out.println("enter second value");
			float b = sc1.nextFloat();
			System.out.println(a * b);
		}
		if (op1 == 4) {

			Scanner sc1 = new Scanner(System.in);
			System.out.println("enter first value");
			float a = sc1.nextFloat();

			Scanner sc2 = new Scanner(System.in);
			System.out.println("enter second value");
			float b = sc1.nextFloat();
			System.out.println(a / b);
		} else if (op1 >= 4) {
			System.out.println("enter the number between 1 to 4");
		}
	}
}