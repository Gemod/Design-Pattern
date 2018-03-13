package FlyWeight;

import java.util.HashMap;

public class ImagePool 
{
	HashMap<String,Graphic> poolImage=new HashMap<>();
	
	public Graphic getImage(String imageName)
	{
		if(!poolImage.containsKey(imageName))
		{
			switch (imageName) {
			case "Angel":
				poolImage.put("Angel", new Angel());
				break;

			case "Ball":
				poolImage.put("Ball", new Ball());
				break;
				
				
			case "Star":
				poolImage.put("Star", new Star());
				break;
				
			}
		}
		return poolImage.get(imageName);
	}
}
