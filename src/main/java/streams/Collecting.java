package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import lambda.Person;

public class Collecting {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
				new Person("Albert", "Smith"), 
				new Person("John", "James"),
				new Person("John", "Brown"), 
				new Person("William", "Hughes"), 
				new Person("William", "Fleming")
		);

		Map<String, List<Person>> groupedMap = people.stream()
				.collect(Collectors.groupingBy(Person::getFirstName));
		
		System.out.println(groupedMap.get("William"));
		
		
	}

}
