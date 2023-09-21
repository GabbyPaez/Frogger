import objectdraw.*;
import java.awt.*;
import java.lang.*;

public class Vehicle extends ActiveObject{


  private VisibleImage vehicleImage;
  private static final double VEHICLE_HIEGHT = 48;
  private double velocity;
  private Frog Gerald;



  public Vehicle(Image i, DrawingCanvas c, double x, double y, double velocity, int cutOff, Frog Gerald) {
    vehicleImage = new VisibleImage(i, new Location(x, y), c);
    this.velocity = velocity;
    this.Gerald = Gerald;
    this.start();
  }

  
  public void run(){
    while(vehicleImage.getX() > -100 && vehicleImage.getX() < 1000 ){
    //System.out.print("running");
  double timenow = System.currentTimeMillis();
    pause(30);
    double actualPause = System.currentTimeMillis() - timenow;
    //speed times time for distance
    double distance = velocity * actualPause;
    vehicleImage.move(distance,0);
    if(Gerald.overlaps(vehicleImage, true))
    {
      System.out.print("death");
    }    
    }
  }
    
}

