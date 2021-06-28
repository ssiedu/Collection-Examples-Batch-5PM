import java.util.LinkedList;

public class GenericLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> list1=new LinkedList<>();
		list1.add(10); list1.add(20); list1.add(30);
		
		LinkedList<String> list2=new LinkedList<>();
		list2.add("ab"); list2.add("cd"); list2.add("ef");
		
		LinkedList list3=new LinkedList();
		list3.add("ab"); list3.add(10); list3.add(true); list3.add(2.5);
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);

	}

}
