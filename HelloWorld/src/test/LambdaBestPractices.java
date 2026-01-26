package test;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaBestPractices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String> supplier = ()->"Hello";

		System.out.println(supplier.get());

		Consumer<String> consumer = s -> System.out.println(s);  //인수가 1일때는 괄호(s)는 옵션
		consumer.accept("강호동");

		BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b; // 인수가 2개 이상일 경우 괄호 생략 불가
		System.out.println(add.apply(78890, 26000));

		BiFunction<Integer, Integer, Integer> add_Typed = (Integer a, Integer b) -> a + b;  // 옵션이지만, 필요할 경우도 있음
		System.out.println(add_Typed.apply(17510, 47000));

		Function<String, String> upper = s -> {
			String result = s.toUpperCase();
			System.out.println("변환중: " + s);
			return result;
		};

		System.out.println(upper.apply("oraclejava"));

		Function<String, String> upperSimple = s -> s.toUpperCase();
		System.out.println(upperSimple.apply("u plus"));

	}

}
