import java.util.Stack;

public class AutoBoxUnBoxExample {

	public static void main(String[] args) {

		Stack stk=new Stack();
		stk.push("abc");
		stk.push(10);	//new push(new Integer(10))	(automatic) Auto-boxing
		stk.push(2.5);	//new push(new Double(2.5))	(automatic) 
		Double d1=(Double)stk.pop();
		System.out.println(d1*2);	//d1*2	=>	d1.doubleValue()*2	(automatic) Aubounboxing
		Integer i1=(Integer)stk.pop();
		System.out.println(i1+2);   //i1.intValue+2
	}

}
