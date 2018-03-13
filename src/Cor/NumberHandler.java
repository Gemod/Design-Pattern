package Cor;

import javax.swing.JOptionPane;

public class NumberHandler extends FormHandler {

	public void handleRequest(HelpEnum request) {
		if (request == HelpEnum.NUMBER) {
          JOptionPane.showMessageDialog(null, "Il campo deve contenere solo numeri");
		} else {
			
			if (successor != null) 
			{
				successor.handleRequest(request);	
			}
		}
	}

}
