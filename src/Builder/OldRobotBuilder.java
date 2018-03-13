package Builder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class OldRobotBuilder implements RobotPlan
{
	String head;
	String Leg;
	String arm;
	String torso;
	
	@Override
	public void setRobotHead(String n) {
		this.head="old"+n;
		
	}

	@Override
	public void setRobotTorso(String n) {
		this.torso="old"+n;
		
	}

	@Override
	public void setRobotArms(String n) {
		this.arm="old"+n;
		
	}

	@Override
	public void setRobotLegs(String n) {
		this.Leg="old"+n;
		
	}
	@Override
	public String toString()
	{
		return "torso"+torso+"  head"+head+"  arms:"+arm+" legs"+Leg;
	}

}
