package bee1014;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		int x = sc.nextInt();
		double y = sc.nextDouble();
		
		
		System.out.printf("%.3f km/l\n", (x/y));
		sc.close();
	}

}
