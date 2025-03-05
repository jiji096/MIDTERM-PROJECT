/** 
    This is the Square class, which implements the DrawingObject interface and 
    uses the java.awt.geom package to draw a square. It accepts x and y
    coordinates for each point, a size parameter, and a color parameter to
    determine the square's position and appearance.
	
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
    Initializes fields for x and y coordinates, size, and color.
**/
public class Square implements DrawingObject {
    private double x;
    private double y;
    private double size;

    /**
        Constructs square with the given position, size, and color.
        @param x      The x-coordinate of the square.
        @param y      The y-coordinate of the square.
        @param size   The size or diameter of the square.
        @param color  The color of the square.
    **/
    public Square(double x, double y, double size){
        this.x = x;
        this.y = y;
        this.size = size;
    }

    /**
        Draws the Square using the Graphics2D object.
	**/
    public void draw(Graphics2D g2d){
        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        Rectangle2D.Double square = new Rectangle2D.Double(x, y, size, size);
        g2d.fill(square);
    }

}