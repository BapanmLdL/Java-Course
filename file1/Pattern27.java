package Lecture1;

import java.util.Scanner;

public class Pattern27 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int nc = 2 * n - 1;

		int nsp = nc / 2;
		int nst = 1;

		int val ;

		// row
		int row = 1;
		while (row <= n) {
			
			val = 1 ;

			// first space work
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("\t");
			}

			// value work
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(val + "\t");
				
				// column preparation
				if(cst <= nst/2) {
					val++;
				}
				else{
					val--;
				}
			}

			// second space work
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("\t");
			}

			// preparation
			System.out.println();
			nsp = nsp - 1;
			nst = nst + 2;
			row = row + 1;
		}

	}

}
