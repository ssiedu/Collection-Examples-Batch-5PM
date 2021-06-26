import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack stk=new Stack();
		stk.push("aa"); stk.push("bb"); stk.push("cc"); stk.push("dd"); stk.push("ee");
		System.out.println(stk);
		stk.pop();
		System.out.println(stk);
		stk.pop();
		System.out.println(stk);
	}

}
