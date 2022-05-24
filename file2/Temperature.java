package Lecture2;

public class Temperature {

	public static void main(String[] args) {

		int fmx = 300;
		int fmn = 0;
		int step = 20;
		int fcurrent = fmn;

		while (fcurrent <= fmx) {
			float c = (float)((5.0 / 9) * (fcurrent - 32));
			System.out.println(fcurrent + "\t" + c);
            fcurrent = fcurrent + step;
		}

	}

}
