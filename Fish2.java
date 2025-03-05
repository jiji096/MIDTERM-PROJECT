/** 
    This is the Fish2 class, which implements the DrawingObject interface and 
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
public class Fish2 implements DrawingObject {
    private double x = 0;

    /**
        Constructor for the Fish2 class.
	**/
    public Fish2() {
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

        Path2D.Double outline = new Path2D.Double();
        outline.moveTo(x+519.6,535.1);
        outline.curveTo(x+520.7,528.7,x+533.7,513.7,x+561.9,531.4);
        outline.curveTo(x+567.2,534.8,x+585.3,528,x+582.6,540.8);
        outline.curveTo(x+574.2,553.27,x+568.5,547.2,x+566.5,541.65);
        outline.curveTo(x+562.5,538.9,x+524.6,555.9,x+519.6,535.1);

        Path2D.Double dorsal = new Path2D.Double();
        dorsal.moveTo(x+534.8,524.3);
        dorsal.curveTo(x+532.7,511.15,x+542.3,517.46,x+546,524.25);
        dorsal.curveTo(x+560.8,517.7,x+566.1,522.8,x+563.7,532.6);
        dorsal.curveTo(x+549.8,523.8,x+549,524,x+534.8,524.3);

        Path2D.Double under = new Path2D.Double();
        under.moveTo(x+535.1,545.8);
        under.curveTo(x+543.5,562.4,x+549.9,548.86,x+542.3,544.9);
        under.moveTo(x+548.9,544);
        under.curveTo(x+551.05,553.8,x+568.3,547.2,x+561.8,541.8);

        Path2D.Double pattern = new Path2D.Double();
        pattern.moveTo(x+525.7,527.14);
        pattern.curveTo(x+532,530.34,x+532.8,536.24,x+529.8,538.1);
        pattern.curveTo(x+528.94,539.92,x+525.99,540.96,x+525.8,543.28);
        pattern.curveTo(x+527.6,543.87,x+528.12,544.15,x+529.8,544.28);
        pattern.curveTo(x+539.61,540,x+535.94,527.8,x+534.3,528.4);
        pattern.curveTo(x+533.26,527.38,x+530.44,525.15,x+529.5,525.2);
        pattern.curveTo(x+528.22,525.7,x+526.63,526.6,x+525.7,527.14);

        Path2D.Double pattern2 = new Path2D.Double();
        pattern2.moveTo(x+546,524.5);
        pattern2.curveTo(x+547.9,529.1,x+534.3,526.8,x+542,535.3);
        pattern2.curveTo(x+546.1,538.9,x+546.6,544,x+547.05,544);
        pattern2.curveTo(x+550.5,544,x+551.8,543,x+553.3,543);
        pattern2.curveTo(x+553.9,531.04,x+549.54,528.73,x+550.5,526.2);
        pattern2.curveTo(x+549.18,525.47,x+547.3,524.8,x+546,524.5);

        Path2D.Double pattern3 = new Path2D.Double();
        pattern3.moveTo(x+562.37,531.86);
        pattern3.curveTo(x+559.3,536.5,x+561.45,537,x+562.84,540.84);
        pattern3.curveTo(x+564.56,542.39,x+565.63,541.09,x+566.2,541.35);
        pattern3.curveTo(x+565.87,538.74,x+567.8,538.74,x+568.05,536.9);
        pattern3.curveTo(x+568.57,535.28,x+566.75,534.16,x+568.58,532.44);
        pattern3.curveTo(x+566.36,531.83,x+563.37,531.84,x+562.37,531.86);

        Path2D.Double fin = new Path2D.Double();
        fin.moveTo(x+537.96,537.25);
        fin.curveTo(x+542.96,533.16,x+546.7,535.4,x+548.9,530.83);
        fin.curveTo(x+546.77,536.27,x+552.8,538.3,x+547.3,541.67);
        fin.curveTo(x+545.2,542.7,x+542.3,539.8,x+539.1,540.6);
        fin.curveTo(x+539.1,539.42,x+538.63,537.94,x+537.96,537.25);

        Ellipse2D.Double eye = new Ellipse2D.Double(x+524,529.8,4,4);

        AffineTransform reset = g2d.getTransform();

        g2d.setColor(new Color(4, 139, 168));
        g2d.fill(outline);

        g2d.setColor(new Color(	46, 64, 87));
        g2d.fill(dorsal);

        g2d.setColor(new Color(	46, 64, 87));
        g2d.fill(under);

        g2d.setColor(new Color(255, 235, 101));
        g2d.fill(pattern);

        g2d.setColor(new Color(255, 235, 101));
        g2d.fill(pattern2);

        g2d.setColor(new Color(255, 235, 101));
        g2d.fill(pattern3);

        g2d.setColor(new Color(	46, 64, 87));
        g2d.fill(fin);

        g2d.setColor(new Color(41, 57, 56));
        g2d.fill(eye);

        g2d.setTransform(reset);
    }
}