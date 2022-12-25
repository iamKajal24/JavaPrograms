package DSA;

//bubble sort algorithm, array is traversed from first element to last element. 
//here current element is compared with the next element. if current element is 
//greater than the next element, it is swapped.

/*BUBBLESORT(array)
n=length(array)
Repeat
swapped=false
for(i=1 to n-1)
	if(array[i-1]>array[i]),then
	swap(array[i-1],array[i])
	swapped=true
	end if
	end for
	n=n-1
	until not swapped
	end bubblesort*/

public class BUBBLESORT {

	static void print(int arr[]) // function to print array elements
	{
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	static void bubble(int arr[]) // function to implement bubble sort
	{
		int n = arr.length;
		int i, j, temp;
		for (i = 0; i < n; i++) {
			for (j = i + 1; j < n; j++) {
				if (arr[j] < arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = { 35, 10, 11, 31, 26 };
		BUBBLESORT b1 = new BUBBLESORT();
		System.out.println("before sorting array elements are-");
		b1.print(arr);
		b1.bubble(arr);
		System.out.println();
		System.out.println("after sorting array element are-");
		b1.print(arr);
	}
}
