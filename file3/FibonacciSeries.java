import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int counter = 1;
		int a = 0;
		int b = 1;
		int sum = a + b;
		
		while(counter <= n+1) {
			System.out.println(a);
			a = b;
			b = sum;
			sum = a + b;
			counter = counter + 1;
		}

	}

}
