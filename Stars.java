import java.awt.*;
import java.awt.geom.*;
import java.util.*;

public class Stars implements DrawingObject{
    private ArrayList<Square> yellowStars = new ArrayList<Square>();
    private ArrayList<Square> whiteStars = new ArrayList<Square>();
    private Random random = new Random();

    private int yellow = 20;
    private int white = 60;
    //private int transparency = 200;
    private double x, y, rotation;
    private int transparency;

    public Stars(double x, double y){
        this.x = x;
        this.y = y;
        rotation = 0;
        starsPls();
    }

    public void rotate(){
        rotation += 30;
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

        AffineTransform reset = g2d.getTransform();
        g2d.rotate(Math.toRadians(rotation),x,y);


        for (Square ystars : yellowStars){
            //AffineTransform reset = g2d.getTransform();
            // g2d.translate(x,y);
            //g2d.rotate(rotation);
            g2d.setColor(new Color(255, 255, 0, transparency));
            ystars.draw(g2d);
            //g2d.setTransform(reset);
        }

        for (Square wstars : whiteStars){
            //AffineTransform reset = g2d.getTransform();
            // g2d.translate();
            //g2d.rotate(rotation);
            g2d.setColor(new Color(255, 255, 255, transparency));
            wstars.draw(g2d);
            //g2d.setTransform(reset);
        }

        g2d.setTransform(reset);


        // Yellow stars
        // yellowStars.add(new Square(80, 30, 15, Color.YELLOW));
        // yellowStars.add(new Square(180, 200, 15, Color.YELLOW));
        // yellowStars.add(new Square(400, 300, 15, Color.YELLOW));
        
        // white stars
        // whiteStars.add(new Square(300, 100, 10, Color.WHITE));
        // whiteStars.add(new Square(150, 50, 10, Color.WHITE));

       
        // ystar1.draw(g2d);
        // ystar2.draw(g2d);
        // ystar3.draw(g2d);

        // wstar1.draw(g2d);
        // wstar2.draw(g2d);

        // for (int i = 0; i < 3; i++){
        //     g2d.translate(10, -60);
        //     star2.draw(g2d);
        // }

    }

}