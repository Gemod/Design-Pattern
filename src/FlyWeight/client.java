package FlyWeight;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.util.ArrayList;
 
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import java.util.HashMap;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.JLabel;


public class client extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2743574149855089215L;
	private JPanel p;
	JButton plsBall, plsStar,plsAngel;
	ImageIcon star, ball, tree, angel;
	Image current;
	ImagePool imgPool;
	HashMap<String, Image> images;
	ArrayList<Graphic> xy=new ArrayList<Graphic>();

	public client() throws IOException {
		p = new JPanel();
		p.setPreferredSize(new Dimension(800, 700));
		p.setLayout(null);
		setContentPane(p);

		p.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				images.put(x + " " + y, current);
				
				repaint();
			}
		});
		
		images = new HashMap<String, Image>();
		imgPool = new ImagePool();

		star = ((Star) imgPool.getImage("Star")).getStar();
		ball = ((Ball) imgPool.getImage("Ball")).getBall();
		angel= ((Angel) imgPool.getImage("Angel")).getAngel();
		
		tree = new ImageIcon(ImageIO.read(Thread.currentThread().getContextClassLoader().getResource("Albero.jpg")).getScaledInstance(500, 700, Image.SCALE_SMOOTH));

		JLabel l = new JLabel(tree);
		l.setBounds(100, 10, 502, 702);
		add(l);

		plsBall = new JButton(ball);
		plsBall.setBounds(10, 10, 50, 50);
		plsBall.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				current = ball.getImage();
				
			}

		});
		add(plsBall);

		plsStar = new JButton(star);
		plsStar.setBounds(10, 70, 50, 50);
		plsStar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				current = star.getImage();
				
			}
		});
		add(plsStar);

		
		plsAngel = new JButton(angel);
		plsAngel.setBounds(10, 135, 50, 50);
		plsAngel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				current = angel.getImage();
				
			}
		});
		add(plsAngel);
		
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		repaint();
	}

	@Override
	public void paint(Graphics g) {
		super.paintComponents(g);
		for (String s : images.keySet()) {
			String[] coord = s.split(" ");
			int x = Integer.parseInt(coord[0]), y = Integer.parseInt(coord[1]);
			Image img = images.get(s);
			System.out.println(img);
			g.drawImage(img, x - 17, y + 20, 50, 50, this);
		}

	}

	public static void main(String[] args) {
		try {
			client m = new client();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
