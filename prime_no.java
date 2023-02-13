package Programs;

import java.util.Scanner;

public class prime_no {

	public static void main(String[] args) {
		
		System.out.println(" Enter the number :");
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		
		boolean prime=true;
		for (int i = 2; i <= p/2; i++) {
			if (p % i == 0) {
				prime=false;
				break;
			}
		}
		if (prime == true) {
			System.out.println("prime number ");
		} else {
			System.out.println("not prime number  ");
		}

	}


}
