import objectdraw.*;
import java.awt.*;

public class Frog {


  private VisibleImage frogImage, heartImage;
  private static final double FROG_HIEGHT = 48;
  private Image aliveFrog, deadFrog, fullHealth;
  private boolean death;
  private int lives;
  private Image h3, h2, h1, h0;
 //prive DrawingCanvas;


  public Frog(Image i,Image de,Image h3,Image h2,Image h1,Image h0, DrawingCanvas c) {
    aliveFrog = i;
    deadFrog = de;
    frogImage = new VisibleImage(i, new Location(250, 500), c);
    death = false;
    lives = 3;
    this.h3 = h3;
    this.h2 = h2;
    this.h1 = h1;
    this.h0 = h0;
    heartImage = new VisibleImage(h3, new Location(0, 0), c);
   lives();
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
              lives--;
              lives();
     if(lives == 0)
     {
    
     }
    else
    {
    reincarnate();
    }
}
  public void reincarnate(){
    frogImage.setImage(aliveFrog);
    frogImage.moveTo(250,500);
    death = false;
  }

  public void lives(){
    if(lives == 3){
      heartImage.setImage(h3);
    }
    else if(lives == 2){
      heartImage.setImage(h2);
    }
    else if(lives ==1){
      heartImage.setImage(h1);
    }
    else{
      heartImage.setImage(h0);
    }
     //heartImage.set("3heart.png");
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

