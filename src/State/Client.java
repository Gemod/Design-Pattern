package State;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Client extends JPanel {

	private static final long serialVersionUID = 1L;
	private DoorState state;
	private Image img;

	public Client(DoorState state) {
		this.state = state;
		img = state.openDoor();

		JButton button = new JButton("Open");
		JButton button1 = new JButton("Close");
	

		button.addActionListener(e -> happy());
		button1.addActionListener(e -> sad());
		this.add(button);
		this.add(button1);
		

	}

	public void setState(DoorState s) {
		this.state = s;
	}

	public void happy() {
		setState(new DoorOpenState());
		img = state.openDoor();
		repaint();
	}

	public void sad() {
		setState(new DoorCloseState());
		img = state.openDoor();
		repaint();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponents(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		setBackground(Color.white);
		g2.drawImage(img, 250, 150, 500, 500, null);

	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Door");
		frame.setSize(1024, 768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Client smile = new Client(new DoorOpenState());
		frame.add(smile);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);

	}
}
