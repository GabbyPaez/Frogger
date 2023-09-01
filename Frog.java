import objectdraw.*;
import java.awt.*;

public class Frog {


  private VisibleImage frogImage;
  private static final double FROG_HIEGHT = 48;



  public Frog(Image i, DrawingCanvas c) {
    frogImage = new VisibleImage(i, new Location(250, 500), c);
  }
  
    public boolean overlaps(VisibleImage vehicleImage){
    return frogImage.overlaps(vehicleImage);
  
  }
  public void hop(char ch){
    if (ch == 'a'){
      frogImage.move(-10, 0);
    }
    if (ch == 'w'){
      frogImage.move(0,-10);
    }
    if (ch == 's'){
      frogImage.move(0,10);
    }
    if (ch == 'd'){
      frogImage.move(10,0);
    }
  }
}

