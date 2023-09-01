import objectdraw.*;
import java.awt.*;

public class Vehicle {


  private VisibleImage vehicleImage;
  private static final double VEHICLE_HIEGHT = 48;



  public Vehicle(Image i, DrawingCanvas c) {
    vehicleImage = new VisibleImage(i, new Location(10, 100), c);
  }
  
    
}

