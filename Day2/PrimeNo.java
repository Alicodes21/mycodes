package Day2;

public class PrimeNo {
	
	void isPrime(int n) {
		int sum = 0;
		for (int i = 1; i<=n; i++) {
			if (n%i==0) {
					sum = sum + 1;
			}
		}
		if (sum == 2) {
			System.out.println("Number Will Be "+n+" It Is A Prime Number");


		}
		else {
			System.out.println("Number Will Be "+n+" It Is A Not Prime Number");
		}
		
	}
	public static void main(String[] args) {
		
		PrimeNo p = new PrimeNo();
		for (int r = 1; r<=500; r++) {
			p.isPrime(r);
		}

	}

}
