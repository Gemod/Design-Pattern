package FactoryMethod;



public class FordFactory extends AutoFactory
{


	@Override
	public Berlina makeBerlina() {
		return new FordBerlina();
	}

	@Override
	public MonoVolume makeMonovolume() {
		return new FordMonoVolume();
	}

	@Override
	public StationWagon makeStationWagon() {
		return new FordStationWagon();
	}

	@Override
	public Sport makeAutoSport() {
		return new FordSport();
	}
 
}
