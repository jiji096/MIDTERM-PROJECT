import java.awt.*;
import java.awt.geom.*;

public class Dolphin implements DrawingObject {
    
    public Dolphin () {

    }

    public void draw(Graphics2D g2d) {
        Path2D.Double upper = new Path2D.Double();
        g2d.setColor(Color.BLACK);

        upper.moveTo(376.7,322);
        upper.curveTo(364,276.6, 287.7,284.8,275.4, 303);
        
        //upper fin
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
        upper.curveTo(299.5,359.5,309.1,345,314.5,341.7);

        //lower fin2
        // upper.curveTo(316.7,348.1,314.2,351.6,308.5,355.8);
        // upper.curveTo(316.4,359,326.9,348,330.5,336.6);

        //lower belly
        upper.moveTo(240.7,418);
        upper.curveTo(244,391.7,265.3,356,297.2,340.4);

        //tails connecting
        //upper.moveTo();

        g2d.draw(upper);
        //g2d.fill(upper);

    }
}