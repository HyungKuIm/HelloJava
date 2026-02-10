package test;

public class PhonTe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone phone = new Phone("아이폰17", 1287000, 24, 5.9);
//		phone.name("아이폰");
		System.out.println(phone.name());
		System.out.println(phone.price());
		System.out.println(phone.hal());
		System.out.println(phone.percent());
		phone.showMonthMoney();

	}

}
