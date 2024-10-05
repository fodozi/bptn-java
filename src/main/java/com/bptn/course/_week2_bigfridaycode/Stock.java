package com.bptn.course._week2_bigfridaycode;

public class Stock {

	// Instance variables
	String tickerSymbol;
	String companyName;
	int price;
	double percentChange;
	int totalShares;
	long marketCap;

	// Constructor to initialize the stock object
	public Stock(String tickerSymbol, String companyName, int price, int totalShares) {

		// Convert tickerSymbol to uppercase
		this.tickerSymbol = tickerSymbol.toUpperCase();
		this.companyName = companyName;
		this.price = price;
		this.totalShares = totalShares;

		// Initialize percentChange to zero and calculate marketCap
		this.percentChange = 0.0;
		this.marketCap = (long) price * totalShares;
	}

	// Method to adjust the price and update percentChange and marketCap
	public void adjustPrice(int change) {
		// Add the change to the current price
		int newPrice = this.price + change;
		this.price = newPrice;

		// Calculating the percentChange as (change / old price) * 100
		this.percentChange = (double) change / this.price * 100;

		// Calculating the marketCap with new price
		this.marketCap = (long) this.price * this.totalShares;
	}

	// Override the toString() in order reformat the stock information
	@Override
	public String toString() {
		return "Ticker Symbol: " + this.tickerSymbol + "\n" + "Company: " + this.companyName + "\n" + "Current Price: $"
				+ this.price + " (" + this.percentChange + "%)\n" + "Market Cap: $" + this.marketCap;
	}

	public static void main(String[] args) {
		Stock stock = new Stock("GOOG", "Google, Inc.", 802, 6700);
		System.out.println(stock);
		stock.adjustPrice(20);
		System.out.println(stock);
	}
}
