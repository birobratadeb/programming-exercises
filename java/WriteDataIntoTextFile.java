package sdet_javaProg;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\Users\\debbi\\eclipse-workspace\\sdet_javaProg\\src\\sdet_javaProg\\WriteText.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Selenium with Java\n");
		bw.write("Selenium with Python\n");
		bw.write("Selenium with C++\n");
		System.out.println("Writing to file completed");
		bw.close();
	}
}
