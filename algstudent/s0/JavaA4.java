package algorithmics;

import java.util.ArrayList;
import java.util.List;

public class JavaA4 {
	private static boolean primoA3(int m) {
		if (m == 2 || m == 3)
			return true;
		if (m % 2 == 0)
			return false;

		// Check odd numbers only up to sqrt of m
		for (int i = 3; i * i <= m; i += 2) {
			if (m % i == 0)
				return false;
		}
		return true;
	}

	private static List<Integer> listadoPrimos(int n) {
		List<Integer> primes = new ArrayList<Integer>();
		for (int i = 2; i <= n; i++) {
			if (primoA3(i)) {
				primes.add(i);
			}
		}
		return primes;
	}

	public static void main(String[] args) {
		int n = 10000;
		for (int i = 0; i < 7; i++) {
			long t1 = System.currentTimeMillis();
			List<Integer> primes = listadoPrimos(n);
			long t2 = System.currentTimeMillis();
			System.out.println("n = " + n + " *** time = " + (t2 - t1) + " milliseconds)");
			n *= 2;
		}
	}
}
