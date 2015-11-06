package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import lambda.Person;

public class Collecting5 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
				new Person("Albert", "Smith"), 
				new Person("John", "James"),
				new Person("John", "Brown"), 
				new Person("William", "Hughes"), 
				new Person("William", "Fleming")
		);

		List<Person> filteredList = people.stream()
				.filter(p->p.getFirstname().equals("William"))
				.collect(Collectors.toList());
		
		System.out.println(filteredList);
		
		
	}

}
