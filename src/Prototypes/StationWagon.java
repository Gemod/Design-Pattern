package Prototypes;

public class StationWagon extends Auto
{

	@Override
	public void draw() {
		System.out.println("station");
		
	}

	@Override
	public Auto buildCar() 
	{
		StationWagon auto=null;
		
		try {
			auto=(StationWagon)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return auto;
	}

	
	
}