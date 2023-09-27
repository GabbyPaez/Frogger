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
    for(int i = 0; i < 13; i++){
         
      lilyImages.add( new VisibleImage(lilyPad, x*i*5, y, 50,50, c));
    }
    
  }

  public boolean overlaps(VisibleImage frog, boolean overlap){
   
     for(int i = 0; i < lilyImages.size(); i ++){
      if(lilyImages.get(i).overlaps(frog))
          {
           lilyImages.get(i).setImage(lilyFrog);
            overlap = true;
          }
      else
          {
          lilyImages.get(i).setImage(lilyPad);
            overlap = false;
          }
     }
      return overlap;
  }

  


}