package Lecture1;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int nst = n ;
		int nsp = 0 ;
		
		//row 
		int row = 1 ;
		while(row <= n) {
			
			// space work
			int csp = 1 ;
			while(csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			
			// star work
			int cst = 1 ;
			while(cst <= nst) {
				System.out.print("*");
				cst++;
			}
			
			// preparation
			System.out.println();
			row++;
			nst--;
			nsp++;
				
				
		}

	}

}
