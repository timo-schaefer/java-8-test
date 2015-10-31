package lambda;

public class Detector {

	public boolean isEven(int i) {
		return i%2==0;
	}
	
	public boolean isOdd(int i ) {
		return !isEven(i);
	}
	
}
