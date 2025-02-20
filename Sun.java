import java.awt.*;
import javax.swing.*;

public class Sun extends JComponent implements DrawingObject{    

    public Sun () {

    }
    
    // this shouldnt be here na since asa circle na siya
    public void draw(Graphics2D g2d){
        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        Circle araw = new Circle(650,20,100, Color.YELLOW);
        araw.draw(g2d);
    }
}  