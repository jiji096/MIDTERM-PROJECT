import java.awt.*;
import java.awt.geom.*;

public class Fish1 implements DrawingObject {
    public Fish1() {

    }

    public void draw(Graphics2D g2d) {
        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);


        // convert to affine transform later
        Path2D.Double body = new Path2D.Double();
        body.moveTo(208.4, 600-80);
        body.curveTo(211.7, 600-85.8, 230.2, 600-89, 235, 600-76.6);
        body.curveTo(227.1, 600-66.9, 213.2, 600-69.1, 208.4, 600-75.6);
        body.lineTo(208.4, 600-80);
        g2d.setColor(Color.BLACK);
        g2d.draw(body);
        AffineTransform reset = g2d.getTransform();
        g2d.translate(229.8-208.4, -((600-80)-(600-96.8)));
        g2d.draw(body);
        g2d.setTransform(reset);

        Path2D.Double tail = new Path2D.Double();
        tail.moveTo(208.4, 600-75.6);
        tail.lineTo(200.4, 600-70.7);
        tail.lineTo(202.35, 600-85.1);
        tail.lineTo(208.4, 600-80);
        g2d.setColor(Color.BLACK);
        g2d.draw(tail);
        g2d.translate(229.8-208.4, -((600-80)-(600-96.8)));
        g2d.draw(tail);
        g2d.setTransform(reset);

        Path2D.Double dorsal = new Path2D.Double();
        //temporary color lang
        g2d.setColor(Color.BLACK);
        dorsal.moveTo(227.93, 600-84.2);
        dorsal.curveTo(224.84, 600-87.7, 212, 600-90.1, 212.7, 600-83.57);
        g2d.draw(dorsal);
        //g2d.fill(dorsal);
        g2d.translate(229.8-208.4, -((600-80)-(600-96.8)));
        g2d.draw(dorsal);
        //g2d.fill(dorsal);
        g2d.setTransform(reset);

        Ellipse2D.Double eye = new Ellipse2D.Double(228.6, 600-78.5, 2, 2);
        g2d.setColor(Color.BLACK);
        g2d.fill(eye);
        g2d.translate(229.8-208.4, -((600-80)-(600-96.8)));
        g2d.fill(eye);
        g2d.setTransform(reset);

    }

}