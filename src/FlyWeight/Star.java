package FlyWeight;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Star extends Graphic 
{

	private ImageIcon Star;
	public Star() 
	{
		try {
			Star=new ImageIcon(ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("stella.jpg")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	public ImageIcon getStar() {
		return Star;
	}
}
