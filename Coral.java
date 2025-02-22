import java.awt.*;
import java.awt.geom.*;

public class Coral implements DrawingObject {

    public Coral(){

    }

    public void draw(Graphics2D g2d){
        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        Path2D.Double front = new Path2D.Double();
        front.moveTo(179.3,598.6);
        front.curveTo(184.9,599.4,187.8,596.04,190.95,593.84);
        front.curveTo(191.13,591.87,198.7,593.28,198.93,590.73);
        front.curveTo(197.58,588.53,195.23,588.33,192.6,590.33);
        


        g2d.setColor(new Color(53, 150, 147));
        g2d.draw(front);
    }
}