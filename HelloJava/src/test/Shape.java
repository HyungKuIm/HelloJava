package test;

public sealed class Shape permits Circle, Rectangle {
	public double getArea()
	{
		return 0.0;
	}
}

final class Circle extends Shape {
	private final double radius;

	public Circle(double d) {
		this.radius = d;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return radius * radius * Math.PI;
	}
}

final class Rectangle extends Shape {
	private final double width, height;
	public Rectangle(double w, double h) {
		this.width = w;
		this.height = h;
	}

	@Override
	public double getArea() {
		return width * height;
	}
}


