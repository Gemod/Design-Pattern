package FactoryMethod;



public class  AutoFactory 
{
	private static AutoFactory instance=null;
	
	public static AutoFactory getInstance(String name) 
	{
		if(instance ==null)
		{
			if(name.equals("Ford"))
					instance=new FordFactory();
			else
				instance = new OpelFactory();
		}
		return instance;
	}
	protected AutoFactory()
	{
		
	}
	public  Berlina makeBerlina() {
		return null;
	}
	public  MonoVolume makeMonovolume() {
		return null;
	}
	public  StationWagon makeStationWagon() {
		return null;
	}
	public  Sport makeAutoSport() {
		return null;
	}
}
