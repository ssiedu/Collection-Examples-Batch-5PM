import java.util.ArrayList;
import java.util.Collections;

public class CollectionsExample {

	public static void main(String[] args) {
		
		ArrayList<String> languages=new ArrayList<String>();
		languages.add("python");languages.add("java"); languages.add("cpp");  languages.add("scala"); 
		languages.add("js"); languages.add("r");
		System.out.println(languages);
		Collections.sort(languages);
		System.out.println(languages);
		int idx=Collections.binarySearch(languages, "java");
		System.out.println(idx);
	}

}
