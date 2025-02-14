package algorithmics.s11;

public class Vector5 {
	static int[] v;

	public static void main(String arg[]) {
		int repetitions = Integer.parseInt(arg[0]);
		long t1, t2;
		int[] m = new int[2];

		for (int n = 10000; n <= Integer.MAX_VALUE; n *= 2) {
			v = new int[n];
			Vector1.fillIn(v);

			t1 = System.currentTimeMillis();
			// We have to repeat the whole process to be measured
			for (int repetition = 1; repetition <= repetitions; repetition++) {
				Vector1.maximum(v, m);
			}
			t2 = System.currentTimeMillis();
			System.out.printf("SIZE=%d TIME=%d milliseconds MAX VALUE=%d MAX POSITION=%d NTIMES=%d\n", n, t2 - t1, m[1], m[0], repetitions);
		} // for

	}// main
}
