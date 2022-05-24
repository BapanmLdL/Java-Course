package Lecture2;

import java.util.Scanner;

public class ArrayOps {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int[] array = TakeInput();
		display(array);
		System.out.println("Max element in the array is" + " " + maxInArray(array));

		int item = 55;
//		System.out.println("Element present in index" + " " + LinearSearch(array, item));
		int res = BinarySearch(array, item);
		if (res != -1) {
			System.out.println("Item present in index" + " " + res);
		} else {
			System.out.println("Item is not present!!");
		}

	}

	public static int[] TakeInput() {
		System.out.println("Size ?");
		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the value for " + i + "index");
			arr[i] = scn.nextInt();
		}
		return arr;

	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static int maxInArray(int[] arr) {

		int max = Integer.MIN_VALUE;

		for (int val : arr) {
			if (val > max) {
				max = val;
			}
		}
		return max;
	}

	public static int LinearSearch(int[] arr, int item) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				return i;
			}
		}
		return -1;

	}

	public static int BinarySearch(int[] arr, int item) {
		int low = 0;
		int high = arr.length - 1;
		int mid;

		while (low <= high) {
			mid = (low + high) / 2;

			if (arr[mid] < item) {
				low = mid + 1;
			} else if (arr[mid] > item) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

}
