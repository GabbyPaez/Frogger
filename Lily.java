import objectdraw.*;
import java.awt.*;
import java.util.*;

public class Lily {


  private ArrayList<VisibleImage> lilyImages;
  private Image lilyFrog, lilyPad;
  private int x,y;
  public Lily(int x, int y, Image lilyPad, Image lilyFrog, DrawingCanvas c){
    this.lilyPad = lilyPad;
    this.lilyFrog = lilyFrog;
    this.x = x;
    this.y = y;
    lilyImages = new ArrayList<VisibleImage>();
    for(int i = 0; i < 10; i++){
      lilyImages.add( new VisibleImage(lilyPad, x, y, c));
    }
    
  }

  


}