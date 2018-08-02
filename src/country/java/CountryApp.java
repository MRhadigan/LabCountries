/**
 * 
 */
package country.java;

import java.util.Scanner;

/**
 * @author Matthew Rhadigan
 *
 */
public class CountryApp {

	//do {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String cont;
		
		CountriesTextFile.createFile();
		
		do {
		System.out.println("Welcome to the Countries Maintenance Application!");
		System.out.println("1: See the list of countries");
		System.out.println("2: Add a country");
		System.out.println("3: Exit");
		System.out.println();
		
		System.out.println("Enter menu number: ");
		String userNum = scan.nextLine();
			
		
		if (userNum.equals("1")) {
			CountriesTextFile.readFromFile();
		} else if (userNum.equals("2")) {
			System.out.println("Please enter a Country! ");
			String userCountry = scan.nextLine();
			System.out.println("");
			CountriesTextFile.writeToFile("country.txt", userCountry);
			System.out.println(userCountry + " has been saved! ");
		} else if (userNum.equals("3")) {
			System.out.println("GoodBye!");
			return;
		}
			System.out.println("Would you like to continue? (y/n)");
			cont = scan.nextLine();
			if(cont.equalsIgnoreCase("n")) {
				System.out.println("GoodBye!");
			}
			
		} while (cont.equalsIgnoreCase("y"));
			//System.out.println("GoodBye!");
			
		
		}
	
		

	}


