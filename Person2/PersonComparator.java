import java.util.Comparator;
public class PersonComparator implements Comparator<Person>{
	public int compare(Person a, Person b) {
		if(a.getLastName().compareTo(b.getLastName()) != 0) {
			return a.getLastName().compareTo(b.getLastName());
		}
		return a.getFirstName().compareTo(b.getFirstName());
	}
		
}
	
