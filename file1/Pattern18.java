package Lecture1;

import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int nsp = n/2 ;
		int nst = 1 ;
		
		// row
		int row = 1 ;
		while(row <= n) {
			
			// first space work
			for(int csp=1; csp<=nsp; csp++) {
				System.out.print(" ");
			}
			
			// star work
			for(int cst=1; cst<=nst; cst++) {
				System.out.print("*");
			}
			
			// second space work
			for(int csp=1; csp<=nsp; csp++) {
				System.out.print(" ");
			}
			
			// preparation
			System.out.println();
			
			if(row <= n/2) {
				nsp = nsp - 1;
				nst = nst + 2;
			}
			else {
				nsp = nsp + 1;
				nst = nst - 2;
			}
			row++;
			
		}

	}

}
