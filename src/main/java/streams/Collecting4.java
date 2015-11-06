package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collecting4 {

	public static void main(String[] args) {

		List<String> strings = 	Arrays.asList("This","is","a","list");
		String s = strings.stream()
				.collect(Collectors.joining(","));

		System.out.println(s);
	}

}
