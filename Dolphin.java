/** 
    This is the Dolphin class, which implements the DrawingObject interface 
    and uses the java.awt.geom package to draw each curve of the dolphin. It
    accepts x and y coordinates as parameters to set the dolphin's anchor point
    for rotation and includes a rotate method that controls its rotation speed.
	
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

public class Dolphin implements DrawingObject {
    private double x, y, rotation;

    public Dolphin (double x, double y) {
        this.x = x;
        this.y = y;
        rotation = 0;
    }

    public void rotate(){
        rotation +=9;
    }



    public void draw(Graphics2D g2d) {
        AffineTransform reset = g2d.getTransform();
       
        Path2D.Double upper = new Path2D.Double();
        g2d.setColor(Color.BLACK);

        upper.moveTo(376.7,322);
        upper.curveTo(364,276.6, 287.7,284.8,275.4, 303);
        
        //dolphin fin
        upper.curveTo(267.7,297,234.2,297,230.8,310.6);
        upper.curveTo(243,308,251.8,315.5,248.8,327.6);
        
        //back
        upper.curveTo(235.4,346.1,226.5,370,234.9,413.3);
        
        //tails
        upper.curveTo(224,427.7,214.2,428.2,220.2,446.9);
        upper.curveTo(224.5,435,234,433,239.8,426.5);
        upper.curveTo(247.9,428.1,255.6,423,261.5,427.7);
        upper.curveTo(261,420.3,253.2,415.1,240.7,418);
        
        //belly
        upper.curveTo(227.4,391.3,256.4,342,298.5,331.2);
        
        //lower fin
        upper.curveTo(303.2,333.2,295.3,348.2,287.5,353.9);
        upper.curveTo(299.5,360.3,317.2,337.6,326.2,326);

        //mouth
        upper.curveTo(332.4,326.8,342.6,319.3,355.2,326.6);
        upper.curveTo(361.8,330.8,381,339.4,387.6,336.3);
        upper.curveTo(389.5,334.2,383.4,328.4,376.7,322);
      
        //tails connecting
        upper.moveTo(234.9,413.3);
        upper.curveTo(238.5,422,244.56,419.4,242.46,414);

        //lower belly
        Path2D.Double lower = new Path2D.Double();
        lower.moveTo(240.8,415.8);
        lower.curveTo(229,417.9,239,344.5,300.2,331);
        lower.moveTo(300.2,331);
        lower.curveTo(301.8,353.7,274.4,345.8,256.2,376.9);
        lower.curveTo(245.3,392.6,244.8,416.4,240.8,415.8);

        //underMouth
        Path2D.Double underMouth = new Path2D.Double();
        underMouth.moveTo(317.2,337);
        underMouth.curveTo(326.4,321.2,326.8,326.8,336,324.2);
        underMouth.curveTo(341.6,321.9,349.5,322.8,359,329.2);
        underMouth.curveTo(371.8,335.2,387,339.7,387.7,335.5);
        underMouth.curveTo(388.7, 343.5,370.5,340.7,362.1,336.4);
        underMouth.curveTo(347,332.5,335.4,335.9,317.2,337);
        
        //lower fin2
        Path2D.Double fin2 = new Path2D.Double();
        fin2.moveTo(314.1,340.7);
        fin2.curveTo(317.5,346.9,313.6,352.8,308.5,355.8);
        fin2.curveTo(315.8,359,328.4,346.9,330.4,336.05);
        fin2.curveTo(315.7,336.5,318,334.2,314.1,340.7);

        Ellipse2D.Double eye = new Ellipse2D.Double(340,313,6,6);
       
        // rotation
        g2d.rotate(Math.toRadians(rotation),x,y);

        g2d.setColor(new Color(	113, 132, 150));
        g2d.fill(upper);

        g2d.setColor(new Color(	189, 209, 220));
        g2d.fill(lower);

        g2d.setColor(new Color(	189, 209, 220));
        g2d.fill(underMouth);

        g2d.setColor(new Color(	113, 132, 150));
        g2d.fill(fin2);

        g2d.setColor(Color.BLACK);
        g2d.fill(eye);

        // reset transform
        g2d.setTransform(reset);
    }
}