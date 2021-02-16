package lecture_examples;

public class ReverseArray {

	public static void main(String[] args) {
	
	}
	
	public static void reverse(int[] list, int low, int high) {
		if (low >= high) {
			return;
		}
		else {
			int temp = list[low];
			list[low] = list[high];
			list[high] = temp;
			reverse(list, low + 1, high - 1); 
		}
	}

}
