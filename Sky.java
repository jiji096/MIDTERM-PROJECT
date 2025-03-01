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

    public Sky(int x1, int y1, Color color1, int x2, int y2, Color color2){
        this.x1 = x1;
        this.y1 = y1;
        this.color1 = color1;
        this.x2 = x2;
        this.y2 = y2;
        this.color2 = color2;
        rotation = 30;
    }    

    public void rotate() {
        rotation+=5/3;
    }

    public void draw(Graphics2D g2d){
        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        AffineTransform reset = g2d.getTransform();
        g2d.rotate(Math.toRadians(rotation),400, 600);
        
        // GradientPaint gp = new GradientPaint(x1, y1, color1, x2, y2, color2);
        // Path2D day = new Path2D.Double();
        // back.moveTo(-800, -800);
        // back.lineTo(800+800, -800);
        // back.lineTo(800+800, 800);
        // back.lineTo(-800, 800);

        Path2D back = new Path2D.Double();
        back.moveTo(-800, -800);
        back.lineTo(800+800, -800);
        back.lineTo(800+800, 1600);
        back.lineTo(-800, 1600);

        float[] dist = {0.0f, 0.5f, 1.0f};
        Color[] colors = {new Color(2, 0, 36), new Color(92,92,212), new Color(0,212,255)};
        Point2D start = new Point2D.Float(x2, y2);
        Point2D end = new Point2D.Float(x1, y1);
        LinearGradientPaint lgp = new LinearGradientPaint(start, end, dist, colors);

        g2d.setPaint(lgp);
        g2d.fill(back);
        g2d.setTransform(reset);
    }
}  