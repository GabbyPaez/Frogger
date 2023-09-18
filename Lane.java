import objectdraw.*;
import java.awt.*;
import java.util.ArrayList;


public class Lane extends ActiveObject {

  private double speed;
  private DrawingCanvas can;
  private Image im;
  private ArrayList<Vehicle> theCarRow;
  private boolean left;
  private int x, y;
  private Frog geraldTwo;
  
  
  public Lane (Image i, DrawingCanvas c, Boolean incomingLeft, int y, Frog g2)
  {
if (!incomingLeft) {
  speed = (Math.random() +.03) * - 1;
  x = 900;
}
else {
  speed = Math.random() +.03;
  x = -100;
}
    geraldTwo = g2;
    im = i;
    can = c;
    theCarRow = new ArrayList<Vehicle>();
    left = incomingLeft;
    this.y = y;
    this.start();
    
   
  }

  public void run() {
    Vehicle mcQueen = new Vehicle(im, can, x, y, speed, 800, geraldTwo);
    
    
  }
















  
}