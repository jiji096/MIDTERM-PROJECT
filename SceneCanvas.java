import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class SceneCanvas extends JComponent { 
    private int width;
    private int height;
    private Dolphin dolphin;
    private smallDolphin dolphin1;
    private Fish1 fish1;
    private RecordPlayer record;
    private Sun mrSun;
    private Rainbow rainbow;
    private Sky sky;
    private Stars stars;
    
    private ArrayList<DrawingObject> elements = new ArrayList<>();
    
    public SceneCanvas(int w, int h){
        width = w;
        height = h;
        
        Color blue = new Color(100,149,237);
        Color darkBlue = new Color(	66, 117, 209);
        
        dolphin = new Dolphin(400,1100);
        dolphin1 = new smallDolphin(450, 1000);
        fish1 = new Fish1();
        record = new RecordPlayer(707.33,523);
        mrSun = new Sun();
        rainbow = new Rainbow();
        sky = new Sky(400, 0, new Color( 176, 206, 255), 400, 600, new Color (59, 0, 100 ));
        stars = new Stars(0, 0);

        elements.add(sky);
        elements.add(stars);
        elements.add(rainbow);
        elements.add(new Waves());
        elements.add(dolphin);
        elements.add(dolphin1);
        elements.add(mrSun);
        elements.add(new Cloud(105, 70, 70, darkBlue));
        elements.add(new Cloud(100,65,70,blue));
        elements.add(new Cloud(5, 80, 70, darkBlue));
        elements.add(new Cloud(0,75,70,blue));
        elements.add(new Cloud(525, 85, 70, darkBlue));
        elements.add(new Cloud(520,80,70,blue));
        elements.add(fish1);
        elements.add(record);
        elements.add(new Coral(0));
        elements.add(new Coral(300));
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        for (int i = 0; i < elements.size(); i++) {
            elements.get(i).draw(g2d);
        }
        


    }  

    public Dolphin getDolphin(){
        return dolphin;
    }

    public smallDolphin getSmallDolphin(){
        return dolphin1;
    }

    public Fish1 getFish1() {
        return fish1;
    }

    public RecordPlayer getRecordPlayer(){
        return record;
    }

    public Sun getSun(){
        return mrSun;
    }

    public Rainbow getRainbow(){
        return rainbow;
    }

    public Sky getSky(){
        return sky;
    }

    public Stars getStars(){
        return stars;
    }
}