import java.util.Scanner;

public class SumofNnumbers {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int c = 1;
		int sum = 0;
		
		while(c <= n) {
//			System.out.println(c);
			sum = sum + c;
			c = c + 1;
		}
		
		System.out.println("The sum is " + sum);

	}

}
