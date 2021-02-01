package mw_section;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try {
			Scanner in = new Scanner(new File("testdata.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			int[] arr = {1, 2, 3, 4, 5};
			System.out.println(arr[100]);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			//??????
		}
		
		
		
		
		
		// refVarName   instanceof Classname
		
		
		
		
		
		
		//Shape s1 = new Shape("red");
		
	    
	    
	    
	    Circle c1 = new Circle("blue", 7.45);
		Circle c2 = new Circle("red", 4.23);
		Circle c3 = new Circle("green", 28.49);
		Circle c4 = new Circle("pink", 15.75);
		Circle c5= new Circle("black", 5.92);
		
		Shape r1 = new Rectangle("green", 7, 10);
		
		
		System.out.println(r1 instanceof Rectangle);
		System.out.println(c1 instanceof Shape);
		
		
		ArrayList<Circle> myCircles = new ArrayList<>();
		
		ArrayList<Comparable> comparableItems = new ArrayList();
		
		comparableItems.add(new String("hello world"));
		comparableItems.add(c1);
		
		Comparable s = new Circle("orange", 8);
		
		myCircles.add(c1);
		myCircles.add(c2);
		myCircles.add(c3);
		myCircles.add(c4);
		myCircles.add(c5);
		
		for(Circle c : myCircles) {
			System.out.println(c);
			System.out.println();
		}
		
		Collections.sort(myCircles);
		
		System.out.println("\n Circles Sorted: ");
		
		for(Circle c : myCircles) {
			System.out.println(c);
			System.out.println();
		}
		
		printShape(c1);
		
		
		printShape(r1);
		
		
		ArrayList<Shape> allShapes = new ArrayList<>();
		
		allShapes.add(c1);
		allShapes.add(r1);
		
		for (int i = 0 ; i < allShapes.size() ; i++) {
			Shape nextShape = allShapes.get(i);
			
			if (nextShape instanceof Circle) {
				Circle nextCircle = (Circle)nextShape;
				System.out.println(nextCircle.getRadius());
			}
			
		}
		
		
		
	}
	
	public static void printShape(Shape shape) {
		System.out.println("test method: " + shape);
		
		System.out.println(shape.getColor());
		
		
	}
	
	
	
	

}
