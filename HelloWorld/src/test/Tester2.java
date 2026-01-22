package test;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Tester2 {

	public static void main(String[] args) {
		//빌트인 함수형 인터페이스
		//Function<T,R>: 하나의 인수, 하나의 결과
		Function<String, Integer> length = str -> str.length();//String::length;
		System.out.println(length.apply("임형구"));

		//Consumer<T> : 하나의 인수, 아무것도 리턴하지 않는것(소비만 함)
		Consumer<String> printer = msg -> System.out.println("메시지:" + msg);
		printer.accept("안녕하세요");

		//Supplier<T>: 인수는 없으며, 하나의 결과만 리턴(공급만 함)
		Supplier<Double> random = () -> Math.random();   // Math::random;
		System.out.println(random.get());

		//Predicate<T>: 하나의 인수, 하나의 결과(boolean)
		Predicate<Integer> isEven = num -> num % 2 == 0;
		System.out.println("4는 짝수? " + isEven.test(4));

		//BiFunction: 2개의 인수, 하나의 결과
		BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
		System.out.println(add.apply(10, 20));

		Predicate<String> isLong = s -> s.length() > 10;
		Predicate<String> startsWithA = s->s.startsWith("A");
		Predicate<String> combined = isLong.and(startsWithA);

		System.out.println(combined.test("Avengers end game"));

		Function<Integer, Integer> multiplyBy2 = x -> x * 2;
		Function<Integer, Integer> add4 = x -> x + 4;
		Function<Integer, Integer> combined2 = multiplyBy2.andThen(add4);
		System.out.println(combined2.apply(10));
	}

}
