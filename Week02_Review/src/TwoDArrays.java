import java.util.Random;

public class TwoDArrays {
	public static void main(String[] args) {
		int[][] arr = initArr(4, 5);
		printTable(arr);
	}
	
	public static void printTable(int[][] arr) {
		for(int row = 0 ; row < arr.length ; row++) {
			for (int col = 0 ; col < arr[row].length ; col++ ) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}
	
	public static int[][] initArr(int rows, int cols) {
		int[][] table = new int[rows][cols];
		
		Random rand = new Random();
		
		
		for(int row = 0 ; row < table.length ; row++) {
			for (int col = 0 ; col < table[row].length ; col++ ) {
				table[row][col] = rand.nextInt(1000);
			}
		}
		
		return table;
	}
	
	
	
}
