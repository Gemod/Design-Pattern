package Proxy;

import java.awt.List;
import java.util.ArrayList;

public class Estrattore 
{
	static boolean direttore=false;
	public static boolean getDirettore()
	{
		return direttore;
	}
	private static ArrayList<String> movimenti=new ArrayList<>();
	
	
	public static ArrayList getMovimenti(String numeroConto) 
	{
		addMovimenti();
        return movimenti;
    }
	public static void addMovimenti()
	{
		movimenti.add("Lista movimenti vuota");
	}
}
