package Lecture1;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int nr = 2*n - 1 ;
		
		int nst = 1 ;
		
		// row
		int row = 1 ;
		while(row <= nr) {
			
			// work
			int cst = 1 ;
			while(cst <= nst) {
				System.out.print("*");
				cst++;
			}
			
			// preparation
			System.out.println();
			row++;
			if(row <= nr/2 + 1) {
				nst++;
			}
			else {
				nst--;
			}
		}

	}

}
