package lambda;

public class Main7 {

	public static void main(String[] args) {

		NumberAdder na = getNumberAdder();
		System.out.println(na.add(20));
	}
	
	public static NumberAdder getNumberAdder() {
		
		IntegerHolder ih = new IntegerHolder();
		ih.number = 10;
		NumberAdder na = x -> x + ih.number;
		ih.number = 20;
		return na;
	}

}
