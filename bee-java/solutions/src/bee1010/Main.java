package bee1010;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

		double total = 0;
		for (int i = 0; i <=1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			double c = sc.nextDouble();
			
			 total += (b*c);
		}
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
		sc.close();
	}

}
