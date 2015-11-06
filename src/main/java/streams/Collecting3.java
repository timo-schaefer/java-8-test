package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.stream.Collectors;

public class Collecting3 {

	public static void main(String[] args) {

		List<String> zones = Arrays.asList(TimeZone.getAvailableIDs());
		Map<Boolean, List<String>> zonesCompare = zones.stream()
				.filter(s->s.indexOf("/")>0)
				.collect(Collectors.partitioningBy(s->s.indexOf("/")>0));
		
		System.out.println(zonesCompare);
	}

}
