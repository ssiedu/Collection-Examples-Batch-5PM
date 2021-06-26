import java.util.Stack;

public class WrapperExample {

	public static void main(String[] args) {
		
		Stack stk=new Stack();
		stk.push("ab");
		stk.push("cd");
		Integer ob1=new Integer(10);
		stk.push(ob1);
		Double ob2=new Double(2.5);	//wrapping a premitive double to a Double object
		stk.push(ob2);
		
		Double d1=(Double)stk.pop();
		double d2=d1.doubleValue();	//unwrapping a premitive double  from Double Object
		System.out.println(d2+2);
		
		Integer i1=(Integer)stk.pop();
		int i2=i1.intValue();		//unwrapping a premitive int from an Integer Object.
		System.out.println(i2/2);
	}

}
