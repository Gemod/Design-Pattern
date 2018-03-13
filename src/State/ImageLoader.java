package State;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageLoader {

	private static Image open;
	private static Image close;

	static {
		try {
			close = ImageIO.read(new File("C:/Users/Gemod/workspace/Pattern/resources/closedoor.png"));
			 open = ImageIO.read(new File("C:/Users/Gemod/workspace/Pattern/resources/opendoor.png"));
		} catch (final IOException e) {

			e.printStackTrace();
		}
	}

	public static Image getOpen() {
		
		return open;
	}
	public static Image getClose() {
		
		return close;
	}

}

