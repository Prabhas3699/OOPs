package Bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class Stock {
	
	private String  stockname;
	private int stockPrice;
	private int numberOfShares;
	ArrayList<Stock> stocks;
	int totalValue=0;
	int stockValue=0;
		
	Scanner sc=new Scanner(System.in);
	
	/*
	 * @param stockname
	 * @param stockPrice
	 * @param numberOfShares
	 */
	public Stock(String stockname, int stockPrice, int numberOfShares) {
		super();
		this.stockname = stockname;
		this.stockPrice = stockPrice;
		this.numberOfShares = numberOfShares;
	}
	
	/*
	 * @param stocks
	 */
	public Stock() {
		super();
		this.stocks = new ArrayList<>();
	}
	
	/*
	 * @return the stockname
	 */
	public String getStockname() {
		return stockname;
	}

	/*
	 * @param stockname the stockname to set
	 */
	public void setStockname(String stockname) {
		this.stockname = stockname;
	}

	/*
	 * @return the stockPrice
	 */
	public int getStockPrice() {
		return stockPrice;
	}

	/*
	 * @param stockPrice the stockPrice to set
	 */
	public void setStockPrice(int stockPrice) {
		this.stockPrice = stockPrice;
	}

	/*
	 * @return the numberOfShares
	 */
	public int getNumberOfShares() {
		return numberOfShares;
	}

	/*
	 * @param numberOfShares the numberOfShares to set
	 */
	public void setNumberOfShares(int numberOfShares) {
		this.numberOfShares = numberOfShares;
	}
	/*
	 * method to add stock detail
	 */
	public void addStock() {
		
		System.out.println("Enter the number of stocks:");
		int N =sc.nextInt();
	
	for(int i=1;i<=N;i++) {
		System.out.println("Enter the Stock Name:");
		String stockName=sc.next();
		System.out.println("Enter the Stock price:");
		int stockPrice=sc.nextInt();
		System.out.println("Enter the Number of Shares:");
		int numberOfShares=sc.nextInt();
		System.out.println("------------------------------------");
		Stock st=new Stock(stockName,stockPrice,numberOfShares);
		stocks.add(st);
		}System.out.println("Stock detail is added successfully");
		System.out.println("------------------------------------");
		System.out.println("------------------------------------");
	}
	/*
	 * method to calculate stock details
	 */
	public void calStock() {
		
	for (Stock detail:stocks) {
		stockValue=detail.stockPrice*detail.numberOfShares;
		System.out.println("\nStock Name:"+detail.stockname+"\nStock Price:"+detail.stockPrice+"\nNumber of Shares:"+detail.numberOfShares);
		System.out.println("\nValue of each stock:"+stockValue);
		System.out.println("------------------------------------");
		totalValue+=stockValue;
	}	
	System.out.println("Total Value of Stocks:"+totalValue);
	System.out.println("------------------------------------");
	}
	
}
