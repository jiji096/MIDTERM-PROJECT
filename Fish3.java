/** 
    This is the Fish3 class, which implements the DrawingObject interface and 
    uses the java.awt.geom package to draw the fish. It includes a move method
    to update the fish's position.

    @author Janelle Angela C. Lopez (242682)
    @author Aldrin Joseph T. Nellas (243215)
	@version February 15, 2025
	
	I have not discussed the Java language code in my program 
	with anyone other than my instructor or the teaching assistants 
	assigned to this course.

	I have not used Java language code obtained from another student, 
	or any other unauthorized source, either modified or unmodified.

	If any Java language code or documentation used in my program 
	was obtained from another source, such as a textbook or website, 
	that has been clearly noted with a proper citation in the comments 
	of my program.
**/

import java.awt.*;
import java.awt.geom.*;

/**
    Initializes value for the x-coordinate.
**/
public class Fish3 implements DrawingObject {
    private double x = 0;

    /**
        Constructor for the Fish2 class.
	**/
    public Fish3() {
    }

    /**
        Decreases the x-coordinate to make the fish move left.
        If the x-coordinate becomes less than the size of the frame,
        x decreases to make the fish appear again on the other side of the frame.
	**/
    public void move() {
        x -= 10;
        if (x < -800) {
            x = +200;
        }
    }

    /**
        Draws the Fish using the Graphics2D object.
	**/
    public void draw(Graphics2D g2d) {
        
        Path2D.Double body = new Path2D.Double();
        body.moveTo(x+588.5,561.1);
        body.curveTo(x+588.6,555.7,x+599.86,546.5,x+609.9,558.5);
        body.curveTo(x+607.3,568.7,x+593.3,570.55,x+588.5,561.1);

        Path2D.Double dorsal = new Path2D.Double();
        dorsal.moveTo(x+594.43,553.9);
        dorsal.curveTo(x+595.97,548.56,x+604.1,548,x+609.5,550.6);
        dorsal.curveTo(x+611.5,551.65,x+606,554.64,x+605.48,554.36);
        dorsal.curveTo(x+604.1,553.3,x+598.6,551.53,x+594.43,553.9);

        Path2D.Double tail = new Path2D.Double();
        tail.moveTo(x+608.83,557.6);
        tail.curveTo(x+609.05,552.94,x+617.1,549.35,x+622.26,550.13);
        tail.curveTo(x+622.6,553.25,x+617,558.04,x+614.94,558.66);
        tail.curveTo(x+622.25,562.86,x+620.04,568.84,x+616.5,571.35);
        tail.curveTo(x+616.1,565.25,x+610.7,567.9,x+608.83,557.6);

        Path2D.Double underFin = new Path2D.Double();
        underFin.moveTo(x+603.7,566.43);
        underFin.curveTo(x+605.67,569.32,x+609.68,566.05,x+608.75,563.9);
        underFin.curveTo(x+608.33,561.53,x+608.93,560.93,x+608.78,560.8);
        underFin.curveTo(x+607.58,561.38,x+606.6,565.75,x+602.86,566.78);

        Path2D.Double handFin = new Path2D.Double();
        handFin.moveTo(x+596.23,565.6);
        handFin.curveTo(x+598.36,565.3,x+602.12,566.27,x+603.26,569.06);
        handFin.curveTo(x+602.95,570,x+599.56,571.52,x+597.92,568.84);
        handFin.curveTo(x+597.9,570.73,x+592.6,571.14,x+594.18,566.1);
        handFin.curveTo(x+595.54,566.98,x+597.48,566.37,x+597.92,569.03);

        Path2D.Double sideFin = new Path2D.Double();
        sideFin.moveTo(x+598.66,561.77);
        sideFin.curveTo(x+599.76,562.66,x+604.97,560.91,x+602.32,565);
        sideFin.curveTo(x+601.66,565.43,x+599.21,565.67,x+597.6,563.13);
        sideFin.curveTo(x+597.37,563.48,x+597.11,563.85,x+596.82,564.1);
        sideFin.curveTo(x+597.47,561.46,x+600.28,560.05,x+596.28,555.74);
        sideFin.curveTo(x+597.52,556.7,x+600,558.6,x+598.66,561.77);

        Path2D.Double coloring = new Path2D.Double();
        coloring.moveTo(x+603.97,557.18);
        coloring.curveTo(x+604.7,556.92,x+605.8,559.8,x+604.13,561.69);

        Path2D.Double coloring2 = new Path2D.Double();
        coloring2.moveTo(x+601.87,558.01);
        coloring2.curveTo(x+602.2,558.32,x+602.17,559.89,x+601.94,560.46);

        Ellipse2D.Double eye = new Ellipse2D.Double(x+592.48,557.66,2.5,2.5);

        AffineTransform reset = g2d.getTransform();

        g2d.setColor(new Color(121, 189, 143));
        g2d.fill(underFin);

        g2d.setColor(new Color(121, 189, 143));
        g2d.fill(tail);

        g2d.setColor(new Color(2, 163, 136));
        g2d.fill(body);

        g2d.setColor(new Color(121, 189, 143));
        g2d.fill(handFin);

        g2d.setColor(new Color(121, 189, 143));
        g2d.fill(sideFin);

        g2d.setColor(new Color(121, 189, 143));
        g2d.fill(dorsal);

        g2d.setColor(new Color(190, 235, 159));
        g2d.draw(coloring);

        g2d.setColor(new Color(190, 235, 159));
        g2d.draw(coloring2);

        g2d.setColor(new Color(6, 91, 77));
        g2d.fill(eye);

        g2d.setTransform(reset);

    }
}