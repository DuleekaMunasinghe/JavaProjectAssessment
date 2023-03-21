package Package1;
public class Triangle extends Shapes {
	double area, base,height;

	public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

	public double calcArea() {
		area = 0.5*base*height*height;
		return area;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
