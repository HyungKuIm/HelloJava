package test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {

		//1. 스트림 생성
		List<String> list = Arrays.asList("서울의 봄", "남산의 부장들", "돈", "공동경비구역 JSA", "하얼빈");
		Stream<String> stream = list.stream();

		//2. 중간 처리(스트림을 리턴)
		// fiter, map, flatMap, distinct, sorted, peak, limit, skip


		//3. 최종 처리(처리 실행 => 결과 리턴)
		// forEach, collect, reduce, count, anyMatch, allMatch, noneMatch, findFirst, findAny

//		List<String> result = stream.filter(name -> name.length() > 3)
//									.map(n -> n + " 봄")
//									.sorted()
//									.collect(Collectors.toList());
//
//		for (String m : result) {
//			System.out.println(m);
//		}

		Optional<String> first = stream.filter(name -> name.startsWith("서울")).findFirst();

//		if (!first.isEmpty()) {
//			System.out.println(first.get());
//		}
		System.out.println(first.orElse("서울로 시작하는 영화는 없습니다."));

//		boolean anyMatch = stream.anyMatch(name -> name.length() > 10);
//		System.out.println("10자 이상 영화 있는지: " + anyMatch);




	}

}
