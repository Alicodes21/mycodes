package Day2;

import java.util.Scanner;

public class GetTotal {
	
	static int sum =0;
	public static int getTotal(int a,int b) {
		sum = a + b;
		return sum;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter Secound Number: ");
		int num2 = sc.nextInt();
		GetTotal gt = new GetTotal();
		gt.getTotal(num1, num2);
		System.out.println("Sum Of The Number Is "+sum);

	}

}
