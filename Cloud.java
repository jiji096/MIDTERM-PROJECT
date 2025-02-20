import java.awt.*;
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

        Circle cloud1 = new Circle(x,y,size,color);
        Circle cloud2 = new Circle(x+size*0.43,y-size*0.21,size*1.29,color);
        Circle cloud3 = new Circle(x+size*0.99,y-size*0.07,size*1.22,color);
        Circle cloud4 = new Circle(x+size*1.12,y-size*0.36,size,color);
        Circle cloud5 = new Circle(x+size*1.57,y-size*0.07,size*1.1,color);

        cloud1.draw(g2d);
        cloud2.draw(g2d);
        cloud3.draw(g2d);
        cloud4.draw(g2d);
        cloud5.draw(g2d);


    }
}