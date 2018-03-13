package Proxy;

import java.util.ArrayList;

import javax.management.RuntimeErrorException;
import javax.swing.JOptionPane;

public class ProxyBanca implements ContoCorrente {
 
    private String username;
    private String password;
    private Banca uniCredit;
 
    public ProxyBanca(String username, String password)
    {
        this.username = username;
        this.password = password;
       
        uniCredit = new Banca(username, password);
    }
 
    @Override
    public ArrayList listaMovimenti(String numeroConto) {
    	ArrayList lista = null;
        if( this.checkUser() )
            lista = uniCredit.listaMovimenti( numeroConto );
        return lista;
    }
 
    private boolean checkUser()
    {
        return IdentityManager.checkUser(username, password);
    }

    public void setDirettore(boolean c)
    {
    	Estrattore.direttore=c;
    }
	@Override
	public void eliminaConto(int x) 
	{
			
		JOptionPane.showMessageDialog(null, " L' utente non è abilitato ad eliminare il conto ");
		throw new RuntimeException("L utente non è abilitato ad eliminare il conto");

	}

	
}
