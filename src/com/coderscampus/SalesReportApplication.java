package com.coderscampus;

import java.util.List;

public class SalesReportApplication {

	public static void main(String[] args) {
		
		FileService fileService = new FileService();
		MonthlySalesService monthlySalesService = new MonthlySalesService();
		
		String[] models = {"3", "S", "X"};
		
		for (String model : models) {
			
			List<MonthlySale> sales = fileService.readFile("model" + model + ".csv");
			monthlySalesService.findAndPrintSalesInfo(("Model " + model), sales);
			
		}
	}
}
