package mw_section;

public class Rectangle extends Shape {
	private double w, h;
	
	public Rectangle(String color, double w, double h) {
		super(color);
		this.w = w;
		this.h = h;
	}
	
	@Override
	public String toString() {
		return "w: " + this.w + ", h: " + this.h + "\n" +
	           super.toString();
	}

	@Override
	public double area() {
		return this.w * this.h;
	}
	
	
}
