package lecture_examples;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputStreamAndBufferedOutputStream {


	public static void main(String[] args) {
		
		try {
			DataOutputStream os = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("lots_of_data.dat")));
			
			long startTime = System.currentTimeMillis();
			for (int i = 1 ; i <= 1500000 ; i++) {
				os.writeInt(i);
			}
			os.flush();
			long endTime = System.currentTimeMillis();

			System.out.println("total ms: " + (endTime - startTime));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

		



	}

}
