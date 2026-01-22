package test;

public class PersonTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var person = new Person("강호동", 55, "hodong@naver.com");
		System.out.println(person.name());
		System.out.println(person.age());
		System.out.println(person.email());

	}

}
