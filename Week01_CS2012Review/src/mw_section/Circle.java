package mw_section;

public class Circle extends Shape implements Comparable<Circle> {
	private double radius;

	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	public double getRadius() {
		return this.radius;
	}
	
	
	//v1.compareTo(v2)
	//returns == 0: ==
	//returns >  0: v1 > v2;
	//returns <  0: v1 < v2;
	
	//circle1.equals(circle2)
	
	public boolean equals(Object circle2) {
		if ( !(circle2 instanceof Circle) ) {
			return false;
		}
		
		Circle temp = (Circle)circle2;
		
		boolean isSameRadius = this.radius == temp.radius;
		
		
		return ( isSameRadius && super.equals(circle2) );
	}
	
	
	
	@Override
	public String toString() {
		return "radius: " + this.radius + "\n" +
			   super.toString();
	}
	
	
	@Override
	public int compareTo(Circle c2) {
	//	return (int)(this.radius - c2.radius);
		
		20 - 10 = 10
		
				//"abcd".compareTo("abca") return 'd' - 'a'100 - 97 = 3
				
				
		
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

	@Override
	public double area() {
		return Math.PI * Math.pow(this.radius, 2);
	}


}
