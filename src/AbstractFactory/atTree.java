package AbstractFactory;

public class atTree implements Tree {

	@Override
	public void drawObject(int x) 
	{
		int cont = 0;
		for (int i = 0; i < x; i++)
		{
			cont++;
			for (int spazio = 0; spazio < (x - cont); spazio++)
			{
				System.out.print(" ");
			}
			for (int dis = 0; dis < cont; dis++)
			{
				System.out.print(" ");
				System.out.print("@");
			}
			System.out.println();
		}
		for (int sp = 0; sp < x; sp++)
		{
			System.out.print(" ");
		}
		System.out.println("@");
		

	}

}
