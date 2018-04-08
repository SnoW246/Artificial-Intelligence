package ie.gmit.sw.ai;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) throws Exception, Throwable{
		
		// Declaration & initialization of variables
		Scanner s = new Scanner(System.in);
		int userInput = 0;
		String fileName = "";
		
		do {
			mainMenu();
			userInput = s.nextInt();
			
			switch(userInput) {
				case 1:
					System.out.println("Choose a file name: ");
					fileName = s.next();
					fileName += ".txt";
					
					// Read the text file
					BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(fileName))));
					StringBuilder sb = new StringBuilder();
					String line;
					
					while((line = br.readLine()) != null) {
						sb.append(line.toUpperCase().replaceAll("\\W", "").replace("J", ""));
					}// End of while
					
			}// End of switch
			
		} while(userInput != 0); // End of do while
		
		
	}// End of main
	
	private static void mainMenu() {
		System.out.println("\n Press one og the following keys to choose an action:");
		System.out.println("[1] - To Decrypt a text file");
		System.out.println("[2] - To Exit");

	}// End of mainMenu

}
