package Programs;

import java.util.Scanner;

public class swappingwithoutthirdvariable {

	public static void main(String[] args) {

		int x,y;
		System.out.println("enter x and y :");
		Scanner obj=new Scanner(System.in);
		
		x=obj.nextInt();
		y=obj.nextInt();
		
		System.out.println("before swapping \nx:"+x+"\ny:"+y);
        x=x+y;
        y=x-y;
        x=x-y;
        
        System.out.println("after swapping \nx:"+x+"\ny:"+y);
		
	}
}
