package Bridge;
public class Circle extends Shape {

	private int radius;

	public Circle(final int x, final int y, final int radius, ShapeImp shapeImp) {

		super(x, y, shapeImp);
		this.radius = radius;
	}

	@Override
	public void draw() {

		shapeImp.drawCircle(x, y, radius);
	}
}
