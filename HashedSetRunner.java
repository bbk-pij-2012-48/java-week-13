import java.util.HashSet;

public class HashedSetRunner {
	public static void main(String args[]) {
		HashSet<String> mySet = new HashSet<>();
		for (int i=0 ; i<=1 ; i++) {
			mySet.add("aaa");
			mySet.add("bbb");
			mySet.add("ccc");
			mySet.add("ddd");
			mySet.add("eee");
			mySet.add("fff");
			mySet.add("ggg");
			mySet.add("hhh");
			mySet.add("iii");
			mySet.add("jjj");
		}
		
		for (String s : mySet) {
			System.out.println(s);
		}
	}
}
