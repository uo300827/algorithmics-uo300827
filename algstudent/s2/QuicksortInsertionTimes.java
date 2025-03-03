package algorithms_s2;

public class QuicksortInsertionTimes {
	static int[] v;

	public static void main(String arg[]) {
		long t1, t2;
		int n = 16000000;
		v = new int[n];
		Vector.randomSorted(v);
		
		int[] kValues = {1050, 1100, 20, 30, 50, 100, 200, 500, 1000};
		
		for (int k : kValues) {
	        t1 = System.currentTimeMillis();
	        QuicksortInsertion.quicksortInsertion(v, k); 
	        t2 = System.currentTimeMillis();
	        
	        System.out.println("k: " + k + " - " + (t2 - t1) + " ms");
	        System.out.println();
	    }
	}
}
