package Lecture2;

public class FunctionDemoGV {
	public static int val = 20;
     
	public static void main(String[] args) {
		
		int one = 20;
		int two = 30;
		
		// part 5 : Global Variable
		System.out.println("Part 5 : Global Variable");
		System.out.println(val);
		int val = 200;
		System.out.println(val);
		System.out.println(FunctionDemoGV.val);
		
		System.out.println("Function Calling!!");
		int x = 20;
		int sum = DemoGlobalScopes(x);
        System.out.println(sum);
        
        // part 6 : Block Scope
        System.out.println("Part 6 : Block Scope");
        if(one < two) {
        	int three = one + two;
        	System.out.println(three);
        }
        // part 7 : pass by value
        System.out.println("Part 7 : Pass by value");
        System.out.println(one + "," + two);
        swap(one, two);
        System.out.println(one + "," + two);

	}
	public static int DemoGlobalScopes(int x) {
		int sum = x + val;
		return sum;
	}
	public static void swap(int one, int two) {
		System.out.println(one + "," + two);
		int temp = one;
		one = two;
		two = temp;
		System.out.println(one + "," + two);
//		return one, two;
	}

}
