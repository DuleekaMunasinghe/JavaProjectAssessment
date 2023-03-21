package Package1;

import java.awt.Shape;
import java.util.ArrayList;

public class DisplayValues {

	public static void main(String[] args) {
		Circle c = new Circle(5);// object for circle

		Square s = new Square(10);// object foe square
		
		Triangle t = new Triangle(5, 8);// object foe square

		ArrayList<Shapes> shapesList = new ArrayList<>();
		shapesList.add(c);
		shapesList.add(s);
		shapesList.add(t);
		
		try {
			for (Shapes shape : shapesList) {
		        double area = shape.calcArea();
		        shape.display(area);
		    }
		} catch (Exception e) {
		    System.out.println("An exception occurred: " + e.getMessage());
		} finally {
		    System.out.println("Done.");
		}

	}
}
