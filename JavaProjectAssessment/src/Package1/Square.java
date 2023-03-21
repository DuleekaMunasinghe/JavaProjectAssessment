package Package1;

import java.util.Scanner;
public class Square extends Shapes {
	double area, side;

	public Square(double side) {
        this.side = side;
    }

	public double calcArea() {
		area = side*side;
		return area;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
