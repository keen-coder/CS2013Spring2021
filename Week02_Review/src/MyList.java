import java.util.ArrayList;

public class MyList extends ArrayList<Integer> {

	//variable-length parameter list
	public MyList(Integer ... values) {
		
		for (int i = 0 ; i < values.length ; i++) {
			super.add(values[i]);
		}
	}
	
	public int sum() {
		int sum = 0;
		
		
		for (int i = 0 ; i < super.size(); i++) {
			sum += super.get(i);
		}
		
		return sum;
	}
	
	public double avg() {
		double sum = this.sum();
		return sum / super.size();
	}
}
