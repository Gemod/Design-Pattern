package FactoryMethod;

import AbstractFactory.AbstractFactory;

public class OpelFactory extends AutoFactory
{

	public Berlina makeBerlina() {
		
		return new OpelBerlina();
	}

	public MonoVolume makeMonovolume() {
		return new OpelMonoVolume();
	}

	
	public StationWagon makeStationWagon() {
		return new OpelStationWagon();
	}

	
	public Sport makeAutoSport() {
		return new OpelSport();
	}

}
