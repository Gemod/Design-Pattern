package FlyWeight;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Angel extends Graphic
{
	
	private ImageIcon angelo;
	
	public Angel() 
	{

		try {
			angelo =new ImageIcon(ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("angelo-disegno.jpg")));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
		
	
	public ImageIcon getAngel() {
		return angelo;
	}
	
	
	
	public void Draw()
	{
		
	}
}
