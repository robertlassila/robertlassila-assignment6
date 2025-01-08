package com.coderscampus;

public class MonthlySale {
	private String date;
	private int sales;
	
	
	
	@Override
	public String toString() {
		return "MonthlySale [date=" + date + ", sales=" + sales + "]";
	}
	public MonthlySale(String date, int sales) {
		this.date = date;
		this.sales = sales;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getSales() {
		return sales;
	}
	public void setSales(int sales) {
		this.sales = sales;
	}
	
	
}
