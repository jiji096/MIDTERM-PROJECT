import java.awt.*;

public class Rainbow implements DrawingObject {
    private int transparency = 120;
    public Rainbow(){
    }

    public void turnTransparent() {
        if (transparency <= 255 && transparency > 20) {
            transparency-=20;
        }
        else transparency = 0;
    }

    public void turnOpaque() {
        if (transparency+30 - 255 > 0) {
            transparency = 255;
        }
        else transparency+=30;
    }

    public void setTransparency(int x) {
        transparency = x;
    }
    public int getTransparency() {
        return transparency;
    }

    public void draw(Graphics2D g2d){
        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        Circle red = new Circle(100,120,600,new Color(248, 175, 175, transparency));
        Circle orange = new Circle(120,140,560,new Color(255, 198, 138, transparency));
        Circle yellow = new Circle(140,160,520,new Color(255, 243, 202, transparency));
        Circle green = new Circle(160,180,480,new Color(219, 239, 199, transparency));
        Circle blue = new Circle(180,200,440,new Color(199, 220, 255, transparency));
        Circle purple = new Circle(200,220,400,new Color(241, 216, 255, transparency));
        Circle white = new Circle(220,240,360,new Color(255, 255, 255, transparency));

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