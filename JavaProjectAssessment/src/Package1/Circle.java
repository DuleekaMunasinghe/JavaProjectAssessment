package Package1;

public class Circle extends Shapes {
	double area, radius;

	public Circle(double radius) {
        this.radius = radius;
    }

	public double calcArea() //method to calculate the area in the child classes
	{
		area = Math.PI*radius*radius;
		return area;
	}

}
