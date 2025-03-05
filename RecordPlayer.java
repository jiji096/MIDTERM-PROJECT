/** 
    This is the RecordPlayer class, which implements the DrawingObject interface.
    It uses the Circle and Triangle shape classes, as well as the java.awt.geom
    package to draw the record player. 

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

public class RecordPlayer implements DrawingObject{    

    private double rotation, x, y;

    /**
        Creates a record player with a set location.
        @param x      The x-coordinate of the center.
        @param y      The y-coordinate of the center.

    **/
    public RecordPlayer (double x, double y) {
        this.x = x;
        this.y = y;
        rotation = 0;
    }

    /**
        Increases the rotation value to rotate the shape.
    **/
    public void rotate() {
        rotation += 10;
    }

    /**
        Draws the Record Player using the Graphics2D object.
    **/
    public void draw(Graphics2D g2d){

        AffineTransform reset = g2d.getTransform();
        g2d.rotate(Math.toRadians(rotation),x,y);

        Circle outer = new Circle(645,460,125, Color.BLACK);
        outer.draw(g2d);

        /**
            Sets x and y values for the rings around the record
        **/
        int x1 = 650;
        int y1 = 465;
        int size = 115;
        Ellipse2D.Double rings = new Ellipse2D.Double(x1, y1, size, size);
        g2d.setColor(new Color(55, 54, 54));
        g2d.draw(rings);
        
        /**
            Prints more rings around the initial ring.
        **/
        for (int i = 1; i < 7; i ++){
            g2d.setColor(new Color(55, 54, 54));
            Ellipse2D.Double rings2 = new Ellipse2D.Double(x1 + (i * 5), y1 + (i * 5), size - (i * 10), size - (i * 10));
            g2d.draw(rings2);

        }

        Circle bg = new Circle(684,499,47, Color.WHITE);
        Circle bg2 = new Circle(686, 501,43,new Color(205, 92, 92));
        Triangle play = new Triangle(701, 511, 720,523,701, 535, Color.WHITE);
        bg.draw(g2d);
        bg2.draw(g2d);
        play.draw(g2d);

        g2d.setTransform(reset);

    }
    
}