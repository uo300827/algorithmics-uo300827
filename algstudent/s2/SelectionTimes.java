package algorithms_s2;

public class SelectionTimes {
	static int[] v;

	public static void main(String arg[]) {
		String opcion = arg[0];
		long t1, t2;

		for (int n = 10000; n <= 1000000000; n *= 2) {
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
			Selection.selection(v);
			t2 = System.currentTimeMillis();

			System.out.println(n + "\t" + (t2 - t1));
		}
	}

}
