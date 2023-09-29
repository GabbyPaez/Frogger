import objectdraw.*;
import java.awt.*;
import java.util.*;

public class Lily {


  private ArrayList<VisibleImage> lilyImages;
  private Image lilyFrog, lilyPad;
  private int x,y;
  private Frog rog;
  public Lily(int x, int y, Image lilyPad, Image lilyFrog, Frog rog, DrawingCanvas c){
    this.lilyPad = lilyPad;
    this.lilyFrog = lilyFrog;
    this.x = x;
    this.y = y; 

   this.rog = rog;

    lilyImages = new ArrayList<VisibleImage>();
    for(int i = 0; i < 13; i++){
         
      lilyImages.add( new VisibleImage(lilyPad, x*i*5, y, 50,50, c));
    }
    
  }

  public boolean overlaps(VisibleImage rog){
  boolean overlap = false;
   
     for(int i = 0; i < lilyImages.size(); i ++){
      if(lilyImages.get(i).overlaps(rog))
          {
           lilyImages.get(i).setImage(lilyFrog);
            overlap = true;
            System.out.println("overlaping on this stupid pad");
          }
    }
      return overlap;
  }

  


}