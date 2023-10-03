package Java;

import java.util.Scanner;

public class CountEvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		int en = 0, on = 0;
		while (n >= 1) {
			if (n % 2 == 0)
				en++;
			else
				on++;
			n--;
		}
		System.out.println("Even number " + en + "\n" + "Odd Number " + on);
	}
}
