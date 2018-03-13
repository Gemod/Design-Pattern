package Cor;

import javax.swing.JOptionPane;

public class UserHandler extends FormHandler {

	public void handleRequest(HelpEnum request) {
		if (request == HelpEnum.USER) {
			
			JOptionPane.showMessageDialog(null, "La password deve contenere lettere maiuscole, minuscole e simboli");
		} else {
			
			if (successor != null) {
				successor.handleRequest(request);
			}
		}
	}

}