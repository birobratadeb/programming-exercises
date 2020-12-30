package sdet_javaProg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
// Approach 1: Using FileReader and BufferedReader
public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException
	
	{
		
		FileReader fr = new FileReader("C:\\Users\\debbi\\eclipse-workspace\\sdet_javaProg\\src\\sdet_javaProg\\Test.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String str;
		while((str = br.readLine())!= null)
		{
			System.out.println(str);
		}
		br.close()
	}
}
*/

/*
//Approach 2: Using Scanner and File and loop
public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException
	
	{
		File file = new File("C:\\Users\\debbi\\eclipse-workspace\\sdet_javaProg\\src\\sdet_javaProg\\ReadText.txt");
		Scanner sc = new Scanner(file);
		
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}				
	}
}

*/

//Approach 3: Using Scanner, File, regex and without loop
public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException
	
	{
		File file = new File("C:\\Users\\debbi\\eclipse-workspace\\sdet_javaProg\\src\\sdet_javaProg\\ReadText.txt");
		Scanner sc = new Scanner(file);
		sc.useDelimiter("//z");
		System.out.println(sc.next());			
	}
}
