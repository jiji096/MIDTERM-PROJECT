/** 
    This is the Sun class, which implements the DrawingObject interface. 
    It uses of the Circle and Triangle shape classes to draw the sun
    and its rays.
	
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

public class Sun implements DrawingObject{    

    private double rotation;

    public Sun () {
    }

    public void rotate(){
        rotation += 5/3;
    }

    
    public void draw(Graphics2D g2d){
        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        AffineTransform reset = g2d.getTransform();
        g2d.rotate(Math.toRadians(rotation),400, 600);

        Circle araw = new Circle(650,20,100, new Color(255, 210, 18));
        Circle buwan = new Circle(133,1000,100, new Color(30, 210, 255));
        buwan.draw(g2d);
        araw.draw(g2d);
        Triangle rays = new Triangle(755, 70, 785, 70, 755, 90, new Color(255, 210, 18));
        rays.draw(g2d);


        // outside rays
        for (int i = 0; i < 3; i++) {
            g2d.rotate(Math.toRadians(90), 755, 50);
            g2d.translate(75, 35);
            rays.draw(g2d);
        }

        g2d.rotate(Math.toRadians(45), 755, 50);
        g2d.translate(30, 33);
        rays.draw(g2d);


        for (int i = 0; i < 3; i++) {
            g2d.rotate(Math.toRadians(90), 755, 50);
            g2d.translate(75, 35);
            rays.draw(g2d);
        }

        g2d.setTransform(reset);
    }

}  