import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

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
        record.draw(g2d);

    }
}