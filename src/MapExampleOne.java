import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExampleOne {

	public static void main(String[] args) {

		Map<String,String> ministers=new HashMap<String,String>();
		//Map<String,String> ministers=new LinkedHashMap<String,String>();
		//Map<String,String> ministers=new TreeMap<String,String>();
		ministers.put("PM", "Mr.Modi");
		ministers.put("HM", "Mr.Shah");
		ministers.put("FM", "Mrs.Nirmala");
		System.out.println(ministers);
		
		//System.out.println(ministers.get("HM"));
		Set<String> keys=ministers.keySet();
		System.out.println(keys);
		
		Collection<String> values=ministers.values();
		System.out.println(values);
	}

}
