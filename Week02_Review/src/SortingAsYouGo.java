import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class SortingAsYouGo {
	public static void main(String[] args) {
		
		//genRandomNum("numbers.txt", 1000000);
		
		
		ArrayList<Integer> myList = new ArrayList<>();

		try {
			Scanner read = new Scanner(new File("numbers.txt"));
			
			long start = System.currentTimeMillis();
			while(read.hasNextInt()) {
				int nextInt = read.nextInt();
				
				myList.add(nextInt);
				
				
			}
			
			Collections.sort(myList);
			
			for (int i = 0 ; i < myList.size() ; i++) {
				System.out.print(myList.get(i) + " ");
			}
			System.out.println();
			
			long end = System.currentTimeMillis();
			
			System.out.println("ms: " + (end - start));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}

	public static void genRandomNum(String filename, int numValues) {
		File outFile = new File(filename);
		Random r = new Random();

		try {
			PrintWriter pw = new PrintWriter(outFile);

			for (int i = 1 ; i <= numValues ; i++) {
				int nextInt = r.nextInt(1000);
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
