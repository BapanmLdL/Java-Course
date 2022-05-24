package Lecture2;

public class ArrayDemo {

	public static void main(String[] args) {

		// declare
		int[] arr = null;
		System.out.println(arr);

		// allocate space
		arr = new int[5];
		System.out.println(arr);

		// get
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

		// set
		arr[0] = 20;
		arr[1] = 40;
		arr[2] = -40;
		arr[3] = 7;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		for(int i=arr.length-1; i>=0; i--) {
			System.out.println(arr[i]);
		}
		
		// enhanced for loop
		for(int val: arr) {
			System.out.println(val);
			
		}

	}

}
