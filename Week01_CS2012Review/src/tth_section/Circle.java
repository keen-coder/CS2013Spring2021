package tth_section;

public class Circle extends Shape implements Comparable<Circle>  {
	private double radius;
	
	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(this.radius, 2);
	}

	//v1.compareTo(v2)
	//return 0: v1 == v2
	//return < 0: v1 < v2
	//return > 0: v1 > v2
	
	@Override
	public int compareTo(Circle c2) {
		if (this.radius == c2.radius) {
			return 0;
		}
		else if (this.radius < c2.radius) {
			return -1;
		}
		else {
			return 1;
		}
	}
}
