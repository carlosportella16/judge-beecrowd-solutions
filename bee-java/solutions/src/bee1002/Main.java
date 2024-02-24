package bee1002;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = (a * a) * 3.14159;
        System.out.printf("A=%.4f\n", b);

	}

}
