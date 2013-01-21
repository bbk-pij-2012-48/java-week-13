import java.util.*;
public class HashSetRunner {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		
		set1.add("Mike");
		set1.add("Jo");
		set1.add("Dave");
		set1.add("Steve");
		set1.add("Fi");
		set1.add("Mike");
		
		set2.addAll(set1);
		if(set2.isEmpty()) 
			System.out.println("Oh dear");
		
		Iterator<String> itr = set1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Iterator<String> itr2 = set2.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
}
		
