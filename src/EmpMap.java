import java.util.HashMap;
import java.util.Map;

public class EmpMap {

	public static void main(String[] args) {
		
		Employee e1=new Employee(111,"AAA",25000,"Engineer");
		Employee e2=new Employee(112,"BBB",55000,"Lead");
		Employee e3=new Employee(113,"CCC",85000,"Manager");
		
		Map<Integer,Employee> map=new HashMap<Integer,Employee>();
		map.put(111, e1); map.put(112, e2);	map.put(113, e3);
		
		Employee emp=map.get(112);
		emp.info();
	}

}
