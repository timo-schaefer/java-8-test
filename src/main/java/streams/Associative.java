package streams;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Associative {

	public static void main(String[] args) {

		OptionalInt result = IntStream.range(1, 1000)
				.parallel()
				.reduce((a,b)->a-b);
		System.out.println(result.getAsInt());
		
		OptionalInt result2 = IntStream.range(1, 1000)
				.reduce((a,b)->a-b);
		System.out.println(result2.getAsInt());
	}

}
