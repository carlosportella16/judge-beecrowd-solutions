package bee1012;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		double r = sc.nextDouble();
		double v = (4.0/3) * 3.14159 * (r*r*r);
		
		System.out.printf("VOLUME = %.3f\n", v);
		sc.close();
	}

}
