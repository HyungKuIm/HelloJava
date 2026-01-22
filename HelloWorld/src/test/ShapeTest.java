package test;

public class ShapeTest {

	public static void main(String[] args) {
		Circle circle = new Circle(5.0);
		//System.out.println(circle.getArea());
		printArea(circle);

		Rectangle rect = new Rectangle(3.0, 5.0);
		//System.out.println(rect.getArea());
		printArea(rect);
		System.out.println("=== Extra Info ===");
		printExtraInfo(circle);
		printExtraInfo(rect);

	}

	static void printArea(Shape shape) {
		System.out.println(shape.getArea());
	}

	static void printExtraInfo(Shape shape) {
		if (shape instanceof Circle c) {
			System.out.println(c.getCircumference());
		} else if (shape instanceof Rectangle r) {
			System.out.println(r.getPerimeter());
			System.out.println(r.isSquare());
		}
	}

}
