package Proxy;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Client extends JFrame
{	
	private JPanel p;
	private JButton button;
	private static final String[] ACTION = new String[] { "Lista movimenti", "Elimina Conto" };
	private JComboBox<?> berlina = new JComboBox<Object>(ACTION);
	String[] choices = { "Direttore", "Impiegato" };
	public Client() {
		
	    String input = (String) JOptionPane.showInputDialog(null, "Seleziona il tuo impiego...",
	        "Autentication", JOptionPane.QUESTION_MESSAGE, null,choices,choices[1]);
		p = new JPanel();
		p.setPreferredSize(new Dimension(400, 300));
		p.setLayout(null);
		setContentPane(p);
		button=new JButton("OK");
		button.setBounds(190, 230,140,30);
		p.add(button);
		
		
	     ContoCorrente contoCorrente;
	        if(input=="Impiegato")
	        	contoCorrente = new ProxyBanca( "",  "");
	        else
	        	contoCorrente = new Banca( "",  "");

				
		berlina.setBounds(100, 70, 160, 60);
		berlina.setAutoscrolls(true);
		berlina.setSelectedIndex(0);
		berlina.setVisible(true);
		berlina.setFont(new Font("Serif", 3, 20));
		p.add(berlina);
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				super.mousePressed(e);
				
				String nameSelecter=berlina.getSelectedItem().toString();
				if(nameSelecter.equals("Lista movimenti"))
					System.out.println(contoCorrente.listaMovimenti(""));
				else
					contoCorrente.eliminaConto(0);
				
			}});
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		repaint();
	}
		 
	    public static void main(String[] args)
	    {
	    	 
	    	 	    		
	    	    
	    	   
	    	Client client=new Client();

	    	    
	       
	   	    
	    }
	
}
