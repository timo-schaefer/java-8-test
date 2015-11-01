package lambda;

public class Main6 {

	public static void main(String[] args) {

		NumberAdder na = getNumberAdder();
		System.out.println(na.add(20));
	}
	
	public static NumberAdder getNumberAdder() {
		int startingNumber = 10;		
		return x -> x + startingNumber;
	}

}
