package Day3;

import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
		
		System.out.println("Input A Number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("The Number Is "+i+" Cube is "+(i*i*i));
		}

	}

}
