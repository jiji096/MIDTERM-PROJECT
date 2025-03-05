/** 
    This is the Chest class, which implements the DrawingObject interface and 
    uses the java.awt.geom package to draw a the chest. It includes a method to 
    change its state or appearance to be 'unlocked' after the button is pressed.

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
    Initializes values for the state and counter, as well as
    ArrayLists containing Circle objects.
**/
public class Chest implements DrawingObject {
    private int state = 0;
    private int counter = 0;
    private ArrayList<Circle> gold1 = new ArrayList<Circle>();
    private ArrayList<Circle> gold2 = new ArrayList<Circle>();

    /**
        Constructor for the Chest class.
	**/
    public Chest() {
    }

    /**
        Toggles the state of the chest between state 0 ('locked') 
        and state 1 ('unlocked'). The state determines the chest's 
        appearance.
	**/
    public void changeState() {
        this.counter+=1;
        if (this.counter%2 == 0) this.state = 1;
        else this.state = 0;
    }

    /**
        Draws the chest based on its current state
        using the Graphics2D object.
	**/
    public void draw(Graphics2D g2d) {
        /**
            If-Else checks state which determines whether to render open chest or not.
	    **/


        if (this.state == 0) {
            Path2D chestTop = new Path2D.Double();
            g2d.setColor(new Color(	243, 156, 5));
            chestTop.moveTo(28, 557);
            chestTop.lineTo(33.6, 533.7);
            chestTop.curveTo(38.3, 517.55, 39.9, 516.8, 53.2, 517);
            chestTop.lineTo(95.6, 516.7);
            chestTop.curveTo(111.9, 517.55, 113.5, 516.8, 118.2, 533.7);
            chestTop.lineTo(123.8, 557);
            g2d.fill(chestTop);

            Path2D innerChestTop = new Path2D.Double();
            g2d.setColor(new Color(152, 86, 0));
            innerChestTop.moveTo(40, 552);
            innerChestTop.lineTo(43.6, 538.7);
            innerChestTop.curveTo(48.3, 522.55, 49.9, 521.8, 63.2, 522);
            innerChestTop.lineTo(85.6, 521.7);
            innerChestTop.curveTo(101.9, 522.5, 103.5, 521.8, 108.2, 538.7);
            innerChestTop.lineTo(111.8, 552);
            g2d.fill(innerChestTop);
        }
        else {
            Path2D chestTop = new Path2D.Double();
            g2d.setColor(new Color(	243, 156, 5));
            chestTop.moveTo(55.3, 558);
            chestTop.lineTo(38,522);
            chestTop.lineTo(41,512);
            chestTop.lineTo(48,512);
            chestTop.lineTo(51.4,516);
            chestTop.lineTo(78.6,516);
            chestTop.lineTo(102,516);
            chestTop.lineTo(104,512);
            chestTop.lineTo(111,512);
            chestTop.lineTo(115,522);
            chestTop.lineTo(102,558);
            g2d.fill(chestTop);

            Quadrilateral inner = new Quadrilateral(35.7+20, 554.6, 23.9+20, 523.8, 119.7+10-20, 524.3, 107.9+10-20, 554.6, new Color(152, 71, 0));
            inner.draw(g2d);

            gold1.add(new Circle(63,526,30,new Color(243, 156, 5)));
            gold1.add(new Circle(53,532,30,new Color(243, 156, 5)));
            gold1.add(new Circle(70,532,30,new Color(243, 156, 5)));
            gold1.add(new Circle(45,539,20,new Color(243, 156, 5)));
            gold1.add(new Circle(88,539,20,new Color(243, 156, 5)));

            gold2.add(new Circle(63,533,30,new Color(252, 180, 56)));
            gold2.add(new Circle(53,539,30,new Color(252, 180, 56)));
            gold2.add(new Circle(70,539,30,new Color(252, 180, 56)));
            gold2.add(new Circle(45,546,20,new Color(252, 180, 56)));
            gold2.add(new Circle(88,546,20,new Color(252, 180, 56)));

            for (Circle gold : gold1){
                gold.draw(g2d);
            }

            for (Circle gold : gold2){
                gold.draw(g2d);
            }

            AffineTransform reset = g2d.getTransform();
            Square shine = new Square(92.1,527.2,6);
            g2d.setColor(Color.WHITE);
            g2d.rotate(Math.toRadians(45),92.1,527.2);
            shine.draw(g2d);
            g2d.translate(-20,40);
            shine.draw(g2d);
            g2d.setTransform(reset);

        }

        Path2D chestBottom = new Path2D.Double();
        g2d.setColor(new Color(	243, 156, 5));
        chestBottom.moveTo(33, 600);
        chestBottom.lineTo(30, 555);
        chestBottom.lineTo(123, 555);
        chestBottom.lineTo(119, 600);
        g2d.fill(chestBottom);

        Path2D chestBottomInner = new Path2D.Double();
        g2d.setColor(new Color(152, 86, 0));
        chestBottomInner.moveTo(38.9, 595.5);
        chestBottomInner.lineTo(36, 554.7);
        chestBottomInner.lineTo(117, 554.7);
        chestBottomInner.lineTo(113.2, 595.7);
        g2d.fill(chestBottomInner);

        Line lines1 = new Line(52,565.3,103,565.3, new Color(91, 52, 0));
        Line lines2 = new Line(47,573,99,573, new Color(91, 52, 0));
        Line lines3 = new Line(49,581,105,581, new Color(91, 52, 0));
        Line lines4 = new Line(50,589,100,589, new Color(91, 52, 0));

        lines1.draw(g2d);
        lines2.draw(g2d);
        lines3.draw(g2d);
        lines4.draw(g2d);

        Path2D chestLock = new Path2D.Double();
        g2d.setColor(new Color(255, 210, 18));
        chestLock.moveTo(69.2, 559.1);
        chestLock.curveTo(69.36, 553.7, 67.4, 546.2, 76.5, 546.3);
        chestLock.curveTo(82.8, 546, 84.76, 550.1, 84.4, 559.1);
        g2d.fill(chestLock);

        Path2D keyHole = new Path2D.Double();
        g2d.setColor(Color.BLACK);
        keyHole.moveTo(74.67, 554.36);
        keyHole.curveTo(68.95, 545.67, 83.9, 545.6, 78.4, 554.36);
        keyHole.lineTo(78.4, 557.1);
        keyHole.lineTo(74.67, 557.1);
        keyHole.lineTo(74.67, 554.36);
        g2d.fill(keyHole);
    }

}