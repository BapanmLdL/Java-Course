package Lecture1;

import java.util.Scanner;

public class Pattern0While {

	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int row = 1;
		while(row <= n ) {
			// work
			System.out.print("*");
			
			// preparation
			System.out.println();
			row++ ;
		}

	}

}
