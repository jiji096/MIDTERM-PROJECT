import java.awt.*;
import java.awt.geom.*;

public class Chest implements DrawingObject {
    public Chest() {

    }

    public void draw(Graphics2D g2d) {
        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

      //  Line line1 = new Line(32.5, -597.6, 29, -556);
        Path2D chestBottom = new Path2D.Double();
        g2d.setColor(new Color(255, 210, 18));
        chestBottom.moveTo(34, 586);
        chestBottom.lineTo(29,516);
        chestBottom.lineTo(124, 516);
        chestBottom.lineTo(119, 586);
        // chestBottom.lineTo(129, 516);
        // chestBottom.lineTo(30, 489);
        g2d.fill(chestBottom);

        Path2D chestTop = new Path2D.Double();
        g2d.setColor(Color.YELLOW);
        chestTop.moveTo(29, 516);
        chestTop.lineTo(37,489);
        chestTop.curveTo(37.7, 485, 40, 480.8, 46.8, 480.6);
        chestTop.lineTo(100.9, 480.2);
        chestTop.curveTo(108.8, 480.4, 113.2, 477.7, 115.8, 489);
        chestTop.lineTo(124, 516);
        g2d.fill(chestTop);
    }
}