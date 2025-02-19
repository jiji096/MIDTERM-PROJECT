import java.awt.*;
import java.awt.geom.*;

public class Dolphin implements DrawingObject {
    
    public Dolphin () {

    }

    public void draw(Graphics2D g2d) {
        Rectangle2D.Double r1 = new Rectangle2D.Double(10, 10, 10, 10);
        g2d.setColor(Color.PINK);
        g2d.fill(r1);
    }
}