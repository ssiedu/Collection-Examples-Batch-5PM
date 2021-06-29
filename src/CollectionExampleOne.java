import java.util.ArrayList;
import java.util.TreeSet;

public class CollectionExampleOne {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<>();
		list.add("indore"); list.add("bhopal"); list.add("delhi"); list.add("chennai");
		System.out.println("List : "+list);
		
		//HashSet<String> set=new HashSet<>();
		//LinkedHashSet<String> set=new LinkedHashSet<>();
		TreeSet<String> set=new TreeSet<>();
		set.add("indore"); set.add("bhopal"); set.add("delhi"); set.add("chennai");
		System.out.println("Set  : "+set);
	}

}
