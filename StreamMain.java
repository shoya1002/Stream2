package streamsample2;

import java.util.Arrays;
import java.util.List;

public class StreamMain {
	public static void main(String[] args) throws Exception {
		List<Integer> list = Arrays.asList(2, 2, 3, 4, 4, 4, 5, 7, 9);
		list.stream()
				.filter(i -> i >= 6)
				.forEach(i -> System.out.println(i));
	}
}
