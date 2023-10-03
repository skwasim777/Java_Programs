package Java;

import java.util.Scanner;

public class PowerSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base Value");
		int b = sc.nextInt();
		System.out.println("Enter Power Value");
		int p = sc.nextInt();
		long pwr = 1;
		int sum = 0;
		while (p >= 1) {
			pwr = pwr * b;
			sum = (int) (sum + pwr);
			p--;
		}
		System.out.printf("Power Sum = %d ", sum);
	}
}
