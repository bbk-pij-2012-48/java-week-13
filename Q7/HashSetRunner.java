import java.util.*;
public class HashSetRunner {
	public static void main(String[] args) {
		Set<String> numbers = new HashSet<String>();
		
		for(int i=0 ; i<30 ; i++) {
			numbers.add(((Integer)i).toString());
		}
		
		Iterator<String> itr = numbers.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
