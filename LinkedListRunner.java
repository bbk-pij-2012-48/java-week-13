import java.util.*;

public class LinkedListRunner {
	public static void main(String args[]) {
		LinkedList<String> myList = new LinkedList<>();;
		myList.add("aaa\n");
		myList.add("bbb\n");
		myList.add("ccc\n");
		myList.add("ddd\n");
		myList.add("eee\n");
		myList.add("fff\n");
		myList.add("ggg\n");
		myList.add("hhh\n");
		myList.add("iii\n");

		ListIterator<String> itr = myList.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("------------");
		
		char tmp;
		while(itr.hasPrevious()) {
			tmp = itr.previous().charAt(0);
			if(tmp=='a'||tmp=='e'||tmp=='i'||tmp=='o'||tmp=='u'){
				itr.remove();
			}
		}
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	
	}
}
