import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.add("ab");
		list.add("cd");
		list.add("ef");
		System.out.println(list);
		list.addFirst("xy");
		System.out.println(list);
		list.addLast("pq");
		System.out.println(list);
		list.add(2,"yz");
		System.out.println(list);
		//list.removeFirst();
		//list.removeLast();
		list.remove(3);
		System.out.println(list);
	}

}
