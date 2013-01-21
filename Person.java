public class Person implements Comparable {
	private String firstName;
	private String lastName;
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String toString() {
		return "Name: " + firstName + " " + lastName;
	}
	public int compareTo(Object p) {
		if(lastName.compareTo(((Person)p).lastName)!=0) {
			return lastName.compareTo(((Person)p).lastName);
		}
		return firstName.compareTo(((Person)p).firstName);
	}
}
