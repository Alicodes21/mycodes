package Day2;


public class Is_Even {
	
	 public void isEven(int n) {
		
		if (n%2==0) {
			System.out.println("EVEN");
		} else {
			System.out.println("FALSE");
		}
	}

	public static void main(String[] args) {
		
		Is_Even e = new Is_Even();
		e.isEven(20);
	}

}
