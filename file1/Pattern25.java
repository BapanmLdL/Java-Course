package Lecture1;

import java.util.Scanner;

public class Pattern25 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int nc = 2 * n - 1;

		int nsp = nc / 2;
		int one = 1;

		int val = 1;

		// row
		int row = 1;
		while (row <= n) {

			// first space work
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("\t");
			}

			// ones work
			for (int cse = 1; cse <= one; cse++) {
				System.out.print(val + "\t");
				val++;
			}

			// second space work
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("\t");
			}

			// preparation
			System.out.println();
			nsp = nsp - 1;
			one = one + 2;
			row = row + 1;
		}

	}

}
