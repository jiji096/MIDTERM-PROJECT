/** 
    This is the Stars class, which implements the DrawingObject interface. 
    It uses the Square shape class to draw the stars. Each star's 
    coordinates are randomly generated and stored in an ArrayList within a 
    private method, which is called in the constructor. The transparency 
    methods allow the stars to become more transparent or opaque over time.
	
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
import java.util.*;

/**
    Initializes ArrayLists for storing the randomly generated stars and 
    fields for the amount of stars and the transparency.
**/
public class Stars implements DrawingObject{
    private ArrayList<Square> yellowStars = new ArrayList<Square>();
    private ArrayList<Square> whiteStars = new ArrayList<Square>();
    private Random random = new Random();

    private int yellow = 20;
    private int white = 60;
    private int transparency;

    public Stars(){
        starsPls();
    }

    /**
        Adjusts the transparency of the Stars.
    **/
    public void turnTransparent() {
        if (transparency <= 255 && transparency > 20) {
            transparency-=10;
        }
        else transparency = 0;
    }

    /**
        Turns the stars opaque.
    **/
    public void turnOpaque() {
        if (transparency+6 - 255 > 0) {
            transparency = 255;
        }
        else transparency+=6;
    }

    /**
        Sets the value of the transparency based on the given value.
        @param x value for transparency of the square objects.
    **/
    public void setTransparency(int x) {
        transparency = x;
    }

    private void starsPls(){
        for (int i = 0; i < yellow; i++){
            double x = random.nextDouble(800);
            double y = random.nextDouble(300);
            yellowStars.add(new Square(x, y, 15));
        }

        for (int i = 0; i < white; i++){
            double x = random.nextDouble(800);
            double y = random.nextDouble(300);
            int size = random.nextInt(6) + 5;
            whiteStars.add(new Square(x, y, size));
        }
    }

    /**
        The for loop iterates through the ArrayLists and
        draw the stars using the Graphics2D object.
	**/
    public void draw(Graphics2D g2d){
        for (Square ystars : yellowStars){
            g2d.setColor(new Color(255, 255, 0, transparency));
            ystars.draw(g2d);
        }

        for (Square wstars : whiteStars){
            g2d.setColor(new Color(255, 255, 255, transparency));
            wstars.draw(g2d);
        }
    }

}