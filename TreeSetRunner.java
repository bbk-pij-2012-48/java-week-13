import java.util.TreeSet;

public class TreeSetRunner {
	public static void main(String args[]) {
		
		TreeSet<String> mySet = new TreeSet<>();
		for (int i=0 ; i<=1 ; i++) {
			mySet.add("iii");
			mySet.add("hhh");
			mySet.add("ggg");
			mySet.add("fff");
			mySet.add("eee");
			mySet.add("ddd");
			mySet.add("ccc");
			mySet.add("bbb");
			mySet.add("aaa");
		}
		
		for (String s : mySet) {
			System.out.println(s);
		}		
	}
}
