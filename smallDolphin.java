/** 
    This is the smallDolphin class, which implements the DrawingObject interface 
    and uses the java.awt.geom package to draw each curve of the dolphin. It
    accepts x and y coordinates as parameters to set the dolphin's initial 
    position and includes a rotate method that controls its rotation speed.
	
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

public class smallDolphin implements DrawingObject {
    private double x, y, rotation;

    public smallDolphin (double x, double y) {
        this.x = -x;
        this.y = y;
        rotation = 0;
    }

    public void rotate(){
        rotation +=6;
    }


    public void draw(Graphics2D g2d) {
        AffineTransform reset = g2d.getTransform();
       
        Path2D.Double upper = new Path2D.Double();
        g2d.setColor(Color.BLACK);

        upper.moveTo(x+376.7,322);
        upper.curveTo(x+364,276.6, x+287.7,284.8,x+275.4, 303);
        
        //dolphin fin
        upper.curveTo(x+267.7,297,x+234.2,297,x+230.8,310.6);
        upper.curveTo(x+243,308,x+251.8,315.5,x+248.8,327.6);
        
        //back
        upper.curveTo(x+235.4,346.1,x+226.5,370,x+234.9,413.3);
        
        //tails
        upper.curveTo(x+224,427.7,x+214.2,428.2,x+220.2,446.9);
        upper.curveTo(x+224.5,435,x+234,433,x+239.8,426.5);
        upper.curveTo(x+247.9,428.1,x+255.6,423,x+261.5,427.7);
        upper.curveTo(x+261,420.3,x+253.2,415.1,x+240.7,418);
        
        //belly
        upper.curveTo(x+227.4,391.3,x+256.4,342,x+298.5,331.2);
        
        //lower fin
        upper.curveTo(x+303.2,333.2,x+295.3,348.2,x+287.5,353.9);
        upper.curveTo(x+299.5,360.3,x+317.2,337.6,x+326.2,326);

        //mouth
        upper.curveTo(x+332.4,326.8,x+342.6,319.3,x+355.2,326.6);
        upper.curveTo(x+361.8,330.8,x+381,339.4,x+387.6,336.3);
        upper.curveTo(x+389.5,334.2,x+383.4,328.4,x+376.7,322);
      
        //tails connecting
        upper.moveTo(x+234.9,413.3);
        upper.curveTo(x+238.5,422,x+244.56,419.4,x+242.46,414);

        //lower belly
        Path2D.Double lower = new Path2D.Double();
        lower.moveTo(x+240.8,415.8);
        lower.curveTo(x+229,417.9,x+239,344.5,x+300.2,331);
        lower.moveTo(x+300.2,331);
        lower.curveTo(x+301.8,353.7,x+274.4,345.8,x+256.2,376.9);
        lower.curveTo(x+245.3,392.6,x+244.8,416.4,x+240.8,415.8);

        //underMouth
        Path2D.Double underMouth = new Path2D.Double();
        underMouth.moveTo(x+317.2,337);
        underMouth.curveTo(x+326.4,321.2,x+326.8,326.8,x+336,324.2);
        underMouth.curveTo(x+341.6,321.9,x+349.5,322.8,x+359,329.2);
        underMouth.curveTo(x+371.8,335.2,x+387,339.7,x+387.7,335.5);
        underMouth.curveTo(x+388.7, 343.5,x+370.5,340.7,x+362.1,336.4);
        underMouth.curveTo(x+347,332.5,x+335.4,335.9,x+317.2,337);
        
        //lower fin2
        Path2D.Double fin2 = new Path2D.Double();
        fin2.moveTo(x+314.1,340.7);
        fin2.curveTo(x+317.5,346.9,x+313.6,352.8,x+308.5,355.8);
        fin2.curveTo(x+315.8,359,x+328.4,346.9,x+330.4,336.05);
        fin2.curveTo(x+315.7,336.5,x+318,334.2,x+314.1,340.7);

        Ellipse2D.Double eye = new Ellipse2D.Double(x+340,313,6,6);
       
        // rotation
        g2d.scale(-1, 1);
        g2d.translate(-800, 0);
        g2d.rotate(Math.toRadians(rotation),-x,y);

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