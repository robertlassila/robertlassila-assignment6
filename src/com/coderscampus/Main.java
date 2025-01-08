package com.coderscampus;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<MonthlySale> monthlySalesList = new ArrayList<>();
		
		FileService fileService = new FileService();
		fileService.readFile("model3.csv", monthlySalesList);
		System.out.println(monthlySalesList.toString());

	}

}
