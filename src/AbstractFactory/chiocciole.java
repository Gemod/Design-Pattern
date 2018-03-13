package AbstractFactory;

public class chiocciole extends AbstractFactory 
{


	
	@Override
	public Gift getGift() {
		
		return new atGift();
	}

	@Override
	public Tree getTree() 
	{
		return new atTree();
	}

}
