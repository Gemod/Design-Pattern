package Bridge;
public class AsciiShapeImp implements ShapeImp {

	@Override
	public void drawCircle(int posX, int posY, int radius) {
		String [] result = new String [posY+radius*2+1];
		  for (int j = 0; j<posY+radius*2+1;j++)
		  {
		    result[j] = "";
		    for (int i = 0; i<posX+radius*2+1; i++)
		    {
		      float pointDistance = dist(i, j, posX, posY);
		      if (pointDistance < radius*2) 
		        result[j] +="*"; // or X ?
		      else
		        result[j]+=" ";
		    }
		  }
		  boolean wholeLine = true;
		  for (int j = 0; j < result.length; j++) {
		    boolean started = false;
		    if (!wholeLine && j < result.length-1 && !result[j+1].contains("*")) 
		      wholeLine = true;

		    if (!wholeLine)
		      for (int i = 0; i < result[j].length()-1; i++) {
		        if (result[j].charAt(i) != '*') continue;
		        if (!started) 
		          started = true;
		        else if (started && result[j].charAt(i+1) != '*') {
		        }
		        else 
		          result[j] = result[j].substring(0, i) + " " + result[j].substring(i+1);
		      }
		    if(wholeLine && result[j].contains("*")) wholeLine = false;
		    System.out.println(result[j]);
		  }
	}
	
	static float dist(int x1, int y1, int x2, int y2) {
		  return (int)Math.abs(Math.pow(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2), .5));
		}

	@Override
	public void drawRectangle(int x, int y, int width, int height) {

		for (int h = 0; h < height; h++) {
			System.out.print("\n");
			for (int w = 0; w < width; w++)
				System.out.print("*");
		}

	}
}
