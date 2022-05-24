package Lecture1;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = n;
		
		// row
		int row = 1;
		while(row <= n) {
			
			//work
			int cst = 1;
			while(cst <= nst) {
				System.out.print("*");
				cst++;
			}
			
			// preparation
			System.out.println();
			row++;
			nst--;
		}

	}

}
