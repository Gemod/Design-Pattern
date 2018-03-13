package Proxy;

import java.awt.List;
import java.util.ArrayList;

import javax.management.RuntimeErrorException;

public class Banca  implements ContoCorrente 
{

	private String numeroConto;

    private String username;
    private String password;
   
 
    public Banca(String username, String password)
    {
        this.username = username;
        this.password = password;
       
       
    }
 
    @Override
    public ArrayList listaMovimenti(String numeroConto) 
    {
    	this.numeroConto=numeroConto;
        return Estrattore.getMovimenti(numeroConto);
    }

	@Override
	public void eliminaConto(int x) 
	{
		
	}
	public String getNumeroConto() {
		return numeroConto;
	}

    
	
}
