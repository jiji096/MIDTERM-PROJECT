import java.awt.*;
import java.awt.geom.*;

public class Fish1 implements DrawingObject {
    private double x = 0;
    public Fish1() {
    }

    public void moveLeft() {
        x+=10;
        if (x > 800) {
            x = -208.4;
        }
        //System.out.println("x: " + x);
    }

    public double getX() {
        return x;
    }

    public void draw(Graphics2D g2d) {
        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);


        // convert to affine transform later
        Path2D.Double body = new Path2D.Double();
        body.moveTo(x+208.4, 600-80);
        body.curveTo(x+211.7, 600-85.8, x+230.2, 600-89, x+235, 600-76.6);
        body.curveTo(x+227.1, 600-66.9, x+213.2, 600-69.1, x+208.4, 600-75.6);
        body.lineTo(x+208.4, 600-80);
        g2d.setColor(new Color(155, 175, 217));
        g2d.fill(body);
        AffineTransform reset = g2d.getTransform();
        g2d.translate(229.8-208.4, -((600-80)-(600-96.8)));
        g2d.fill(body);
        g2d.setTransform(reset);

        Path2D.Double tail = new Path2D.Double();
        tail.moveTo(x+208.4, 600-75.6);
        tail.lineTo(x+200.4, 600-70.7);
        tail.lineTo(x+202.35, 600-85.1);
        tail.lineTo(x+208.4, 600-80);
        g2d.setColor(new Color(16, 55, 131));
        g2d.fill(tail);
        g2d.translate(229.8-208.4, -((600-80)-(600-96.8)));
        g2d.fill(tail);
        g2d.setTransform(reset);

        Path2D.Double dorsal = new Path2D.Double();
        //temporary color lang
        g2d.setColor(new Color(16, 55, 131));
        dorsal.moveTo(x+227.93, 600-84.2);
        dorsal.curveTo(x+224.84, 600-87.7, x+212, 600-90.1, x+212.7, 600-83.57);
        g2d.fill(dorsal);
        g2d.translate(229.8-208.4, -((600-80)-(600-96.8)));
        g2d.fill(dorsal);
        g2d.setTransform(reset);


        Path2D.Double ventral = new Path2D.Double();
        g2d.setColor(new Color(16, 55, 131));
        ventral.moveTo(x+223.7, 529);
        ventral.curveTo(x+220.8,535.7, x+213.1,534.6,x+210.8,528);
        g2d.fill(ventral);
        g2d.translate(229.8-208.4, -((600-80)-(600-96.8)));
        g2d.fill(ventral);
        g2d.setTransform(reset);

        Ellipse2D.Double eye = new Ellipse2D.Double(x+228.6, 600-78.5, 2, 2);
        g2d.setColor(Color.BLACK);
        g2d.fill(eye);
        g2d.translate(229.8-208.4, -((600-80)-(600-96.8)));
        g2d.fill(eye);
        g2d.setTransform(reset);

        g2d.translate(x, 0);
        g2d.setTransform(reset);
    }

}