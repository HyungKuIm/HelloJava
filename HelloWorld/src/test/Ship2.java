package test;

public  interface  Ship2 {
	//int move();// 사람을 몇명 나르는가
	default int move() {
		return 4;
	}

	//int carry();// 짐을 몇kg 나르는가

	static int carry() {
		return 10;
	}
}

