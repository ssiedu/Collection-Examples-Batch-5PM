class Emp{
	
}
class Demo <T> {
	public void show(T s) {
		
	}
}

public class GenExample {

	public static void main(String[] args) {
		Demo<String> d1=new Demo<>();
		d1.show("abc");
		//d1.show(10);
		
		Demo<Integer> d2=new Demo<>();
		d2.show(10);
		//d2.show("abc");
		
		Demo<Emp> d3=new Demo();
		d3.show(new Emp());
		//d3.show(10);
		//d3.show("abc");
		//d3.show(true);

		Demo d4=new Demo();
		d4.show(10);
		d4.show("abc");
		d4.show(true);
		d4.show(new Emp());
	}

}
