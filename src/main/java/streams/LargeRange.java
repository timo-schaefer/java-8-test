package streams;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class LargeRange {

	public static void main(String[] args) {
		
		System.out.println("Number of processors: " + Runtime.getRuntime().availableProcessors());

		long start = System.currentTimeMillis();
		OptionalDouble result = IntStream.range(0, Integer.MAX_VALUE)
				.parallel()
				.filter(i->i%2==0)
				.average();
		System.out.printf("Parallel version took %d\n", System.currentTimeMillis()-start);
		
		start = System.currentTimeMillis();
		OptionalDouble result2 = IntStream.range(0, Integer.MAX_VALUE)
				.filter(i->i%2==0)
				.average();
		System.out.printf("Serial version took %d\n", System.currentTimeMillis()-start);
		
		
	}

}
