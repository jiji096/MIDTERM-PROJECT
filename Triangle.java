import java.awt.*;
import java.awt.geom.*;

public class Triangle implements DrawingObject {
    private double x;
    private double y;
    private double size;
    private Color color;

    public Triangle(double x, double y, double size, Color color){
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

        Line2D.Double line1 = Line2D.Double(650, 5,);

    }
}