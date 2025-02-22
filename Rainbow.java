import java.awt.*;
import java.awt.geom.*;

public class Rainbow implements DrawingObject {
    
    public Rainbow(){

    }

    public void draw(Graphics2D g2d){
        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        Circle red = new Circle(100,120,600,new Color(248, 175, 175));
        Circle orange = new Circle(120,140,560,new Color(255, 198, 138));
        Circle yellow = new Circle(140,160,520,new Color(255, 243, 202));
        Circle green = new Circle(160,180,480,new Color(219, 239, 199));
        Circle blue = new Circle(180,200,440,new Color(199, 220, 255));
        Circle purple = new Circle(200,220,400,new Color(241, 216, 255));
        Circle white = new Circle(220,240,360,Color.WHITE);

        // Circle red = new Circle(100,120,600,Color.RED);
        // Circle orange = new Circle(120,140,560,new Color(255, 140, 0));
        // Circle yellow = new Circle(140,160,520,new Color(255, 210, 18));
        // Circle green = new Circle(160,180,480,new Color(0, 128, 0));
        // Circle blue = new Circle(180,200,440,Color.BLUE);
        // Circle purple = new Circle(200,220,400,new Color(128, 0, 128));
        // Circle white = new Circle(220,240,360,Color.WHITE);

        red.draw(g2d);
        orange.draw(g2d);
        yellow.draw(g2d);
        green.draw(g2d);
        blue.draw(g2d);
        purple.draw(g2d);
        white.draw(g2d);

    }

}