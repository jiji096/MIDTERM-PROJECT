/** 
    This is the Waves class, which implements the DrawingObject interface. 
    It uses the java.awt.geom package to draw each curve of the waves.
	
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

public class Waves implements DrawingObject{    
    private double y1, y2, y3, y4;

    public Waves(){
        this.y1 = 0;
        this.y2 = 0;
        this.y3 = 0;
        this.y4 = 0;
    }    
    public void move(int state) {
        
        if (state == 1) {
            y1 += 5;
            y2 -= 5;
            y3 += 5;
            y4 -= 5;
        }
        else if (state == 2) {
            y1 += 5;
            y2 -= 5;
            y3 -= 5;
            y4 += 5;
        }
        else if (state == 3) {
            y1 -= 5;
            y2 += 5;
            y3 -= 5;
            y4 += 5;    
        }
        else if (state == 4) {
            y1 -= 5;
            y2 += 5;
            y3 += 5;
            y4 -= 5;
        }
    }
    
    public void draw(Graphics2D g2d){
        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        Path2D.Double fourthWave = new Path2D.Double();
        fourthWave.moveTo(0, 420 + y4);
        fourthWave.curveTo(48.8, 412 + y4, 113, 371 + y4, 170, 377 + y4);
        fourthWave.curveTo(260.5, 383.2 + y4, 296.5, 424 + y4, 338, 418 + y4);
        fourthWave.curveTo(386.8, 412 + y4, 451, 371 + y4, 540, 377 + y4);
        fourthWave.curveTo(595, 383.2 + y4, 650, 424 + y4, 708, 418 + y4);
        fourthWave.curveTo(760, 412 + y4, 800, 371 + y4, 890, 377 + y4);
        fourthWave.lineTo(890, 600 + y4);
        fourthWave.lineTo(0, 600 + y4);

        g2d.setColor(new Color(0, 158, 220));
        g2d.draw(fourthWave);
        g2d.fill(fourthWave);

        Path2D.Double thirdWave = new Path2D.Double();
        thirdWave.moveTo(0, 408 + y3);
        thirdWave.curveTo(59, 404 + y3, 117, 441 + y3, 169, 437 + y3);
        thirdWave.curveTo(257, 463 + y3, 257, 411 + y3, 361, 405 + y3);
        thirdWave.curveTo(486, 400 + y3, 483, 470 + y3, 613, 455 + y3);
        thirdWave.curveTo(665, 480 + y3, 764, 421 + y3, 795, 422 + y3);
        thirdWave.lineTo(890, 600 + y3);
        thirdWave.lineTo(0, 600 + y3);

        g2d.setColor(new Color(1, 173, 240));
        g2d.draw(thirdWave);
        g2d.fill(thirdWave);

        Path2D.Double secondWave = new Path2D.Double();
        secondWave.moveTo(0, 454 + y2);
        secondWave.curveTo(102.6, 473.4 + y2, 169, 409 + y2, 261, 413 + y2);
        secondWave.curveTo(351, 417 + y2, 411, 475 + y2, 468, 460 + y2);
        secondWave.curveTo(514, 463 + y2, 576, 414 + y2, 632, 417 + y2);
        secondWave.curveTo(694, 413 + y2, 750, 460, 798, 460 + y2);
        secondWave.lineTo(890, 600 + y2);
        secondWave.lineTo(0, 600 + y2);

        g2d.setColor(new Color(32, 185, 235));
        g2d.draw(secondWave);
        g2d.fill(secondWave);

        Path2D.Double firstWave = new Path2D.Double();
        firstWave.moveTo(0, 496 + y1);
        firstWave.curveTo(48.8, 488.8 + y1, 113, 447 + y1, 170, 453 + y1);
        firstWave.curveTo(260.5, 459.2 + y1, 296.5, 500 + y1, 338, 494 + y1);
        firstWave.curveTo(386.8, 488.8 + y1, 451, 447 + y1, 540, 453 + y1);
        firstWave.curveTo(595, 459.2 + y1, 650, 500 + y1, 708, 494 + y1);
        firstWave.curveTo(760, 488.8 + y1, 800, 447 + y1, 890, 453 + y1);
        firstWave.lineTo(890, 600 + y1);
        firstWave.lineTo(0, 600 + y1);


        g2d.setColor(new Color(68, 211, 255));
        g2d.draw(firstWave);
        g2d.fill(firstWave);

    }    
}