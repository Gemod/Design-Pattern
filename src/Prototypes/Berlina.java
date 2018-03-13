package Prototypes;

public class Berlina extends Auto
{

	@Override
	public void draw() {
		
		
	}

	@Override
	public Auto buildCar() {
		Berlina berlina=null;
		
		
		try {
			berlina=(Berlina)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return berlina;
	}

	
	
	
}
