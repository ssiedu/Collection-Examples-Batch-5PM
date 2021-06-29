import java.util.ArrayList;
import java.util.Iterator;

public class CollectionExampleThree {

	public static void main(String[] args) {

		ArrayList<String> cities=new ArrayList<>();
		cities.add("delhi"); cities.add("chennai"); cities.add("mumbai"); cities.add("pune");
		//System.out.println(cities);
		
		Iterator it=cities.iterator();
		while(true) {
			boolean found=it.hasNext();
			if(found==false)break;
			System.out.println(it.next());
		}
		
		/*
		for(String city:cities) {
			System.out.println(city);
		}
		*/
		
		/*
		for(int i=0; i<cities.size(); i++) {
			System.out.println(cities.get(i));
		}
		*/
	}

}
