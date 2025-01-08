package com.coderscampus;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		List<MonthlySale> monthlySalesList = new ArrayList<>();
		
		FileService fileService = new FileService();
		
		fileService.readFile("model3.csv", monthlySalesList);
		findAndPrintSalesInfo("Model 3", 17, monthlySalesList);
		
		fileService.readFile("modelS.csv", monthlySalesList);
		findAndPrintSalesInfo("Model S", 16, monthlySalesList);
		
		fileService.readFile("modelX.csv", monthlySalesList);
		findAndPrintSalesInfo("Model X", 16, monthlySalesList);

	}
	
	public static void findAndPrintSalesInfo(String model, int firstYearOfProduction, List<MonthlySale> monthlySalesList) {
		System.out.println(model + " Yearly Sales Report");
		System.out.println("---------------");
		
		for (int i = firstYearOfProduction; i < 20; i++) {
			findAndPrintYearSales(monthlySalesList, String.valueOf(i));
		}
		
		printSuperlativeMonths(monthlySalesList, model);
		
		System.out.println();
		
		monthlySalesList.clear();
	}
	
	public static void findAndPrintYearSales(List<MonthlySale> monthlySalesList, String year) {
		int totalSales = monthlySalesList.stream()
				.filter(sales -> sales.getDate().contains(year))
				.mapToInt(MonthlySale::getSales)
				.sum();

		System.out.println("20" + year +  " -> " + totalSales);
		
	}
	
	public static void printSuperlativeMonths(List<MonthlySale> monthlySalesList, String model) {
		
		Optional<MonthlySale> maxSalesObject = monthlySalesList.stream()
				.max(Comparator.comparingInt(MonthlySale::getSales));
		
		Optional<MonthlySale> minSalesObject = monthlySalesList.stream()
				.min(Comparator.comparingInt(MonthlySale::getSales));
		
		maxSalesObject.ifPresent(sales -> System.out.println("The best month for " + model + " was " + 
							LocalDate.parse("01-" + sales.getDate(), DateTimeFormatter.ofPattern("dd-MMM-yy"))
							.format(DateTimeFormatter.ofPattern("yyyy-MM"))));
		
		minSalesObject.ifPresent(sales -> System.out.println("The worst month for " + model + " was " + 
				LocalDate.parse("01-" + sales.getDate(), DateTimeFormatter.ofPattern("dd-MMM-yy"))
				.format(DateTimeFormatter.ofPattern("yyyy-MM"))));
	}
	
}
