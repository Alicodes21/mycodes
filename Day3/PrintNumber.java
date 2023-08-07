package Day3;

public class PrintNumber {

	void printn(int i) {
		System.out.println("Integer Number is "+i);
	}
	void printn(boolean b) {
		System.out.println("Boolean Number is "+b);
	}
	void printn(long l) {
		System.out.println("Long Number is "+l);
	}
	void printn(float f) {
		System.out.println("Floating Number is "+f);
	}
	void printn(double d) {
		System.out.println("Double Number is "+d);
	}
	public static void main(String[] args) {
		
		PrintNumber PN = new PrintNumber();
		PN.printn(20);
		PN.printn(true);
		PN.printn(555555L);
		PN.printn(55.55f);
		PN.printn(25478.3256);

	}

}
