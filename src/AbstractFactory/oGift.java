package AbstractFactory;

public class oGift implements Gift {

	@Override
	public void drawObject(int n) {
		for (int i = 0; i < n; i++)
		{
			for (int x = 0; x < n; x++)
			{
				System.out.print(" ");
			}
			for (int j = 0; j < n; j++)
			{
				System.out.print("o");
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
