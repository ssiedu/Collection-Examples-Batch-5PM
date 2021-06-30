import java.util.Arrays;

public class ArraysExample {

	public static void main(String[] args) {
		String cities[]= {"bhopal","ujjain","dewas","mumbai","agra","chennai"};
		for(String city:cities) {
			System.out.println(city);
		}
		Arrays.sort(cities);
		System.out.println("After Sorting...");
		for(String city:cities) {
			System.out.println(city);
		}
		int idx=Arrays.binarySearch(cities, "mumbai");
		System.out.println("Index : "+idx);
		/*
		int numbers[]= {100,20,120,55,90,45,11};
		System.out.println("Before Sorting...!");
		for(int number:numbers) {
			System.out.println(number);
		}
		System.out.println("Now We Are Sorting...!");
		Arrays.sort(numbers);
		System.out.println("After Sorting...!");
		for(int number:numbers) {
			System.out.println(number);
		}
		*/
	}

}
