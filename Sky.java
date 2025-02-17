import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;


public class Sky extends JComponent implements DrawingObject {

    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        draw(g2d);
    }

    public void draw(Graphics2D g2d){

        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        Rectangle2D.Double bg = new Rectangle2D.Double(0,0,800,600);
        g2d.setColor(new Color(100,149,237));
        g2d.fill(bg);

    }
}