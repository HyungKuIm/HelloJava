package test;

import java.util.Arrays;
import java.util.List;

public class ForEachTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> lifeMovies = Arrays.asList("Transformer", "Battle Ship", "Amazing SpiderMan");
		lifeMovies.forEach(s -> System.out.println(s.toUpperCase()));

	}

}
