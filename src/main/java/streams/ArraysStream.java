package streams;

import java.util.Arrays;

public class ArraysStream {

	public static void main(String[] args) {

		int[] intArray = {4,2,5,7,66,4,3};
		int result = Arrays.stream(intArray).sum();
		System.out.println(result);
	}

}
