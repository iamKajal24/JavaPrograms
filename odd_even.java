package Programs;

import java.util.Scanner;

public class odd_even {

	public static void main(String[] args) {
		//odd no. 1,3,5,7,9
		//even no.0,2,4,6,8
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the original number :");
		int n=sc.nextInt();
         
			if(n%2==0) {
			   count++;
			}
			if(count==0) {
				System.out.println("odd number");
			}
			else {
				System.out.println("even number");
			}
		}
	}


