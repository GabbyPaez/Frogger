import objectdraw.*;
import java.awt.*;
import java.lang.*;

public class Vehicle extends ActiveObject{


  private VisibleImage vehicleImage;
  private static final double VEHICLE_HIEGHT = 48;
  private double velocity;



  public Vehicle(Image i, DrawingCanvas c, double x, double y, double velocity, int cutOff) {
    vehicleImage = new VisibleImage(i, new Location(x, y), c);
    this.velocity = velocity;
    //this.start();
  }
  public void run(){
  double timenow = System.currentTimeMillis();
    pause(30);
    double actualPause = timenow - 30;
    //speed times time for distance
    double distance = velocity * actualPause;
    
  
  
  }
    
}

