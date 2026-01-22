package test;

public class JapanTravel {

	public static void main(String[] args) {
		//아키하바라에서 3000엔짜리 물건을 구입
		//일본은 제품값과 세금이 별도로 계산됨
		PriceCalculator japan = (base, tax) -> base * (1 + tax);
		//현재 일본의 부가세 10%
		System.out.println(japan.calculate(3000, 0.1));
	}

}
