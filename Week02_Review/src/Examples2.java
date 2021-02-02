import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Examples2 {

	public static void main(String[] args) {
		File myFile = new File("output.txt");
		//System.out.println(System.currentTimeMillis());
		try {
			PrintWriter pw = new PrintWriter(myFile);
			long startTime = System.currentTimeMillis(); //epoch jan 1 1970
			for (int i = 1 ; i <= 1000000 ; i++) {
				pw.println(i);
				
			}
			long endTime = System.currentTimeMillis();
			pw.flush();
			System.out.println("ms: " + (endTime - startTime));
			
			
			pw.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
