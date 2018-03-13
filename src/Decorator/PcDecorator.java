package Decorator;

public class PcDecorator implements Component 
{
	protected Component component;
	
	public PcDecorator(Component c) 
	{
		this.component=c;
	}
	
	@Override
	public void draw() 
	{
		this.component.draw();
		
	}

	@Override
	public String getFeature() {
		return "Pc complete of 4K screen  and led keyboard";
	}

}
