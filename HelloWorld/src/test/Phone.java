package test;

public record Phone(String name, int price, int hal, double percent) {

	public void showMonthMoney() {
		double monthMoney = (price / hal) + (price * percent / 100) / 12;
		System.out.println("월 할부금액:" + monthMoney);
	}

}
