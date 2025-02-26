import java.awt.*;
import java.awt.geom.*;

public class Triangle implements DrawingObject {
    private double x1, y1, x2, y2, x3, y3;
    private Color color;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3, Color color){
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        this.color = color;
    }

    public void draw(Graphics2D g2d){
        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);


        Path2D.Double triangle = new Path2D.Double();
        // triangle.moveTo(755, 50);
        // triangle.lineTo(785, 70);
        // triangle.lineTo(755,90);
        triangle.moveTo(x1,y1);
        triangle.lineTo(x2,y2);
        triangle.lineTo(x3,y3);
        triangle.closePath();
        g2d.setColor(color);
        g2d.fill(triangle);

        // // outside rays
        // g2d.rotate(Math.toRadians(90), 755, 50);
        // g2d.translate(75, 35);
        // g2d.fill(triangle);

        // g2d.rotate(Math.toRadians(90), 755, 50);
        // g2d.translate(75, 35);
        // g2d.fill(triangle);

        // g2d.rotate(Math.toRadians(90), 755, 50);
        // g2d.translate(75, 35);
        // g2d.fill(triangle);
        
        // // inside rays
        // g2d.rotate(Math.toRadians(45), 755, 50);
        // g2d.translate(30, 33);
        // g2d.fill(triangle);

        // g2d.rotate(Math.toRadians(90), 755, 50);
        // g2d.translate(75, 35);
        // g2d.fill(triangle);

        // g2d.rotate(Math.toRadians(90), 755, 50);
        // g2d.translate(75, 35);
        // g2d.fill(triangle);

        // g2d.rotate(Math.toRadians(90), 755, 50);
        // g2d.translate(75, 35);
        // g2d.fill(triangle);
    }
}