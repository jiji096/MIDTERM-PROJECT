/** 
    This is the Ocean class, which implements the DrawingObject interface
    and uses the java.awt.geom package to draw various elements in the ocean.
    It initializes two ArrayLists of Circle objects to store and draw bubbles.
    
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
import java.util.*;

/**
    Initializes ArrayLists storing circle objects for the bubbles.
**/
public class Ocean implements DrawingObject {
    private ArrayList<Circle> leftBubbles = new ArrayList<Circle>();
    private ArrayList<Circle> rightBubbles = new ArrayList<Circle>();

    /**
        Constructor for the Ocean class.
    **/
    public Ocean(){
        
    }
    /**
        Draws the elements of the Ocean using the Graphics2D object.
    **/
    public void draw(Graphics2D g2d){
        // RenderingHints rh = new RenderingHints(
        //     RenderingHints.KEY_ANTIALIASING,
        //     RenderingHints.VALUE_ANTIALIAS_ON);
        // g2d.setRenderingHints(rh);

        Path2D.Double rock1 = new Path2D.Double();
        rock1.moveTo(228.3,600);
        rock1.curveTo(225.7,584.4,244.8,584.8,245.6,585);
        rock1.curveTo(262.8,562.9,287.8,566,303.1,566.5);
        rock1.curveTo(308,567.3,318,571.1,320.8,577.7);
        rock1.curveTo(337.7,574.4,350.7,580.4,354.9,600);
        rock1.closePath();

        g2d.setColor(new Color(120, 127, 141));
        g2d.fill(rock1);

        Path2D.Double highlight = new Path2D.Double();
        highlight.moveTo(236.5,586.6);
        highlight.curveTo(249.7,568,290.7,561.6,304,567.2);
        highlight.curveTo(312,582.6,275,583.3,267.2,584.9);
        highlight.curveTo(249.8,601.8,237.5,603.6,236.5,586.6);

        g2d.setColor(new Color(154, 162, 180));
        g2d.fill(highlight);

        Path2D.Double highlight2 = new Path2D.Double();
        highlight2.moveTo(298,588.4);
        highlight2.curveTo(311.5,587.2,317.6,575.9,329.8,576.9);
        highlight2.curveTo(344.2,575.7,361.9,592.6,338.1,595.8);
        highlight2.curveTo(326.6,587.8,320.6,599.7,312.8,590);
        highlight2.curveTo(307.3,586.9,284.2,599.6,298,588.4);

        g2d.setColor(new Color(154, 162, 180));
        g2d.fill(highlight2);

        Path2D.Double highlight3 = new Path2D.Double();
        highlight3.moveTo(314.1,571.7);
        highlight3.curveTo(321.9,582,282.3,587.5,295.2,589.8);
        
        highlight3.curveTo(311.1,587,323.2,572.5,330.7,576.6);
        highlight3.curveTo(329.35,575.5,323.7,576.4,319.,576);
        highlight3.curveTo(316.9,572.9,314.6,571,314.1,571.7);

        g2d.setColor(new Color(86, 97, 118));
        g2d.fill(highlight3);

        Path2D.Double rock2= new Path2D.Double();
        rock2.moveTo(498.5,600.4);
        rock2.curveTo(527.1,585.5,526,584.7,518,602);
        rock2.curveTo(534.8,600.1,540.8,585,550,599);
        rock2.curveTo(556.4,603.1,558.8,591.9,568.4,591);
        rock2.curveTo(576.7,591.8,569.5,581,585.5,584);
        rock2.curveTo(588.7,586,593.3,593.7,595.5,600.7);
        rock2.closePath();

        g2d.setColor(new Color(120, 127, 141));
        g2d.fill(rock2);

        Path2D.Double moss = new Path2D.Double();
        moss.moveTo(471.8,600.7);
        moss.curveTo(472,593.5,489.7,587.2,494,596);
        moss.curveTo(496,578.7,531.8,552.5,562.5,561.5);
        moss.curveTo(574.5,564.6,606,586.4,575.3,584.9);
        moss.curveTo(573.1,594.5,563.9,589.8,559.6,595.6);
        moss.curveTo(554,602.4,549.2,601,544.3,594.2);
        moss.curveTo(530.2,593,527.5,606.4,518.8,599.2);
        moss.curveTo(530.3,578.5,517.1,597.2,497.4,600.4);
        moss.closePath();

        g2d.setColor(new Color(57, 80, 56));
        g2d.fill(moss);

        Path2D.Double moss2 = new Path2D.Double();
        moss2.moveTo(478.9,598.2);
        moss2.curveTo(467.2,594.6,490.6,587.8,487.5,594);
        moss2.curveTo(486,597.6,481.6,595.9,478.9,598.2);

        g2d.setColor(new Color(107, 156, 119));
        g2d.fill(moss2);

        Path2D.Double moss3 = new Path2D.Double();
        moss3.moveTo(501,586.2);
        moss3.curveTo(497,572,559.3,541.4,578.9,571.1);
        moss3.curveTo(569.8,585,564,570,549.4,581.3);
        moss3.curveTo(538.4,583.3,525.4,587.6,535.5,576.7);
        moss3.curveTo(528.5,568.4,511.5,585.9,501,586.2);

        g2d.setColor(new Color(107, 156, 119));
        g2d.fill(moss3);

        leftBubbles.add(new Circle(125,499,10,Color.WHITE));
        leftBubbles.add(new Circle(138,505,10,Color.WHITE));
        leftBubbles.add(new Circle(122,519,9,Color.WHITE));
        leftBubbles.add(new Circle(137,494,4,Color.WHITE));
        leftBubbles.add(new Circle(146,501.7,7,Color.WHITE));
        leftBubbles.add(new Circle(134,520.5,5,Color.WHITE));
        leftBubbles.add(new Circle(135,529.5,10,Color.WHITE));
        leftBubbles.add(new Circle(132,541.4,7,Color.WHITE));
        leftBubbles.add(new Circle(144,524.5,8,Color.WHITE));

        for (Circle bubbles : leftBubbles){
            bubbles.draw(g2d);
        }

        rightBubbles.add(new Circle(470,535.7,10,Color.WHITE));
        rightBubbles.add(new Circle(487,542,15,Color.WHITE));
        rightBubbles.add(new Circle(481,558,10,Color.WHITE));
        rightBubbles.add(new Circle(476,551,6,Color.WHITE));
        rightBubbles.add(new Circle(485,529,5,Color.WHITE));
        rightBubbles.add(new Circle(488,532,7,Color.WHITE));
        rightBubbles.add(new Circle(487,522,4,Color.WHITE));
        rightBubbles.add(new Circle(482,572,4,Color.WHITE));
        rightBubbles.add(new Circle(493,562,6,Color.WHITE));

        for (Circle bubbles : rightBubbles){
            bubbles.draw(g2d);
        }











        










    }
}