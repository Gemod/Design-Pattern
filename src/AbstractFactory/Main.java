package AbstractFactory;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		AbstractFactory f=null;
		
		System.out.println("che tipologia?");
		Scanner c=new Scanner(System.in);
		
		switch(c.next())
		{
			case "x":
				f = new asterischi();
				
				break;
		
			case "@":
			
				f= new chiocciole();
				break;
			
		}
		f.getGift().drawObject(5);
		f.getTree().drawObject(5);
	}

}
