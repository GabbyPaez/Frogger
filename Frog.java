import object.draw.*;
import java.awt.*;

public class Frog{


  private VisibleImage fromImage;
  private static final double FROG_HIEGHT = 48;



  public Frog(Image i, DrawingCanvas c) {
    frogImage = new VisibleImage(i, new Location(10, 10), c);
  }
  
    public boolean overlaps(VisibleImage vechicleImage){
    return true;
  
  }
}

