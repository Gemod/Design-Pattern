package Builder;

public class InformaticRobot implements RobotPlan
{


	String head;
	String Leg;
	String arm;
	String torso;
	@Override
	public void setRobotHead(String n) {
		this.head="Informatic"+n;
		
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
