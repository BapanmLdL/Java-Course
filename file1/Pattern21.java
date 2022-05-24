package Lecture1;

import java.util.Scanner;

public class Pattern21 {

	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int nc = 2*n - 1 ;
		
		int nsp = nc - 2 ;
		int nst = 1 ;
		
		// row
		int row = 1 ;
		while(row <= n) {
			
			// first star work
			for(int cst=1; cst<=nst; cst++) {
				System.out.print("*");
			}
			
			// space work
			for(int csp=1; csp<=nsp; csp++) {
				System.out.print(" ");
			}
			
			// second star work
			int cst = 1;
			if(row == n) {
				cst = 2;
			}
			for(; cst<=nst; cst++) {
				System.out.print("*");
			}
			
			// preparation
			System.out.println();
			nsp = nsp - 2;
			nst = nst + 1;
			row = row + 1;
		}

	}

}
