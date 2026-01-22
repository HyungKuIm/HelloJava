package test;

public interface Sport<T> {
	default void intro(T sunsu) {
		System.out.println(sunsu + " 소개");
	}
}
