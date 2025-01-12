package com.coderscampus;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class FileService {

	public List<MonthlySale> readFile(String filepath) {
		
		List<MonthlySale> monthlySalesList = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
			String line;
			br.readLine();
			
			while ((line = br.readLine()) != null) {
				
				String[] singleMonthlySale = line.split(",");
				
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM-yy").withLocale(Locale.US);
				YearMonth date = YearMonth.parse(singleMonthlySale[0], formatter);
				int sales = Integer.parseInt(singleMonthlySale[1]);
				
				MonthlySale monthlySale = new MonthlySale(date, sales);
				
				monthlySalesList.add(monthlySale);
			}
			
			
		} catch (IOException e) {
			System.out.println("An error ocurred reading the file. The error was: " + e.getMessage());;
		}
		return monthlySalesList;
	}
}
