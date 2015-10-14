package br.com.readCsv.test;

import org.junit.Test;

import br.com.readCsv.util.CSV;

public class ReadTest {

	@Test
	public void ReadCsvFile() {
		CSV csv = new CSV();
		csv.readCSVArchive();
	}

}
