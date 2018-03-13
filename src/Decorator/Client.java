package Decorator;

public class Client {

		public static void main(String[] args) 
		{
			Component c=new Screen4K(new LedKeyBoard(new Pc()));
			c.getFeature();
		}
}
