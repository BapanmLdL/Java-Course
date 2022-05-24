package Lecture2;

public class Sorts {

	public static void main(String[] args) {
		int[] array = { 88, 11, 44, 99, 33 };
//		BubbleSort(array);
//		SelectionSort(array);
		InsertionSort(array);
		display(array);

	}

	public static void BubbleSort(int[] arr) {
		int counter = 0;
		while (counter < arr.length - 1) {
			for (int j = 0; j < arr.length - 1 - counter; j++) {
				if (arr[j] > arr[j + 1]) {
					Swap(arr, j, j + 1);
//					int temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;

				}

			}
			counter = counter + 1;
		}
	}

	public static void Swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void SelectionSort(int[] arr) {
		int counter = 0;
		int min;

		while (counter < arr.length - 1) {
			min = counter;
			for (int j = counter + 1; j <= arr.length - 1; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
//			int temp = arr[min];
//			arr[min] = arr[counter];
//			arr[counter] = temp;
			Swap(arr, counter, min);

			counter += 1;

		}
	}

	public static void InsertionSort(int[] arr) {
		int val;
		for (int counter = 1; counter <= arr.length - 1; counter++) {
			val = arr[counter];
			int j = counter - 1;
			while (j >= 0 && arr[j] > val) {
				arr[j + 1] = arr[j];
				j -= 1;
			}
			arr[j + 1] = val;
		}
	}

}
