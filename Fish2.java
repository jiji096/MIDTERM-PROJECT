import java.awt.*;

public class Fish2 implements DrawingObject {
    private double x = 0;
    public Fish2() {
    }

    public void moveLeft() {
        x-=10;
    }
    
    public void draw(Graphics2D g2d) {
        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);
    }
}