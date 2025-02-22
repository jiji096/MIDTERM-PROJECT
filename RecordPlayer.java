import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class RecordPlayer extends JComponent implements DrawingObject{    

    private double rotation, truth;

    public RecordPlayer () {
        rotation = 0;
        truth = 0;
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

        Circle record = new Circle(645,430,125, Color.GRAY);
        Line line = new Line(645,430,645,450);
        record.draw(g2d);
        line.draw(g2d);

        g2d.rotate(Math.toRadians(rotation), 645, 430);
        g2d.setTransform(reset);
    }
}