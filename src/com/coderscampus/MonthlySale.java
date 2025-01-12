package com.coderscampus;

import java.time.YearMonth;

public class MonthlySale {
	private YearMonth date;
	private int sales;
	
	
	
	public MonthlySale(YearMonth date, int sales) {
		super();
		this.date = date;
		this.sales = sales;
	}



	public YearMonth getDate() {
		return date;
	}



	public void setDate(YearMonth date) {
		this.date = date;
	}



	public int getSales() {
		return sales;
	}



	public void setSales(int sales) {
		this.sales = sales;
	}



	@Override
	public String toString() {
		return "MonthlySale [date=" + date + ", sales=" + sales + "]";
	}
	
	
	
}
