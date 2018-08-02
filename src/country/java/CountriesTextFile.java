package country.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountriesTextFile {

	public static void readFromFile() {
	String fileName = "country.txt";
	
	Path filePath = Paths.get(fileName);
	File file = filePath.toFile();
	
	try {
		FileReader fr = new FileReader(file);
		BufferedReader reader = new BufferedReader(fr);
		
		String line = reader.readLine();
		
		while(line != null) {
			System.out.println(line);
			line = reader.readLine();
		}
		reader.close();
		
	} catch (IOException e) {
		System.out.println("Something went wrong! ");
		
	}
	}
	
	public static void writeToFile(String fileName, String countryName) {
	
		
		Path writeFile = Paths.get(fileName);
		
		File file = writeFile.toFile();
		
		try {
			PrintWriter outW = new PrintWriter(new FileOutputStream(file, true));
			outW.println(countryName);
			outW.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("The file was not found. ");
		}
	}
		
	public static void createFile() {
		String fileName = "country.txt"; 
		
		Path filePath = Paths.get(fileName);
		
		if(Files.notExists(filePath)) {
			try {
				Files.createFile(filePath);
				System.out.println("File was created successfully!");
			} catch (IOException e) {
				System.out.println("Something went wrong with the file creation.");
			}
		}
//		
	}
	
}

