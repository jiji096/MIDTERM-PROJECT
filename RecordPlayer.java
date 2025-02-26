import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class RecordPlayer extends JComponent implements DrawingObject{    

    private double rotation, truth, x, y, size;

    public RecordPlayer () {
        rotation = 0;
        truth = 0;
        x = 650;
        y = 465;
        size = 115;
    }

    public void rotate() {
        rotation+=10;
    }

    public void draw(Graphics2D g2d){
        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        AffineTransform reset = g2d.getTransform();

        Circle outer = new Circle(645,460,125, Color.BLACK);
        outer.draw(g2d);

        Ellipse2D.Double rings = new Ellipse2D.Double(x, y, size, size);
        g2d.setColor(new Color(55, 54, 54));
        g2d.draw(rings);

        for (int i = 1; i < 7; i ++){
            g2d.setColor(new Color(55, 54, 54));
            Ellipse2D.Double rings2 = new Ellipse2D.Double(x + (i * 5), y + (i * 5), size - (i * 10), size - (i * 10));
            g2d.draw(rings2);

        }

        Circle bg = new Circle(684,499,47, Color.WHITE);
        Circle bg2 = new Circle(686, 501,43,new Color(205, 92, 92));
        Triangle play = new Triangle(701, 511, 720,523,701, 535, Color.WHITE);
        bg.draw(g2d);
        bg2.draw(g2d);
        play.draw(g2d);




    }
}