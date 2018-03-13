package Cor;

import javax.swing.JOptionPane;

public class PasswordHandler extends FormHandler {

	public void handleRequest(HelpEnum request) {
		if (request == HelpEnum.PASSWORD) {
		
			JOptionPane.showMessageDialog(null,"La password deve coincidere con la password inserita prima");
		} else {
			
			if (successor != null) {
				successor.handleRequest(request);
			}
		}
	}

}
