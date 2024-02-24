package bee1005;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		
		float r = ((a * 3.5f) + (b * 7.5f))/11;
		System.out.printf("MEDIA = %.5f\n", r);
		sc.close();
	}

}
