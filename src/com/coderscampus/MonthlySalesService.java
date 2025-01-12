package com.coderscampus;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MonthlySalesService {

	public void findAndPrintSalesInfo(String model, List<MonthlySale> monthlySalesList) {
		System.out.println(model + " Yearly Sales Report");
		System.out.println("---------------");
		
		Map<Integer, Integer> yearlySales = monthlySalesList.stream()
							.collect(Collectors.groupingBy(result -> result.getDate().getYear(), Collectors.summingInt(MonthlySale::getSales)));
		
		yearlySales.forEach((year, totalSales) -> System.out.println(year + " -> " + totalSales));
		
		
		printSuperlativeMonths(monthlySalesList, model);
		
		System.out.println();
	}
	
	private void printSuperlativeMonths(List<MonthlySale> monthlySalesList, String model) {
		
		Optional<MonthlySale> bestMonth = monthlySalesList.stream()
				.max(Comparator.comparingInt(MonthlySale::getSales));
		
		Optional<MonthlySale> worstMonth = monthlySalesList.stream()
				.min(Comparator.comparingInt(MonthlySale::getSales));
		
		bestMonth.ifPresent(sales -> System.out.println("The best month for " + model + " was " + 
							sales.getDate()));
		
		worstMonth.ifPresent(sales -> System.out.println("The worst month for " + model + " was " + 
				sales.getDate()));
	}
}
