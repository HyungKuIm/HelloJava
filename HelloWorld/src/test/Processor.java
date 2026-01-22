package test;

@FunctionalInterface
public interface Processor<T> {
	T process(T input);

	default void log(T input) {
		System.out.println("Processing:" + input);
	}
}
