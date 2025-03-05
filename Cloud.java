/** 
    This is the Cloud class, which implements the DrawingObject interface and 
    uses the Circle shape class to draw each part of the cloud. It accepts x 
    and y coordinates for each circle, a size parameter, and a color parameter
    to determine the each circle's position and appearance.

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

/**
    Initializes fields for x and y coordinates, size, and color.
**/
public class Cloud implements DrawingObject {
    private double x;
    private double y;
    private double x2 = 0;
    private double size;
    private Color color;

    /**
        Constructs the cloud with the given position, size, and color.
        @param x      The x-coordinate of the first circle.
        @param y      The y-coordinate of the first circle.
        @param size   The size or diameter of the first circle.
        @param color  The color of the circles.
    **/
    public Cloud (double x, double y, double size, Color color){
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
    }


    /**
        Draws the Cloud with Circle objects using the Graphics2D object.
	**/
    public void draw(Graphics2D g2d){

        Circle cloud1 = new Circle(x,y,size,color);
        Circle cloud2 = new Circle(x+size*0.43,y-size*0.21,size*1.29,color);
        Circle cloud3 = new Circle(x+size*0.99,y-size*0.07,size*1.22,color);
        Circle cloud4 = new Circle(x+size*1.12,y-size*0.36,size,color);
        Circle cloud5 = new Circle(x+size*1.57,y-size*0.07,size*1.1,color);

        cloud1.draw(g2d);
        cloud2.draw(g2d);
        cloud3.draw(g2d);
        cloud4.draw(g2d);
        cloud5.draw(g2d);
    }
}