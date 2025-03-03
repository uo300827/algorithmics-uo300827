package algorithms_s2;

public class QuicksortTimes {
	static int[] v;

	public static void main(String arg[]) {
		long t1, t2;
		String opcion = arg[0];

		for (int n = 16000000; n <= 1000000000; n *= 2) {
			v = new int[n];

			if (opcion.compareTo("ordered") == 0) {
				System.out.println("ordered");
				Vector.sorted(v);
			} else if (opcion.compareTo("reverse") == 0) {
				System.out.println("reverse");
				Vector.reverseSorted(v);
			} else {
				System.out.println("random");
				Vector.randomSorted(v);
			}

			t1 = System.currentTimeMillis();

			Quicksort.quicksort(v);

			t2 = System.currentTimeMillis();

			System.out.println(n + "\t" + (t2 - t1));
		}
	}
}
