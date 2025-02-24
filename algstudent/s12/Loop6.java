package algorithms_s2;

public class Loop6 {
	public static long loop6(long n) {
		long cont = 0;
		for (int i = 0; i < n; i++)
			for (int k = 0; k < n; k++)
				for (int l = 0; l < n; l++)
					for (int j = 1; j <= n; j *= 2)
						cont++;
		return cont;
	}

	public static void main(String arg[]) {
		long t1, t2;
		int nTimes = Integer.parseInt(arg[0]);

		System.out.println("n\ttime\trepetitions\tcounter");

		for (long n = 100; n <= 819200; n *= 2) {
			long c = 0;
			t1 = System.currentTimeMillis();

			for (int repetitions = 1; repetitions <= nTimes; repetitions++)
				c = loop6(n);

			t2 = System.currentTimeMillis();

			System.out.println(n + "\t" + (t2 - t1) + "\t" + nTimes + "\t\t" + c);
		} // for
	} // main
}
