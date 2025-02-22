import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

public class SceneCanvas extends JComponent { 
    private int width;
    private int height;
    private Sun mrSun;
    private Triangle rays;
    private Waves dagat;
    private Dolphin dolphin;
    private Fish1 fish;
    private Chest chest;
    private RecordPlayer record;
    private Rainbow rainbow;
    private ArrayList<Cloud> clouds = new ArrayList<Cloud>();

    public SceneCanvas(int w, int h){
        width = w;
        height = h;

        dolphin = new Dolphin(450,700);
        mrSun = new Sun();
        
        Color blue = new Color(100,149,237);
        Color darkBlue = new Color(	66, 117, 209);
        clouds.add(new Cloud(105, 70, 70, darkBlue));
        clouds.add(new Cloud(100,65,70,blue));
        clouds.add(new Cloud(5, 80, 70, darkBlue));
        clouds.add(new Cloud(0,75,70,blue));
        clouds.add(new Cloud(525, 85, 70, darkBlue));
        clouds.add(new Cloud(520,80,70,blue));

        fish = new Fish1();
        dagat = new Waves();
        chest = new Chest();
        record = new RecordPlayer();
        rainbow = new Rainbow();
    }

    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);
        
        mrSun.draw(g2d);

        for (int i = 0; i < clouds.size(); i++) {
            clouds.get(i).draw(g2d);
        }

        rainbow.draw(g2d);
        dagat.draw(g2d);
        dolphin.draw(g2d);
        fish.draw(g2d);
        chest.draw(g2d);
        record.draw(g2d);
    }  

    public Dolphin getDolphin(){
        return dolphin;
    }

    public RecordPlayer getRecordPlayer(){
        return record;
    }

    public Sun getSun(){
        return mrSun;
    }


}