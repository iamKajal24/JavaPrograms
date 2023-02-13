package Programs;

import java.util.Scanner;

public class smallest_element_in_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]=new int[5];
      Scanner Sc=new Scanner(System.in);
      for(int i=0;i<arr.length;i++)
      {
    	  arr[i]=Sc.nextInt();
      }
      int min=arr[0];
      for(int i=1;i<arr.length;i++) {
    	 if(arr[i]<min) {
    		 min=arr[i];
    	 }
      }
      System.out.print("Smallest element :"+min);
	}

}
