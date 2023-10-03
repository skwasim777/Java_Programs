package Java;

import java.util.Scanner;

public class PowerValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  Base Value");
		int b = sc.nextInt();
		System.out.println("Enter Power Value");
		int p = sc.nextInt();
		int pwr = 1;
		System.out.printf("%d ^ %d = ", b, p);
		while (p >= 1) {
			pwr = pwr * b;
			p--;
		}
		System.out.printf("%d ", pwr);
	}
}
