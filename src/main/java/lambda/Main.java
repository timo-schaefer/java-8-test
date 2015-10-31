package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {

		Consumer<Object> c = (Object o) -> {
			System.out.println(">>>" + o);
		};

		List<String> l = Arrays.asList("Hello", "World", "Print", "My", "List");
		l.forEach(c);
	}

}
