package AbstractFactory;

public class oTree implements Tree {

	@Override
	public void drawObject(int n) {
		int cont = 0;
		for (int i = 0; i < n; i++)
		{
			cont++;
			for (int spazio = 0; spazio < (n - cont); spazio++)
			{
				System.out.print(" ");
			}
			for (int dis = 0; dis < cont; dis++)
			{
				System.out.print(" ");
				System.out.print("o");
			}
			System.out.println();
		}
		for (int sp = 0; sp < n; sp++)
		{
			System.out.print(" ");
		}
		System.out.println("o");
	}

}
