import java.awt.*;
import java.awt.geom.*;

public class Chest implements DrawingObject {
    private int state = 0;
    private int counter = 0;

    public Chest() {
    }

    public void changeState() {
        this.counter+=1;
        if (this.counter%2 == 0) this.state = 1;
        else this.state = 0;
    }

    public void draw(Graphics2D g2d) {
        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        Path2D chestBottom = new Path2D.Double();
        g2d.setColor(new Color(255, 210, 18));
        chestBottom.moveTo(33, 600);
        chestBottom.lineTo(30, 555);
        chestBottom.lineTo(123, 555);
        chestBottom.lineTo(114+5, 600);
        g2d.fill(chestBottom);

        Path2D chestBottomInner = new Path2D.Double();
        g2d.setColor(new Color(255, 180, 18));
        chestBottomInner.moveTo(38.9, 595.5);
        chestBottomInner.lineTo(36, 554.7);
        chestBottomInner.lineTo(117, 554.7);
        chestBottomInner.lineTo(108.2+5, 595.7);
        g2d.fill(chestBottomInner);

        if (this.state == 0) {
            Path2D chestTop = new Path2D.Double();
            g2d.setColor(new Color(255, 210, 18));
            chestTop.moveTo(28, 554+3);
            chestTop.lineTo(33.6, 533.7);
            chestTop.curveTo(38.3, 517.55, 39.9, 516.8, 53.2, 517);
            chestTop.lineTo(95.6, 516.7);
            chestTop.curveTo(95.6+13.3+3, 517.55, 95.6+13.3+1.6+3, 516.8, 95.6+13.3+1.6+4.7+3, 533.7);
            chestTop.lineTo(95.6+13.3+1.6+4.7+5.6+3, 554+3);
            g2d.fill(chestTop);

            Path2D innerChestTop = new Path2D.Double();
            g2d.setColor(new Color(255, 180, 18));
            innerChestTop.moveTo(28+12, 554+3-5);
            innerChestTop.lineTo(33.6+10, 533.7+5);
            innerChestTop.curveTo(38.3+10, 517.55+5, 39.9+10, 516.8+5, 53.2+10, 517+5);
            innerChestTop.lineTo(95.6-10, 516.7+5);
            innerChestTop.curveTo(95.6+13.3+3-10, 517.55+5, 95.6+13.3+1.6+3-10, 516.8+5, 95.6+13.3+1.6+4.7+3-10, 533.7+5);
            innerChestTop.lineTo(95.6+13.3+1.6+4.7+5.6+3-12, 554+3-5);
            g2d.fill(innerChestTop);
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

        Path2D chestLock = new Path2D.Double();
        g2d.setColor(new Color(255, 210, 18));
        chestLock.moveTo(69.2, 559.1);
        chestLock.curveTo(69.36, 553.7, 67.4, 546.2, 76.5, 546.3);
        chestLock.curveTo(82.8, 546, 84.76, 550.1, 84.4, 559.1);
        // chestLock.lineTo(69.2, 559.1);
        g2d.fill(chestLock);

        Path2D keyHole = new Path2D.Double();
        g2d.setColor(Color.BLACK);
        keyHole.moveTo(74.67, 554.36);
        keyHole.curveTo(68.95, 545.67, 83.9, 545.6, 78.4, 554.36);
        keyHole.lineTo(78.4, 557.1);
        keyHole.lineTo(74.67, 557.1);
        keyHole.lineTo(74.67, 554.36);
        g2d.fill(keyHole);
    }

}