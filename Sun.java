import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Sun extends JComponent implements DrawingObject{    

    private double rotation;

    public Sun () {

    }

    public void rotate(){
        rotation += 5;
    }
    
    public void draw(Graphics2D g2d){
        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        AffineTransform reset = g2d.getTransform();
        g2d.rotate(Math.toRadians(rotation),400, 600);

        Circle araw = new Circle(650,20,100, new Color(255, 210, 18));
        Circle buwan = new Circle(133,600+(600-20)-100,100, new Color(30, 210, 255));
        buwan.draw(g2d);
        araw.draw(g2d);
        //Triangle rays = new Triangle(755, 50, 785, 70, 755, 90, new Color(255, 210, 18));
        Triangle rays = new Triangle(755, 50, 785, 70, 755, 90, new Color(255, 210, 18));
        rays.draw(g2d);


        // outside rays
        for (int i = 0; i < 3; i++) {
            g2d.rotate(Math.toRadians(90), 755, 50);
            g2d.translate(75, 35);
            rays.draw(g2d);
        }

        g2d.rotate(Math.toRadians(45), 755, 50);
        g2d.translate(30, 33);
        rays.draw(g2d);


        for (int i = 0; i < 3; i++) {
            g2d.rotate(Math.toRadians(90), 755, 50);
            g2d.translate(75, 35);
            rays.draw(g2d);
        }

        g2d.setTransform(reset);
    }
}  