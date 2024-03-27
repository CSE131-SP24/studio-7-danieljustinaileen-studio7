package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	private double length;
	private double width;

	public Rectangle(double l, double w) {
		this.length = l;
		this.width = w;
	}

	public boolean isSquare() {
		if (this.length == this.width) {
			return true;
		}
		return false;
	}

	public double getArea() {
		return this.length * this.width;
	}

	public double getPerimeter() {
		return 2 * (this.length + this.width);
	}

	public void drawSelf() {
		StdDraw.rectangle(0.5, 0.5, width / 2, length / 2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle(0.5,0.6);
		System.out.println(rect.isSquare());
		System.out.println(rect.getArea());
		System.out.println(rect.getPerimeter());
		rect.drawSelf();
		}

}
