package Java;

public class SumAndMean {
	public static void main(String[] args) {
		int n = 10;
		int sum = 0;
		int a = 1;
		while (a <= n) {
			sum = sum + a;
			a++;
		}
		System.out.printf("Sum and mean " + sum, (float) sum / n);
	}
}
