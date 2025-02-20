import java.awt.*;
import javax.swing.*;

public class RecordPlayer extends JComponent implements DrawingObject{    

    public RecordPlayer () {

    }

    public void draw(Graphics2D g2d){
        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        Circle record = new Circle(645,430,125, Color.BLACK);
        record.draw(g2d);
    }
}