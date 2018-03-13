package Decorator;

public class Screen4K extends PcDecorator
{

	public Screen4K(Component c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void draw()
	{
		component.draw();
	}

}
