import java.util.TreeSet;  // why did this not compile when it had the 'package' line at the top?
public class PersonRunner {
	public static void main(String[] args) {
		TreeSet<Person> mySet = new TreeSet<Person>(new PersonComparator());
		mySet.add(new Person("Sally", "Brown"));
		mySet.add(new Person("Fred", "Kelly"));
		mySet.add(new Person("Bill", "Akins"));
		mySet.add(new Person("Julie", "Wilkins"));
		mySet.add(new Person("James", "Langdon"));
		for (Person p : mySet) {
			System.out.println(p);
		}
	}
}
