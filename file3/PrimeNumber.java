import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int d = 2;
		boolean flag = true;
		
		while(d <= n-1) {
			if(n % d == 0) {
				flag = false;
			}
			d = d + 1;
			
		}
		
		if(flag == true) {
			System.out.println("Prime");
		}
		
		else {
			System.out.println("Non Prime");
		}

	}

}
