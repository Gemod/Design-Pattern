package Interpreter;

public class Numero implements Espressione
{
	private int numero;

	public Numero(int n) 
	{
		this.numero=n;
	}
	@Override
	public int interpret() {
		// TODO Auto-generated method stub
		return numero;
	}

}
