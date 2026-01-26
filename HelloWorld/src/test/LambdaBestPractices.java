package test;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaBestPractices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String> supplier = ()->"Hello";

		System.out.println(supplier.get());

		Consumer<String> consumer = s -> System.out.println(s);  //인수가 1일때는 괄호(s)는 옵션
		consumer.accept("강호동");

		BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
		System.out.println(add.apply(78890, 26000));
	}

}
