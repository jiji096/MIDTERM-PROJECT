import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class Sun extends JComponent implements DrawingObject{    

    public Sun () {

    }
    
    public void draw(Graphics2D g2d){
        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        Circle araw = new Circle(650,20,100, Color.YELLOW);
        araw.draw(g2d);
        Triangle rays = new Triangle(755, 50, 785, 70, 755, 90, Color.yellow);
        rays.draw(g2d);
        AffineTransform reset = g2d.getTransform();
        // outside rays
        g2d.rotate(Math.toRadians(90), 755, 50);
        g2d.translate(75, 35);
        rays.draw(g2d);

        g2d.rotate(Math.toRadians(90), 755, 50);
        g2d.translate(75, 35);
        rays.draw(g2d);

        g2d.rotate(Math.toRadians(90), 755, 50);
        g2d.translate(75, 35);
        rays.draw(g2d);
        
        // inside rays
        g2d.rotate(Math.toRadians(45), 755, 50);
        g2d.translate(30, 33);
        rays.draw(g2d);

        g2d.rotate(Math.toRadians(90), 755, 50);
        g2d.translate(75, 35);
        rays.draw(g2d);

        g2d.rotate(Math.toRadians(90), 755, 50);
        g2d.translate(75, 35);
        rays.draw(g2d);

        g2d.rotate(Math.toRadians(90), 755, 50);
        g2d.translate(75, 35);
        rays.draw(g2d);
        g2d.setTransform(reset);
    }
}  