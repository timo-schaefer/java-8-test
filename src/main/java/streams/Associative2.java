package streams;

import java.util.stream.IntStream;

public class Associative2 {

	public static void main(String[] args) {

		System.out.println("Running in parallel");
		IntStream.range(1, 1000)
				.parallel()
				.filter(a->a%2==1)
				.limit(10)
				.sorted()
				.forEach(a->System.out.println(a));

		System.out.println("Running in serial");
		IntStream.range(1, 1000)
				.filter(a->a%2==1)
				.limit(10)
				.forEach(a->System.out.println(a));

		System.out.println("Running in parallel");
		IntStream.range(1, 1000)
				.parallel()
				.filter(a->a%2==1)
				.limit(10)
				.forEachOrdered(a->System.out.println(a));

	}

}
