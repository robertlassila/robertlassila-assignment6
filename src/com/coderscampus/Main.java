package com.coderscampus;

import java.time.LocalDate;
import java.time.LocalDateTime;
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
		findAndPrintSalesInfoModel3(monthlySalesList);
		fileService.readFile("modelS.csv", monthlySalesList);
		findAndPrintSalesInfoModelS(monthlySalesList);
		fileService.readFile("modelX.csv", monthlySalesList);
		findAndPrintSalesInfoModelX(monthlySalesList);
		
		//System.out.println(monthlySalesList.toString());

	}
	public static void findAndPrintSalesInfoModel3(List<MonthlySale> monthlySalesList) {
		
		System.out.println("Model 3 Yearly Sales Report");
		System.out.println("---------------");
		
		int totalSales2017 = monthlySalesList.stream()
							.filter(sales -> sales.getDate().contains("17"))
							.mapToInt(MonthlySale::getSales)
							.sum();
		System.out.println("2017 -> " + totalSales2017);
		
		int totalSales2018 = monthlySalesList.stream()
				.filter(sales -> sales.getDate().contains("18"))
				.mapToInt(MonthlySale::getSales)
				.sum();
		System.out.println("2018 -> " + totalSales2018);
		
		int totalSales2019 = monthlySalesList.stream()
				.filter(sales -> sales.getDate().contains("19"))
				.mapToInt(MonthlySale::getSales)
				.sum();
		System.out.println("2019 -> " + totalSales2019);
		
		Optional<MonthlySale> maxSalesObjectModel3 = monthlySalesList.stream()
				.max(Comparator.comparingInt(MonthlySale::getSales));
		
		Optional<MonthlySale> minSalesObjectModel3 = monthlySalesList.stream()
				.min(Comparator.comparingInt(MonthlySale::getSales));
		
		maxSalesObjectModel3.ifPresent(sales -> System.out.println("The best month for Model 3 was " + 
							LocalDate.parse("01-" + sales.getDate(), DateTimeFormatter.ofPattern("dd-MMM-yy"))
							.format(DateTimeFormatter.ofPattern("yyyy-MM"))));
		
		minSalesObjectModel3.ifPresent(sales -> System.out.println("The worst month for Model 3 was " + 
				LocalDate.parse("01-" + sales.getDate(), DateTimeFormatter.ofPattern("dd-MMM-yy"))
				.format(DateTimeFormatter.ofPattern("yyyy-MM"))));
		
		System.out.println();
		
		monthlySalesList.clear();
		
	}
	
public static void findAndPrintSalesInfoModelS(List<MonthlySale> monthlySalesList) {
		
		System.out.println("Model S Yearly Sales Report");
		System.out.println("---------------");
		
		int totalSales2016 = monthlySalesList.stream()
				.filter(sales -> sales.getDate().contains("16"))
				.mapToInt(MonthlySale::getSales)
				.sum();
		System.out.println("2016 -> " + totalSales2016);
		
		int totalSales2017 = monthlySalesList.stream()
							.filter(sales -> sales.getDate().contains("17"))
							.mapToInt(MonthlySale::getSales)
							.sum();
		System.out.println("2017 -> " + totalSales2017);
		
		int totalSales2018 = monthlySalesList.stream()
				.filter(sales -> sales.getDate().contains("18"))
				.mapToInt(MonthlySale::getSales)
				.sum();
		System.out.println("2018 -> " + totalSales2018);
		
		int totalSales2019 = monthlySalesList.stream()
				.filter(sales -> sales.getDate().contains("19"))
				.mapToInt(MonthlySale::getSales)
				.sum();
		System.out.println("2019 -> " + totalSales2019);

		Optional<MonthlySale> maxSalesObjectModel3 = monthlySalesList.stream()
				.max(Comparator.comparingInt(MonthlySale::getSales));
		
		Optional<MonthlySale> minSalesObjectModel3 = monthlySalesList.stream()
				.min(Comparator.comparingInt(MonthlySale::getSales));
		
		maxSalesObjectModel3.ifPresent(sales -> System.out.println("The best month for Model S was " + 
							LocalDate.parse("01-" + sales.getDate(), DateTimeFormatter.ofPattern("dd-MMM-yy"))
							.format(DateTimeFormatter.ofPattern("yyyy-MM"))));
		
		minSalesObjectModel3.ifPresent(sales -> System.out.println("The worst month for Model S was " + 
				LocalDate.parse("01-" + sales.getDate(), DateTimeFormatter.ofPattern("dd-MMM-yy"))
				.format(DateTimeFormatter.ofPattern("yyyy-MM"))));
		
		System.out.println();
		
		monthlySalesList.clear();
		
	}

public static void findAndPrintSalesInfoModelX(List<MonthlySale> monthlySalesList) {
	
	System.out.println("Model X Yearly Sales Report");
	System.out.println("---------------");
	
	int totalSales2016 = monthlySalesList.stream()
			.filter(sales -> sales.getDate().contains("16"))
			.mapToInt(MonthlySale::getSales)
			.sum();
	System.out.println("2016 -> " + totalSales2016);
	
	int totalSales2017 = monthlySalesList.stream()
						.filter(sales -> sales.getDate().contains("17"))
						.mapToInt(MonthlySale::getSales)
						.sum();
	System.out.println("2017 -> " + totalSales2017);
	
	int totalSales2018 = monthlySalesList.stream()
			.filter(sales -> sales.getDate().contains("18"))
			.mapToInt(MonthlySale::getSales)
			.sum();
	System.out.println("2018 -> " + totalSales2018);
	
	int totalSales2019 = monthlySalesList.stream()
			.filter(sales -> sales.getDate().contains("19"))
			.mapToInt(MonthlySale::getSales)
			.sum();
	System.out.println("2019 -> " + totalSales2019);

	
	Optional<MonthlySale> maxSalesObjectModel3 = monthlySalesList.stream()
			.max(Comparator.comparingInt(MonthlySale::getSales));
	
	Optional<MonthlySale> minSalesObjectModel3 = monthlySalesList.stream()
			.min(Comparator.comparingInt(MonthlySale::getSales));
	
	maxSalesObjectModel3.ifPresent(sales -> System.out.println("The best month for Model X was " + 
						LocalDate.parse("01-" + sales.getDate(), DateTimeFormatter.ofPattern("dd-MMM-yy"))
						.format(DateTimeFormatter.ofPattern("yyyy-MM"))));
	
	minSalesObjectModel3.ifPresent(sales -> System.out.println("The worst month for Model X was " + 
			LocalDate.parse("01-" + sales.getDate(), DateTimeFormatter.ofPattern("dd-MMM-yy"))
			.format(DateTimeFormatter.ofPattern("yyyy-MM"))));
	
	System.out.println();
	
	monthlySalesList.clear();
	
}

}
