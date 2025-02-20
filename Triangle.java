import java.awt.*;
import java.awt.geom.*;

public class Triangle implements DrawingObject {

    public Triangle(){

    }

    public void draw(Graphics2D g2d){
        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        Line2D.Double line1 = new Line2D.Double(700, 50, 700, 60);
        g2d.setColor(Color.BLACK);
        g2d.draw(line1);

    

    }
}