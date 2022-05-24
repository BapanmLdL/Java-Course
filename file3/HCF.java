import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		
//		int divident = 75;
//		int divisor = 45;
		
		Scanner scn = new Scanner(System.in);
		int divident = scn.nextInt();
		int divisor = scn.nextInt();
		
		int rem = divident % divisor;
		
		while(rem != 0) {
			
			divident = divisor;
			
			divisor = rem;
			
			rem = divident % divisor;
		}
		
		System.out.println(divisor);

	}

}
