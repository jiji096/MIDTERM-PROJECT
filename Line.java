import java.awt.*;
import java.awt.geom.*;

public class Line implements DrawingObject {
    private double x1, y1, x2, y2, thickness;
    private Color color;

    public Line(double x1, double y1, double x2, double y2, Color color, double thickness) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.color = color;
        this.thickness = thickness;
    }

    public void draw(Graphics2D g2d){
        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

       Line2D.Double line = new Line2D.Double(x1, y1, x2, y2);
       g2d.setStroke(new BasicStroke(10));
       g2d.draw(line);
    }
}