/** 
    This is the Circle class, which implements the DrawingObject interface and 
    uses the java.awt.geom package to draw a circle. It accepts x and y
    coordinates, a size parameter, and a color parameter to
    determine the circle's position and appearance.

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
public class Circle implements DrawingObject{
    private double x;
    private double y;
    private double size;
    private Color color;

    /**
        Constructs circle with the given position, size, and color.
        @param x      The x-coordinate of the circle.
        @param y      The y-coordinate of the circle.
        @param size   The size or diameter of the circle.
        @param color  The color of the circle.
    **/
    public Circle(double x, double y, double size, Color color){
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
    }

    /**
        Draws the Circle using the Graphics2D object.
	**/
    @Override
    public void draw(Graphics2D g2d){

        Ellipse2D.Double circle = new Ellipse2D.Double(x,y,size,size);
        g2d.setColor(color);
        g2d.fill(circle);
    }
}