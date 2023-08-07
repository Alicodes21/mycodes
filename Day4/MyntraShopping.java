package Day4;

public class MyntraShopping implements AXIS,SBI,HDFC,ICICI {

	public static void main(String[] args) {
		
		MyntraShopping ms = new MyntraShopping();
		ms.Axispayment();
		ms.Sbipayment();
		ms.Hdfcpayment();
		ms.Icicipayment();

	}

	@Override
	public void Icicipayment() {
		System.out.println("15 % Discount Using ICICI Credit Card");
		
	}

	@Override
	public void Hdfcpayment() {
		System.out.println("14 % Discount Using HDFC Credit Card");
		
	}

	@Override
	public void Sbipayment() {
		System.out.println("13 % Discount Using SBI Credit Card");
		
	}

	@Override
	public void Axispayment() {
		System.out.println("12 % Discount Using AXIS Credit Card");
		
	}

}
