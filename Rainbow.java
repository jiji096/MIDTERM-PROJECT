/** 
    This is the Rainbow class, which implements the DrawingObject interface.
    It uses the CircleOutline shape class to draw each layer of the rainbow.
    The transparency methods allow the rainbow to become more transparent 
    or opaque over time.

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
    Initializes values for transparency.
**/
public class Rainbow implements DrawingObject {
    private int transparency = 120;

    /**
        Constructor for the Rainbow class.
    **/
    public Rainbow(){
    }

    /**
        Adjusts the transparency of the Rainbow.
    **/
    public void turnTransparent() {
        if (transparency <= 255 && transparency > 20) {
            transparency-=6;
        }
        else transparency = 0;
    }

    /**
        Turns the rainbow opaque.
    **/
    public void turnOpaque() {
        if (transparency+6 - 255 > 0) {
            transparency = 255;
        }
        else transparency+=6;
    }

    /**
        Sets the value of the transparency based on the given value.
        @param x value for transparency of the circle objects.
    **/
    public void setTransparency(int x) {
        transparency = x;
    }

    /**
        Draws the Rainbow with CircleOutline objects using the Graphics2D object.
	**/
    public void draw(Graphics2D g2d){

        CircleOutline red = new CircleOutline(100,120,600,new Color(248, 175, 175, transparency));
        CircleOutline orange = new CircleOutline(120,140,560,new Color(255, 198, 138, transparency));
        CircleOutline yellow = new CircleOutline(140,160,520,new Color(255, 243, 202, transparency));
        CircleOutline green = new CircleOutline(160,180,480,new Color(219, 239, 199, transparency));
        CircleOutline blue = new CircleOutline(180,200,440,new Color(199, 220, 255, transparency));
        CircleOutline purple = new CircleOutline(200,220,400,new Color(241, 216, 255, transparency));
        CircleOutline white = new CircleOutline(220,240,360,new Color(255, 255, 255, transparency));

        // Circle red = new Circle(100,120,600,Color.RED);
        // Circle orange = new Circle(120,140,560,new Color(255, 140, 0));
        // Circle yellow = new Circle(140,160,520,new Color(255, 210, 18));
        // Circle green = new Circle(160,180,480,new Color(0, 128, 0));
        // Circle blue = new Circle(180,200,440,Color.BLUE);
        // Circle purple = new Circle(200,220,400,new Color(128, 0, 128));
        // Circle white = new Circle(220,240,360,Color.WHITE);

        red.draw(g2d);
        orange.draw(g2d);
        yellow.draw(g2d);
        green.draw(g2d);
        blue.draw(g2d);
        purple.draw(g2d);
        white.draw(g2d);

    }

}