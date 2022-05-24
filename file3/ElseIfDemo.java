import java.util.Scanner;

public class ElseIfDemo {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int age = scn.nextInt();
		
		if(age < 11) {
			System.out.println("Child");
		}
		
		else if(age >= 11 && age <= 19) {
			System.out.println("Teen");
		}
		
		else if(age >= 20 && age < 60) {
			System.out.println("Adult");
			
		}
		
		else {
			System.out.println("Old");
		}

	}

}
