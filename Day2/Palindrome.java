package Day2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number: ");
		int i = sc.nextInt();
		int rev = 0;
		for (int t = i; t != 0; t /= 10) {
			int digit = t %10;
			rev = rev * 10 + digit;
		}
		if (i == rev) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}

	}

}
