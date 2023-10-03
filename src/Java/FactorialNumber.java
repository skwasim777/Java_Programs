package Java;

import java.util.Scanner;

public class FactorialNumber {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number ");
			int n = sc.nextInt();
			long f=1;
			while(n>1) {
				f = f * n;
				n--;
			}
			System.out.println("The Factorial Vaue is " + f);
		}
}
