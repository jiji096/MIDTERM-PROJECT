import java.awt.*;
import java.awt.geom.*;

public class Waves implements DrawingObject{    
    
    public Waves(){

    }    
    
    public void draw(Graphics2D g2d){
        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        Path2D.Double fourthWave = new Path2D.Double();
        fourthWave.moveTo(0, 420);
        fourthWave.curveTo(48.8,412,113,371,170,377);
        fourthWave.curveTo(260.5,383.2,296.5,424,338,418);
        fourthWave.curveTo(386.8,412,451,371,540,377);
        fourthWave.curveTo(595,383.2,650,424,708,418);
        fourthWave.curveTo(760,412,800,371,890,377);
        fourthWave.lineTo(890,600);
        fourthWave.lineTo(0,600);

        g2d.setColor(new Color(0, 158, 220));
        g2d.draw(fourthWave);
        g2d.fill(fourthWave);

        Path2D.Double thirdWave = new Path2D.Double();
        thirdWave.moveTo(0,408);
        thirdWave.curveTo(59,404,117,441,169,437);
        thirdWave.curveTo(257,463,257,411,361,405);
        thirdWave.curveTo(486,400,483,470,613,455);
        thirdWave.curveTo(665,480,764,421,795,422);
        thirdWave.lineTo(890,600);
        thirdWave.lineTo(0,600);
        g2d.setColor(new Color(1, 173, 240));
        g2d.draw(thirdWave);
        g2d.fill(thirdWave);

        Path2D.Double secondWave = new Path2D.Double();
        secondWave.moveTo(0,454);
        secondWave.curveTo(102.6,473.4,169,409,261,413);
        secondWave.curveTo(351,417,411,475,468,460);
        secondWave.curveTo(514,463,576,414,632,417);
        secondWave.curveTo(694,413,750,460,798,460);
        secondWave.lineTo(890,600);
        secondWave.lineTo(0,600);
        g2d.setColor(new Color(32, 185, 235));
        g2d.draw(secondWave);
        g2d.fill(secondWave);

        Path2D.Double firstWave = new Path2D.Double();
        firstWave.moveTo(0, 496);
        firstWave.curveTo(48.8,488.8,113,447,170,453);
        firstWave.curveTo(260.5,459.2,296.5,500,338,494);
        firstWave.curveTo(386.8,488.8,451,447,540,453);
        firstWave.curveTo(595,459.2,650,500,708,494);
        firstWave.curveTo(760,488.8,800,447,890,453);
        firstWave.lineTo(890,600);
        firstWave.lineTo(0,600);

        g2d.setColor(new Color(68, 211, 255));
        g2d.draw(firstWave);
        g2d.fill(firstWave);

        // g2d.translate(0, 420);
        // g2d.setColor(new Color(68, 211, 255));
        // g2d.draw(firstWave);
        // g2d.fill(firstWave);
        // g2d.translate(0, 420);
        // g2d.draw(firstWave);
        // g2d.fill(firstWave);


    }    
}