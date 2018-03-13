package Prototypes;

public class Main {

	public static void main(String[] args) 
	{
		
		
		Auto berlina=new Berlina();
		berlina.setColore("yellow");
		berlina.setMarchio("ford");
		berlina.setName("focus");
		berlina.setPeso(1200);
		berlina.setTipo("berlina");
		System.out.println(berlina.toString());
		
		Berlina station = (Berlina)berlina.buildCar();

		System.out.println(station.toString());
		

	}

}
