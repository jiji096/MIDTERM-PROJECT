import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Sun extends JComponent implements DrawingObject{    

    public Sun () {

    }
    
    public void draw(Graphics2D g2d){
        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        Ellipse2D.Double araw = new Ellipse2D.Double(650, 10, 100, 100);
        g2d.setColor(Color.YELLOW);
        g2d.fill(araw);

    }
}  