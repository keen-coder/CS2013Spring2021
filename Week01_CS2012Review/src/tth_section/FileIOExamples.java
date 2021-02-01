package tth_section;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FileIOExamples {
	public static void main(String[] args) {
		genRandomNum("testOutput.txt", 200);
		
		ArrayList<Integer> numbers = readFile("testOutput.txt");
		
		System.out.println("size: " + numbers.size());
		
		for (Integer i : numbers) {
			System.out.println(i);
		}
		
		
		
		
	}
	
	public static ArrayList<Integer> readFile(String filename) {
		ArrayList<Integer> myList = new ArrayList<>();
		
		try {
			Scanner reader = new Scanner(new File(filename));
			
			while(reader.hasNextInt()) {
				int nextInt = reader.nextInt();
				myList.add(nextInt);
			}
			
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return myList;	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void genRandomNum(String filename, int numValues) {
		File outFile = new File(filename);
		Random r = new Random();
		
		try {
			PrintWriter pw = new PrintWriter(outFile);
			
			for (int i = 1 ; i <= numValues ; i++) {
				int nextInt = r.nextInt(10001);
				pw.println(nextInt);
			}
			pw.flush();
			pw.close();

			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}
	
	
	
}
