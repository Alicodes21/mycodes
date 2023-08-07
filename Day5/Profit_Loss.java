package Day5;

import java.util.Scanner;

public class Profit_Loss {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of dozens of toys purchased");
        int x = scanner.nextInt();

        System.out.println("Enter the price per dozen");
        int y = scanner.nextInt();

        System.out.println("Enter the selling price of 1 toy");
        int z = scanner.nextInt();

        double costPriceOfOneToy = (double) y / (12 * x);
        double sellingPriceOfOneToy = (double) z;

        double gain = sellingPriceOfOneToy - costPriceOfOneToy;
        double profitPercentage = (gain / costPriceOfOneToy) * 100;

        System.out.printf("Sam's profit percentage is %.2f percent%n", profitPercentage);

        scanner.close();

	}

}
