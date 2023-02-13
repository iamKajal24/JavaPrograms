package Programs;

public class ReverseArray {

	public static void main(String[] args) {
		// program to reverse an array
        //element 1 2 3 4 5
		//index   0 1 2 3 4
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		System.out.println("The original array :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Reverse the array: ");
		for (int j = arr.length - 1; j >= 0; j--) {
			System.out.print(arr[j] + " ");
		}
	    System.out.println();
	}
}
