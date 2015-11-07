package streams;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreatingStreams {

	public static void main(String[] args) {

		IntStream.range(0, 10).forEach(System.out::println);
		
		Stream.builder().add("Hello").add("World").add("!").build().forEach(s->System.out.println(s));
		
		Stream<Object> s1 = Stream.builder().add("Hello").add("World").add("!").build();
		Stream<Object> s2 = Stream.builder().add("Another").add("Stream").build();
		Stream.concat(s1, s2).forEach(System.out::println);
		
		new Random().ints(10, 0, 1000000).forEach(System.out::println);
	}

}
