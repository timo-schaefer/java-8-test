package arrays;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {

		double[] nums = new double[100000000];
		for (int i=0; i<100000000; i++) {
			nums[i] = Math.random();
		}

		long start = System.currentTimeMillis();
		Arrays.parallelSort(nums);
		System.out.println("Parallel Sort: " + (System.currentTimeMillis() - start));
		
		start = System.currentTimeMillis();
		Arrays.sort(nums);
		System.out.println("Serial Sort: " + (System.currentTimeMillis() - start));
	}

}
