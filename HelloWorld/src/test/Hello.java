package test;

import java.util.Arrays;
import java.util.List;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello 안녕!");
		
		record Person(String name, int age, String city) {}
		
		List<Person> people = Arrays.asList(
			new Person("Alice", 30, "NYC"),
			new Person("Bob", 25, "LA"),
			new Person("Charlie", 30, "NYC")
		);
		
		for (Person p : people) {
			System.out.println(p);
		}
	}

}
