package Lecture1;

import java.util.Scanner;

public class PatternChallenge1 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int nr = 2 * n + 1;
		int nc = 2 * n + 1;

		int nsp = nr - 2;
		int nst = 1;

		// rows
		int row = 1;
		while (row <= nr) {

			// first star work
			int val = n;
			
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(val + "\t");
				val--;
	
			}

			// space work
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("\t");
			}

			// second star work
			int cst = 1;
			if (row == nr / 2 + 1) {
				cst = 2;
				val += 2;
			}
			else {
				val += 1;
			}
			for (; cst <= nst; cst++) {
				System.out.print(val + "\t");
				val++;
			}

			// preparation
			System.out.println();
			if (row <= nr / 2) {
				nsp -= 2;
				nst += 1;
			} else {
				nsp += 2;
				nst -= 1;
			}
			row += 1;

		}

	}

}
