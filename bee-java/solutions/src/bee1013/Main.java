package bee1013;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior = (a + b+ Math.abs(a-b))/2;
		maior = (maior + c+ Math.abs(maior-c))/2;
		
		System.out.println(maior + " eh o maior");
		sc.close();
	}

}
