package Lecture2;

public class Swapfunction {

	public static void main(String[] args) {
		// declare
		int[] arr = null;
//		System.out.println(arr);

		// allocate space
		arr = new int[5];
//		System.out.println(arr);

		// set
		arr[0] = 20;
		arr[1] = 40;
		arr[2] = -40;
		arr[3] = 7;

		int i = 0, j = 2;
		int[] other = {100, 200, 300};

		// non working swap
		System.out.println("Non Working Swap!!");
		System.out.println(arr[i] + "," + arr[j]);
		swap(arr[i], arr[j]);
		System.out.println(arr[i] + "," + arr[j]);

		// working swap (changed made in the heap)
		System.out.println("Working Swap!!");
		System.out.println(arr[i] + "," + arr[j]);
		Swap(arr, i, j);
		System.out.println(arr[i] + "," + arr[j]);
		
		// Swap part 3
		System.out.println("Swap part 3");
		System.out.println(arr[0] + "," + other[0]);
		Swapp(arr, other);
		System.out.println(arr[0] + "," + other[0]);
	}

	public static void swap(int one, int two) {
		int temp = one;
		one = two;
		two = temp;
	}

	public static void Swap(int[] arr, int i, int j) {
		System.out.println(arr[i] + "," + arr[j]);
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		System.out.println(arr[i] + "," + arr[j]);
	}
	
	public static void Swapp(int[] one, int[] two) {
		System.out.println(one[0] + "," + two[0]);
		int[] temp = one;
		one = two;
		two = temp;
		System.out.println(one[0] + "," + two[0]);
	}

}
