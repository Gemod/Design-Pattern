package FactoryMethod;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import Prototypes.Auto;

public class Client 
{	

	public static void main(String[] args) 
	{
		String[] choices = { "Ford", "Opel" };
		
			
		    String input = (String) JOptionPane.showInputDialog(null, "Seleziona il tuo impiego...",
		        "Autentication", JOptionPane.QUESTION_MESSAGE, null,choices,choices[1]);
		AutoFactory auto=AutoFactory.getInstance(input);
		
		String[] choices1 = { "Berlina", "Sport","Station Wagon", "Monovolume" };
		
		
	    String input1 = (String) JOptionPane.showInputDialog(null, "Scrivi il tuo modello...'Berlina,Monovolume,Sport,Station Wagon'");
	    
	    
	    switch (input1) 
	    {
			case "Berlina":
				auto.makeBerlina().Draw();
				break;
			case "Sport":
				auto.makeAutoSport().Draw();
				break;
			case "Station Wagon":
				auto.makeStationWagon().Draw();
				break;
			case "Monovolume":
				auto.makeMonovolume().Draw();
				break;
			default:
				break;
		}
		
	}
}
