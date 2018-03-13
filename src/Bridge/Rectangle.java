package Bridge;
public class Rectangle extends Shape {

	private int width, height;

	public Rectangle(final int x, final int y, final int width, final int height, final ShapeImp shapeImo) {

		super(x, y, shapeImo);
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {

		shapeImp.drawRectangle(x, y, width, height);
	}

}