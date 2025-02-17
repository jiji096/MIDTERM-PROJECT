import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Waves implements DrawingObject{    
    
    public Waves(){

    }    
    
    public void draw(Graphics2D g2d){
        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        Path2D.Double curve = new Path2D.Double();
        curve.moveTo(250, 400);
        curve.curveTo(150,400,200,350,300,400);
        g2d.draw(curve);

    }
}