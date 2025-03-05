/** 
    This is the Line class, which implements the DrawingObject interface and 
    uses the java.awt.geom package to draw a line. It accepts x and y
    coordinates for each point to determine the line's position.

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
    Initializes fields for multiple x and y coordinates, and color.
**/
public class Line implements DrawingObject {
    private double x1, y1, x2, y2;
    private Color color;

    /**
        Constructs line with the given x and y coordinates, and color.
        @param x1      The x-coordinate of the starting point of the line.
        @param y1      The y-coordinate of the starting point of the line.
        @param x2      The x-coordinate of the end point of the line.
        @param y2      The y-coordinate of the end point of the line.
        @param color   The color of the line.
    **/
    public Line(double x1, double y1, double x2, double y2, Color color) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.color = color;
    }

    /**
        Draws the Line using the Graphics2D object.
	**/
    public void draw(Graphics2D g2d){
        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

       Line2D.Double line = new Line2D.Double(x1, y1, x2, y2);
       g2d.setColor(color);
       g2d.draw(line);
    }
}