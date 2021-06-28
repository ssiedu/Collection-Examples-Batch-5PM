import java.util.Stack;

public class GenericCollection {

	public static void main(String[] args) {
		
		Stack<Integer> stk1=new Stack<>();
		stk1.push(10); stk1.push(20);
		//stk1.push("ab"); stk1.push("xy");
		
		Stack<String> stk2=new Stack<>();
		//stk2.push(10); stk2.push(20);
		stk2.push("ab"); stk2.push("xy");
		
		Stack stk3=new Stack();
		stk3.push(10); stk3.push(20);
		stk3.push("ab"); stk3.push("xy");
		
		System.out.println("Stack - 1 : "+stk1);
		System.out.println("Stack - 2 : "+stk2);
		System.out.println("Stack - 3 : "+stk3);
	}

}
