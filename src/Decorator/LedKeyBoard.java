package Decorator;

public class LedKeyBoard extends PcDecorator
{

	public LedKeyBoard(Component c) {
		super(c);
		
	}

	@Override
	public void draw()
	{
		component.draw();
	}
	
}
