package Command;

import java.awt.Image;

public class Light
{
  private boolean on;
  public Image switchOn()
  {
    on = true;
    return ImageLoader.getOpen();
  }
  public Image switchOff()
  {
    on = false;
    return  ImageLoader.getClose();
  }
}