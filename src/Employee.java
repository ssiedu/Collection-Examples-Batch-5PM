
public class Employee {
	private int code;
	private String ename;
	private int sal;
	private String desg;
	
	public Employee(int a, String b, int c, String d) {
		code=a;
		ename=b;
		sal=c;
		desg=d;
	}
	public void info() {
		System.out.println("____________________________________________");
		System.out.println("Code : "+code);
		System.out.println("Name : "+ename);
		System.out.println("Sal  : "+sal);
		System.out.println("Desg : "+desg);
		System.out.println("____________________________________________");
	}
}
