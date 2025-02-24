import java.awt.*;
import java.awt.geom.*;

public class Sky implements DrawingObject{
    private float x1;
    private float y1;
    private Color color1;
    private float x2;
    private float y2;
    private Color color2;
    private double rotation;

    public Sky(float x1, float y1, Color color1, float x2, float y2, Color color2){
        this.x1 = x1;
        this.y1 = y1;
        this.color1 = color1;
        this.x2 = x2;
        this.y2 = y2;
        this.color2 = color2;
        rotation = 30;
    }    

    public void rotate() {
        rotation+=5;
    }

    public void draw(Graphics2D g2d){
        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        AffineTransform reset = g2d.getTransform();
        g2d.rotate(Math.toRadians(rotation),400, 600);
        
        GradientPaint gp = new GradientPaint(x1, y1, color1, x2, y2, color2);
        Path2D back = new Path2D.Double();
        g2d.setColor(Color.YELLOW);
        back.moveTo(-800, -800);
        back.lineTo(800+800, -800);
        back.lineTo(800+800, 800+800);
        back.lineTo(-800, 800+800);
        g2d.setPaint(gp);
        g2d.fill(back);

        g2d.setTransform(reset);
    }
}  