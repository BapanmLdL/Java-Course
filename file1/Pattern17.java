package Lecture1;

import java.util.Scanner;

public class Pattern17 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int nst = n/2 ;
		int nsp = 1 ;
		
		// row
		int row = 1 ;
		while(row <= n) {
			
			// first stars work
			int cst = 1 ;
			while(cst <= nst) {
				System.out.print("*");
				cst++;
			}
			
			// spaces work
			int csp = 1 ;
			while(csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			
			// second stars works
			int cst2 = 1 ;
			while(cst2 <= nst) {
				System.out.print("*");
				cst2++;
			}
			
			// preparation
			System.out.println() ;
			
			if(row <= n/2) {
				nsp = nsp + 2 ;
				nst = nst - 1 ;
			}
			else {
				nsp = nsp - 2 ;
				nst = nst + 1 ;
			}
			row++;
		}

	}

}
