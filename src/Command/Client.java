package Command;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


import State.DoorCloseState;
import State.DoorOpenState;
import State.DoorState;


public class Client extends JPanel {

	private Image img;
	private RemoteControl control;
	private Command lightsOn,lightsOff;
	Light light;
	public Client(DoorState state) {
		
		img=ImageLoader.getClose();
		control = new RemoteControl();
	     light = new Light();
	    lightsOn = new LightOnCommand(light);
	    lightsOff = new LightOffCommand(light);
		JButton button = new JButton("turn on");
		JButton button1 = new JButton("turn off");
	

		button.addActionListener(e -> turnOff());
		button1.addActionListener(e -> turnOn());
		
		this.add(button);	
		this.add(button1);

	}
	public void turnOff()
	{	
	
		control.setCommand(lightsOff);
		control.pressButton();
		img=light.switchOff();
		repaint();
	}

	public void turnOn()
	{
		control.setCommand(lightsOn);
		control.pressButton();
		img=light.switchOn();
		repaint();
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame("Light");
		frame.setSize(1024, 768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Client smile = new Client(new DoorOpenState());
		frame.add(smile);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}

	@Override
	protected void paintComponent(Graphics g) 
	{
		super.paintComponents(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		setBackground(Color.white);
		g2.drawImage(img, 250, 150, 500, 500, null);

	}

}