package bee1009;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		System.out.printf("TOTAL = R$ %.2f\n", (b + (c * 0.15)));
		sc.close();
	}

}
