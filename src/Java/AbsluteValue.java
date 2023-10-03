package Java;

import java.util.Scanner;

public class AbsluteValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int n = sc.nextInt();
		if (n < 0) {
			n = n * -1;
		}
		System.out.printf("Abslute Value is = %d ", n);
	}
}
