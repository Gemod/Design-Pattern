package Observer;

import java.awt.List;
import java.util.ArrayList;

public class Subject 
{
	private ArrayList<KindObserver> observers=new ArrayList<KindObserver>();
	private int state;
	
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public void attach(KindObserver server)
	{
		observers.add(server);
	}
	public void notifyAllObserver()
	{
		for(KindObserver server : observers)
			server.update();
	}
}
