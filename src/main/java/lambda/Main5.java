package lambda;

import java.util.Arrays;
import java.util.List;

public class Main5 {

	public static void main(String[] args) {

		List<Person> l = Arrays.asList(
				new Person("Albert", "Smith"), 
				new Person("Jim", "James"),
				new Person("John", "Brown"), 
				new Person("Wiliam", "Hughes"), 
				new Person("Simon", "Fleming")
		);
		
		l.sort((p1,p2)->p1.getFirstname().compareTo(p2.getFirstname()));
		System.out.println(l);
	}

}
