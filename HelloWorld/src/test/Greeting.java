package test;

import java.util.function.Function;

public class Greeting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String prefix = "안녕하세요,";
		Function<String, String> greeter = name -> prefix.concat(name);
//		prefix = "Hello";  // effectively final



		System.out.println(greeter.apply("임형구"));



	}

}
