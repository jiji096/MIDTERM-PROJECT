import java.awt.*;
import java.awt.geom.*;
import java.util.*;

public class Chest implements DrawingObject {
    private int state = 0;
    private int counter = 0;
    private ArrayList<Circle> gold1 = new ArrayList<Circle>();
    private ArrayList<Circle> gold2 = new ArrayList<Circle>();


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

        if (this.state == 0) {
            Path2D chestTop = new Path2D.Double();
            g2d.setColor(new Color(	243, 156, 5));
            chestTop.moveTo(28, 554+3);
            chestTop.lineTo(33.6, 533.7);
            chestTop.curveTo(38.3, 517.55, 39.9, 516.8, 53.2, 517);
            chestTop.lineTo(95.6, 516.7);
            chestTop.curveTo(95.6+13.3+3, 517.55, 95.6+13.3+1.6+3, 516.8, 95.6+13.3+1.6+4.7+3, 533.7);
            chestTop.lineTo(95.6+13.3+1.6+4.7+5.6+3, 554+3);
            g2d.fill(chestTop);

            Path2D innerChestTop = new Path2D.Double();
            g2d.setColor(new Color(152, 86, 0));
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
            g2d.setColor(new Color(	243, 156, 5));
            chestTop.moveTo(33.3+20, 558);
            chestTop.lineTo(18+20,522);
            chestTop.lineTo(21+20,512);
            chestTop.lineTo(28+20,512);
            chestTop.lineTo(31.4+20,516);
            chestTop.lineTo(78.6,516);
            chestTop.lineTo(112+10-20,516);
            chestTop.lineTo(114+10-20,512);
            chestTop.lineTo(121+10-20,512);
            chestTop.lineTo(125+10-20,522);
            chestTop.lineTo(112+10-20,558);
            g2d.fill(chestTop);

            Quadrilateral inner = new Quadrilateral(35.7+20, 554.6, 23.9+20, 523.8, 119.7+10-20, 524.3, 107.9+10-20, 554.6, new Color(152, 71, 0));
            inner.draw(g2d);

            gold1.add(new Circle(63,526,30,new Color(243, 156, 5)));
            gold1.add(new Circle(53,532,30,new Color(243, 156, 5)));
            gold1.add(new Circle(70,532,30,new Color(243, 156, 5)));
            gold1.add(new Circle(45,539,20,new Color(243, 156, 5)));
            gold1.add(new Circle(88,539,20,new Color(243, 156, 5)));

            gold2.add(new Circle(63,533,30,new Color(252, 180, 56)));
            gold2.add(new Circle(53,539,30,new Color(252, 180, 56)));
            gold2.add(new Circle(70,539,30,new Color(252, 180, 56)));
            gold2.add(new Circle(45,546,20,new Color(252, 180, 56)));
            gold2.add(new Circle(88,546,20,new Color(252, 180, 56)));

            for (Circle gold : gold1){
                gold.draw(g2d);
            }

            for (Circle gold : gold2){
                gold.draw(g2d);
            }

            AffineTransform reset = g2d.getTransform();
            Square shine = new Square(92.1,527.2,6);
            g2d.setColor(Color.WHITE);
            g2d.rotate(Math.toRadians(45),92.1,527.2);
            shine.draw(g2d);
            g2d.translate(-20,40);
            shine.draw(g2d);
            g2d.setTransform(reset);

        }

        Path2D chestBottom = new Path2D.Double();
        g2d.setColor(new Color(	243, 156, 5));
        chestBottom.moveTo(33, 600);
        chestBottom.lineTo(30, 555);
        chestBottom.lineTo(123, 555);
        chestBottom.lineTo(114+5, 600);
        g2d.fill(chestBottom);

        Path2D chestBottomInner = new Path2D.Double();
        g2d.setColor(new Color(152, 86, 0)); //255, 180, 18
        chestBottomInner.moveTo(38.9, 595.5);
        chestBottomInner.lineTo(36, 554.7);
        chestBottomInner.lineTo(117, 554.7);
        chestBottomInner.lineTo(108.2+5, 595.7);
        g2d.fill(chestBottomInner);

        Line lines1 = new Line(52,565.3,103,565.3, new Color(91, 52, 0));
        Line lines2 = new Line(47,573,99,573, new Color(91, 52, 0));
        Line lines3 = new Line(49,581,105,581, new Color(91, 52, 0));
        Line lines4 = new Line(50,589,100,589, new Color(91, 52, 0));

        lines1.draw(g2d);
        lines2.draw(g2d);
        lines3.draw(g2d);
        lines4.draw(g2d);

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