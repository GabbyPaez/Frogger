import objectdraw.*;
import java.awt.*;

public class Frog {


  private VisibleImage frogImage;
  private static final double FROG_HIEGHT = 48;
  private Image aliveFrog, deadFrog;
  private boolean death;
  private int lives;
 //prive DrawingCanvas;


  public Frog(Image i,Image de, DrawingCanvas c) {
    aliveFrog = i;
    deadFrog = de;
    frogImage = new VisibleImage(i, new Location(250, 500), c);
    death = false;
  }
  
    public boolean overlaps(VisibleImage vehicleImage, boolean vehicle){
     // System.out.println("calls overlaps method");
      if(vehicle)
      {
        if(frogImage.overlaps(vehicleImage))
          {
           death();
          }
      }

      
    return frogImage.overlaps(vehicleImage);
  
  }
public void death(){
 death = true;
            frogImage.setImage(deadFrog);
            double timenow = System.currentTimeMillis();
            System.out.print(timenow);
            while(System.currentTimeMillis() < timenow + 1000)
              {
                
              }
            reincarnate();

}
  public void reincarnate(){
    frogImage.setImage(aliveFrog);
    frogImage.moveTo(250,500);
    death = false;
  }
  
  
  public void hop(char ch){
    if(death == false)
    {
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
}

