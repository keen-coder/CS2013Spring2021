package tth_section;

public class Rectangle extends Shape {
	private double w, h;
	
	public Rectangle(String color, double w, double h) {
		super(color);
		this.w = w;
		this.h = h;
	}

	@Override
	public double area() {
		return this.w * this.h;
	}
	
	
	
}
