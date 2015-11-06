package streams;

import java.util.Arrays;
import java.util.Map;
import java.util.TimeZone;
import java.util.stream.Collectors;

public class Collecting2 {

	public static void main(String[] args) {

		Map<String, Long> result = Arrays.asList(TimeZone.getAvailableIDs()).stream()
				.filter(s->s.indexOf("/")>0)
				.collect(Collectors.groupingBy((String s)->s.substring(0,s.indexOf("/")),
						Collectors.counting()));
		
		System.out.println(result);
	}

}
