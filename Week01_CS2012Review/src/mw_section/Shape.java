package mw_section;
import java.util.Date;

public abstract class Shape {
	private String color;
	private Date dateCreated;
	private boolean isFilled;
	
	public Shape(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract double area();
	
	@Override
	public boolean equals(Object o) {
		if ( !(o instanceof Shape)) {
			return false;
		}
		
		Shape temp = (Shape)o;
		
		boolean isSameColor = this.color.equals(temp.color);

				
		return isSameColor;
		
		
		
		
	}
	
	
	@Override
	public String toString() {
		return "color: " + this.color;
	}
	
	
}
