package AbstractFactory;

public class xGift implements Gift {

	@Override
	public void drawObject(int n) 
	{
		for (int i = 0; i < n; i++)
		{
			for (int x = 0; x < n; x++)
			{
				System.out.print(" ");
			}
			for (int j = 0; j < n; j++)
			{
				System.out.print("x");
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
