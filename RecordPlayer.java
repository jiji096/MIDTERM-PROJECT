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

    private double rotation, x0, y0;


    public RecordPlayer (double x, double y) {
        x0 = x;
        y0 = y;
        rotation = 0;
    }

    public void rotate() {
        rotation += 10;
    }

    public void draw(Graphics2D g2d){
        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        AffineTransform reset = g2d.getTransform();
        g2d.rotate(Math.toRadians(rotation),x0,y0);

        Circle outer = new Circle(645,460,125, Color.BLACK);
        outer.draw(g2d);

        int x = 650;
        int y = 465;
        int size = 115;
        Ellipse2D.Double rings = new Ellipse2D.Double(x, y, size, size);
        g2d.setColor(new Color(55, 54, 54));
        g2d.draw(rings);

        for (int i = 1; i < 7; i ++){
            g2d.setColor(new Color(55, 54, 54));
            Ellipse2D.Double rings2 = new Ellipse2D.Double(x + (i * 5), y + (i * 5), size - (i * 10), size - (i * 10));
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