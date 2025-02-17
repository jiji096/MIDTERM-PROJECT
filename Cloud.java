import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;


public class Cloud extends JComponent implements DrawingObject {
    private double x;
    private double y;
    private double size;
    private Color color;

    public Cloud (double x, double y, double size, Color color){
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
    }

    public void draw(Graphics2D g2d){
        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        // Ellipse2D.Double e1 = new Ellipse2D.Double(0,75,70,70);
        // Ellipse2D.Double e2 = new Ellipse2D.Double(30,60,90,90);
        // Ellipse2D.Double e3 = new Ellipse2D.Double(70,70,85,85);
        // Ellipse2D.Double e4 = new Ellipse2D.Double(65,50,70,70);
        // Ellipse2D.Double e5 = new Ellipse2D.Double(110,70,70,70);
   
        Ellipse2D.Double cloud1 = new Ellipse2D.Double(x,y,size,size);
        Ellipse2D.Double cloud2 = new Ellipse2D.Double(x+size*0.43,y-size*0.21,size*1.29,size*1.29);
        Ellipse2D.Double cloud3 = new Ellipse2D.Double(x+size*0.99,y-size*0.07,size*1.22,size*1.22);
        Ellipse2D.Double cloud4 = new Ellipse2D.Double(x+size*1.12,y-size*0.36,size,size);
        Ellipse2D.Double cloud5 = new Ellipse2D.Double(x+size*1.57,y-size*0.07,size*1.1,size*1.06);


        g2d.setColor(color);
        g2d.fill(cloud1);
        g2d.fill(cloud2);
        g2d.fill(cloud3);
        g2d.fill(cloud4);
        g2d.fill(cloud5);

    }
}