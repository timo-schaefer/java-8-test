package lambda;

public class Person {

	String firstname, lastname;

	public Person(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}
	
	public static String getFirstName(Person person) {
		return person.firstname;
	}
	

	@Override
	public String toString() {
		return firstname + " " + lastname;
	}

}
