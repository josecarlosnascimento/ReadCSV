package br.com.readCsv.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSV {
	
	public void readCSVArchive(){
		
		String filePath = "File directory";
		BufferedReader bufferedReader = null;
		String fileLine = "";
		
		try {
			bufferedReader = new BufferedReader(new FileReader(filePath));
			
			while ((fileLine = bufferedReader.readLine()) != null) {
//				fileLine.split(";")[0].toString().trim(); // Responsável por pegar somente uma coluna;
				System.out.println(fileLine);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
