package Day4;
public class FlipkartShopping implements HDFC,SBI,AXIS,ICICI {

	public static void main(String[] args) {
		FlipkartShopping fs = new FlipkartShopping();
		fs.Hdfcpayment();
		fs.Sbipayment();
		fs.Icicipayment();
		fs.Axispayment();
		
		
	}

	@Override
	public void Icicipayment() {
		System.out.println("10 % Discount Using ICICI Credit Card");
		
	}

	@Override
	public void Axispayment() {
		System.out.println("11 % Discount Using AXIS Credit Card");
		
	}

	@Override
	public void Sbipayment() {
		System.out.println("12 % Discount Using SBI Credit Card");
		
	}

	@Override
	public void Hdfcpayment() {
		System.out.println("13 % Discount Using HDFC Credit Card");
		
	}

}
