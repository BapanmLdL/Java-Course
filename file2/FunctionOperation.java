package Lecture2;

import java.util.Scanner;

public class FunctionOperation {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sno = scn.nextInt();
		int sb = scn.nextInt();
		int db = scn.nextInt();
        
		System.out.println("Any Base To Decimal!!");
		int dno = AnyBaseToDecimal(sno, sb);
		System.out.println(dno);
		
		System.out.println("Decimal To Any Base!!");
		int res = DcimalToAnyBase(sno, db);
		System.out.println(res);

	}

	public static int AnyBaseToDecimal(int sno, int sb) {
		int multiplier = 1;
		int ans = 0;
		int rem;

		while (sno != 0) {
			rem = sno % 10;
			ans = ans + (rem * multiplier);
			multiplier = multiplier * sb;
			sno = sno / 10;
		}
		return ans;
	}

	public static int DcimalToAnyBase(int snum, int db) {
		int ans = 0;
		int mul = 1;
		int rem;
		while (snum != 0) {
			rem = snum % db;
			ans = ans + (rem * mul);
			mul = mul * 10;
			snum = snum / db;
		}
		return ans;
	}

}
