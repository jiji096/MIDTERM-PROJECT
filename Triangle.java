/** 
    This is the Triangle class, which implements the DrawingObject interface and 
    uses the java.awt.geom package to draw a triangle. It accepts x and y
    coordinates for each point and a color parameter to determine the triangle's
    position and appearance.
	
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

public class Triangle implements DrawingObject {
    private double x1, y1, x2, y2, x3, y3;
    private Color color;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3, Color color){
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        this.color = color;
    }

    public void draw(Graphics2D g2d){
        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);


        Path2D.Double triangle = new Path2D.Double();
        triangle.moveTo(x1,y1);
        triangle.lineTo(x2,y2);
        triangle.lineTo(x3,y3);
        triangle.closePath();
        g2d.setColor(color);
        g2d.fill(triangle);
    }
}