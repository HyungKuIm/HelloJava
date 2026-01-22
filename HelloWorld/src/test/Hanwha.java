package test;

public class Hanwha implements Sport<String>{

	@Override
	public void intro(String sunsu) {
		switch(sunsu) {
		case "폰세":
			System.out.println("최강 투수 폰세입니다.");
			break;
		case "와이스":
			System.out.println("2선발 와이스입니다.");
			break;
		default:
			System.out.println("한화는 선수가 다 좋음");
		}
	}

}
