package stocks_project;

import java.util.Scanner;
public class Stocks_Homework {
	public static void main(String[] args) {
//final double COMMISSION_RATE = .02;
		String Name; // The Name of the user
		int num_Share_Bought; // Number of Buying Shares,
		int num_Share_Sold; // Number of Selling Shares, 1000
		double Sold_Price; // Selling price per share
		double Purchase_Price; // Purchase price per share
		double Commission_Rate; // Broker commission rate

//public double calculation{}
		Scanner input = new Scanner(System.in);

		System.out.println("Please input your name: ");
		Name = input.next();

		System.out.println("Number of shares you want to buy: ");
		num_Share_Bought = input.nextInt();

		System.out.println("Purchase price: ");
		Purchase_Price = input.nextDouble();

		System.out.println("The Number of shares you want to sell: ");
		num_Share_Sold = input.nextInt();

		System.out.println("Sold price: ");
		Sold_Price = input.nextDouble();

		System.out.println(Name + " has purchased " + num_Share_Bought + " shares at $" + Purchase_Price
				+ " and then sold " + num_Share_Sold + " shares at $" + Sold_Price + ".");
	}
}