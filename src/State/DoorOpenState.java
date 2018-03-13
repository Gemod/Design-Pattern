package State;

import java.awt.Image;

public class DoorOpenState implements DoorState
{

	@Override
	public Image openDoor() 
	{
		return ImageLoader.getOpen();
	}

}
