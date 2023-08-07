package Day4;

public class AmazonShopping implements HDFC,AXIS,SBI,ICICI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AmazonShopping as = new AmazonShopping();
		as.Axispayment();
		as.Sbipayment();
		as.Hdfcpayment();
		as.Icicipayment();
	}

	@Override
	public void Icicipayment() {
		System.out.println("10 % Discount Using ICICI Credit Card");
		
	}

	@Override
	public void Sbipayment() {
		System.out.println("11 % Discount Using SBI Credit Card");
		
	}

	@Override
	public void Axispayment() {
		System.out.println("12 % Discount Using AXIS Credit Card");
		
	}

	@Override
	public void Hdfcpayment() {
		System.out.println("13 % Discount Using HDFC Credit Card");
		
	}

}
