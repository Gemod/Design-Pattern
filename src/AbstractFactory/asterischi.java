package AbstractFactory;

public class asterischi  extends AbstractFactory
{


	@Override
	public Gift getGift() {
		return new xGift();
	}

	@Override
	public Tree getTree() {
		return new xTree();
	}

	
}
