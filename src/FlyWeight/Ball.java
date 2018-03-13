package FlyWeight;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Ball extends Graphic 
{
	
	private ImageIcon ball;
		public Ball() 
		{
			try {
				ball=new ImageIcon(ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("pallina-cielo-stellato-con-gancio.png")));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		public ImageIcon getBall() {
			return ball;
		}
}
