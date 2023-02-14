package Programs;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
	
		System.out.println("enter the original number :");
		Scanner ob=new Scanner(System.in);
		int num=ob.nextInt();
		int fact=1;
		
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}
}
