package Bridge;
import javax.swing.JOptionPane;

public class Client {

	public static void main(String[] args) {
		Shape forma;

		while (true) {

			String form = JOptionPane
					.showInputDialog("Che tipo di forma vuoi? rettangolo/cerchio");
			switch (form) {
			case "rettangolo":
			
					forma = new Rectangle(10, 10, 70, 35, new AsciiShapeImp());
					forma.draw();
					break;
				
			case "cerchio":
				
					forma = new Circle(3, 3, 2, new AsciiShapeImp());
					forma.draw();
					break;
				}
				break;
			}

			int c = JOptionPane.showConfirmDialog(null, "vuoi continuare? ");
			if (c == JOptionPane.NO_OPTION || c == JOptionPane.CANCEL_OPTION)
				return;
		}

	}


