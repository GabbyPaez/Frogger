import objectdraw.*;
import java.awt.*;
import java.util.ArrayList;


public class Lane extends ActiveObject {

  private double speed;
  private DrawingCanvas can;
  private Image im;
  private ArrayList<Vehicle> theCarRow;
  private boolean incLeft;
  private int x, y;
  private Frog geraldTwo;
  
  
  public Lane (Image i, DrawingCanvas c, Boolean incomingLeft, int y, Frog g2)
  {
if (!incomingLeft) {
  speed = (Math.random() ) ;
  x = -50;
}
else {
  speed = Math.random() * -1;
  x =500;
}
    geraldTwo = g2;
    im = i;
    can = c;
    theCarRow = new ArrayList<Vehicle>();
    incLeft = incomingLeft;
    this.y = y;
    this.start();
    
   
  }

  public void run() {
    while (true) {

     //System.out.print(x+" "+y+" "+ speed);
      theCarRow.add(new Vehicle(im, can, x, y, speed, 800, geraldTwo));
      pause(speed * 10);
      
    }
    
    
    
  }
















  
}