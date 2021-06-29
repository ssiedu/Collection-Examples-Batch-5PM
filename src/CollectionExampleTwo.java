import java.util.ArrayList;

public class CollectionExampleTwo {

	public static void main(String[] args) {
		
		ArrayList<String> listMP=new ArrayList<>();
		listMP.add("indore"); listMP.add("bhopal");
		ArrayList<String> listMH=new ArrayList<>();
		listMH.add("mumbai"); listMH.add("pune");
		System.out.println(listMP);
		System.out.println(listMH);
		ArrayList<String> listAll=new ArrayList<>();
		//System.out.println(listAll);
		listAll.addAll(listMP);	//all the elements of listMP will be copied to listAll
		listAll.addAll(listMH); // all the elements of listMH will be copied to listAll
		System.out.println(listAll);
		//listAll.removeAll(listMP);	//all the elements of listMP will be removed from listAll
		listAll.retainAll(listMP);
		System.out.println(listAll);
		/*
		//System.out.println(list.size());
		//System.out.println(list.isEmpty());
		System.out.println(list.contains("bhopal"));
		list.remove("bhopal");
		System.out.println(list.contains("bhopal"));
		System.out.println(list);
		*/
	}

}
