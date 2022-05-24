package Lecture1;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		for(int row=1; row<=n; row++) {
			
			// work
			for(int col=1; col<=row; col++) {
				System.out.print("*");
			}
			
			// preparation
			System.out.println();
		}

	}

}
