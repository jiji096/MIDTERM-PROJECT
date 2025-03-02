import java.awt.*;
import java.awt.geom.*;

public class Quadrilateral implements DrawingObject {
    private double x1, y1, x2, y2, x3, y3, x4, y4;
    private Color color;

    public Quadrilateral(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4, Color color) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
        this.color = color;
    }

    public void draw(Graphics2D g2d){
        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        Path2D.Double quadrilateral = new Path2D.Double();
        quadrilateral.moveTo(x1, y1);
        quadrilateral.lineTo(x2, y2);
        quadrilateral.lineTo(x3, y3);
        quadrilateral.lineTo(x4, y4);
        quadrilateral.closePath();
        g2d.setColor(color);
        g2d.fill(quadrilateral);
    }
}