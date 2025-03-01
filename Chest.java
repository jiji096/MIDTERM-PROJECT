import java.awt.*;
import java.awt.geom.*;

public class Chest implements DrawingObject {
    private int state = 0;
    private int counter = 0;
    public Chest() {

    }

    public void changeState() {
        this.counter+=1;
        if (this.counter%2 == 0) {
            this.state = 1;
        }
        else {
            this.state = 0;
        }
    }

    public void draw(Graphics2D g2d) {
        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);
        System.out.println("state: " + this.state);
        System.out.println("counter: " + this.counter);

      //  Line line1 = new Line(32.5, -597.6, 29, -556);
        Path2D chestBottom = new Path2D.Double();
        g2d.setColor(new Color(255, 210, 18));
        chestBottom.moveTo(34, 600);
        chestBottom.lineTo(29,516+30);
        chestBottom.lineTo(124, 516+30);
        chestBottom.lineTo(119, 600);
        // chestBottom.lineTo(129, 516);
        // chestBottom.lineTo(30, 489);
        g2d.fill(chestBottom);

        if (this.state == 0) {
            Path2D chestTop = new Path2D.Double();
            g2d.setColor(Color.YELLOW);
            chestTop.moveTo(29, 516+30);
            chestTop.lineTo(37,489+30);
            chestTop.curveTo(37.7, 485+30, 40, 480.8+30, 46.8, 480.6+30);
            chestTop.lineTo(100.9, 480.2+30);
            chestTop.curveTo(108.8, 480.4+30, 113.2, 477.7+30, 115.8, 489+30);
            chestTop.lineTo(124, 516+30);
            g2d.fill(chestTop);
        }
        else {
            Path2D chestTop = new Path2D.Double();
            g2d.setColor(Color.RED);
            chestTop.moveTo(29, 516+30);
            chestTop.lineTo(37,489+30);
            chestTop.curveTo(37.7, 485+30, 40, 480.8+30, 46.8, 480.6+30);
            chestTop.lineTo(100.9, 480.2+30);
            chestTop.curveTo(108.8, 480.4+30, 113.2, 477.7+30, 115.8, 489+30);
            chestTop.lineTo(124, 516+30);
            g2d.fill(chestTop);
        }
    }

}