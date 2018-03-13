package State;

import java.awt.Image;

public class DoorCloseState implements DoorState
{

	@Override
	public Image openDoor() {
		return ImageLoader.getClose();
	}

}
