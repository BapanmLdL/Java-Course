package Lecture2;

public class FunctionDemo {

	public static void main(String[] args) {

		System.out.println("Hello!");

		// function call
//		addition();

		// function call
		additionparams(10, -10);
		additionparams(10, 20);
		int sum = addition_return(23, 15);
		System.out.println("return sum" + " " + sum);
		// part 4: variable scope
		System.out.println("Part 4 : Variable Scope");
		int one = -10;
		int two = 20;
		int sum2 = DemoScope(two, one);
		System.out.println(sum2);
		System.out.println("Bye!!");

	}

	// function definition
	public static void addition() {

		int a = 5;
		int b = 10;
		int sum = a + b;
		System.out.println(sum);
	}

	public static void additionparams(int a, int b) {

		int sum = a + b;
		System.out.println(sum);
	}

	public static int addition_return(int a, int b) {

		int sum = a + b;
		return sum;
	}

	public static int DemoScope(int one, int another) {
		int sum = one - another;
		return sum;
	}

}
