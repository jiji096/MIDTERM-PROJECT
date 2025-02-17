import java.awt.*;
import javax.swing.*;

public class SceneCanvas extends JComponent { 
    private int width;
    private int height;
    private Sun mrSun;
    private Cloud cloud1;
    private Cloud cloud2;
    private Cloud cloud3;
    private Waves dagat;
    private Dolphin dolphin;

    public SceneCanvas(int w, int h){
        width = w;
        height = h;

        dolphin = new Dolphin();
        mrSun = new Sun();
        
        Color blue = new Color(100,149,237);
        cloud1 = new Cloud(0,75,70, blue);
        cloud2 = new Cloud(100,65,70,blue);
        cloud3 = new Cloud(520,80,70,blue);
        dagat = new Waves();
    }

    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        cloud1.draw(g2d);
        cloud2.draw(g2d);
        cloud3.draw(g2d);
        dolphin.draw(g2d);
        mrSun.draw(g2d);
        dagat.draw(g2d);
    }  


}