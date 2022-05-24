package Lecture1;

import java.util.Scanner;

public class PatternChallenge2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int nr = 2 * n + 1;
		int nc = 2 * n + 1;
		int nsp = 0;
		int nst = nc;
		int val;

		int row = 1;
		while (row <= nr ) {

			if (row <= nr / 2 ) {
				val = n - row + 1;
			} else {
				val = row - n - 1;
			}

			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}

			for (int cst = 1; cst <= nst; cst++) {

				if (cst <= nst / 2) {
					val--;

				} else {
					val++;
				}
				System.out.print(val);
			}

			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}

			System.out.println();
			if (row <= nr / 2) {
				nsp += 1;
				nst -= 2;
			} else {
				nsp -= 1;
				nst += 2;

			}
			row += 1;
		}

	}

}
