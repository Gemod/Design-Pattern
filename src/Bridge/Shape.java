package Bridge;

public abstract class Shape {


	protected ShapeImp shapeImp;
	protected int x, y;

	protected Shape(final int x, final int y, final ShapeImp shapeImp) {

		this.shapeImp = shapeImp;
		this.x = x;
		this.y = y;
	}

	public abstract void draw();



}
