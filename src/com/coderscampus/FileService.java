package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class FileService {

	public List<MonthlySale> readFile(String filepath, List<MonthlySale> monthlySalesList) {
		
		try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
			String line;
			br.readLine();
			
			while ((line = br.readLine()) != null) {
				String date;
				int sales;
				
				String[] singleMonthlySale = line.split(",");
				
				date = singleMonthlySale[0];
				sales = Integer.valueOf(singleMonthlySale[1]);
				
				MonthlySale monthlySale = new MonthlySale(date, sales);
				
				monthlySalesList.add(monthlySale);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}
}
