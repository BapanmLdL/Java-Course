package Lecture1;

import java.util.Scanner;

public class Pattern32 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int nr = 2 * n - 1;
		int nst = 1;
		int val = 1;

		// row
		int row = 1;
		while (row <= nr) {

			// work
			int cst = 1;
			while (cst <= nst) {
				if (cst % 2 != 0) {
					System.out.print(val);
				} else {
					System.out.print("*");
				}
				cst += 1;
			}
			// preparation

			System.out.println();
			if (row <= nr / 2) {
				nst += 2;
				val += 1;
			} else {
				nst -= 2;
				val -= 1;
			}
			row += 1;
		}

	}

}
