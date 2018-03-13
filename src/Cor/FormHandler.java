package Cor;

public abstract class FormHandler {

	FormHandler successor;

	public void setSuccessor(FormHandler successor) {
		this.successor = successor;
	}

	public abstract void handleRequest(HelpEnum request);
}
