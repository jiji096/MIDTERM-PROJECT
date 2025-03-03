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

    public void turnTransparent() {
        if (transparency <= 255 && transparency > 20) {
            transparency-=10;
        }
        else transparency = 0;
    }

    public void turnOpaque() {
        if (transparency+6 - 255 > 0) {
            transparency = 255;
        }
        else transparency+=6;
    }

    public void setTransparency(int x) {
        transparency = x;
    }
    public int getTransparency() {
        return transparency;
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

    public void draw(Graphics2D g2d){
        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);


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