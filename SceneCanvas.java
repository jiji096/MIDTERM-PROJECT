import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class SceneCanvas extends JComponent { 
    private int width;
    private int height;
    private Sun mrSun;
    private Triangle rays;
    private Waves dagat;
    private Dolphin dolphin;
    private Fish1 fish1;
    private Chest chest;
    private RecordPlayer record;
    private Rainbow rainbow;
    private Sky sky;
    private Cloud cloud1, cloud2, cloud3, cloud4, cloud5, cloud6;
    private Coral coral1, coral2;
    private Stars stars;
    private ArrayList<DrawingObject> elements = new ArrayList<>();
    
    public SceneCanvas(int w, int h){
        width = w;
        height = h;

        dolphin = new Dolphin(400,1100);
        mrSun = new Sun();
        
        Color blue = new Color(100,149,237);
        Color darkBlue = new Color(	66, 117, 209);
        cloud1 = new Cloud(105, 70, 70, darkBlue);
        cloud2 = new Cloud(100,65,70,blue);
        cloud3 = new Cloud(5, 80, 70, darkBlue);
        cloud4 = new Cloud(0,75,70,blue);
        cloud5 = new Cloud(525, 85, 70, darkBlue);
        cloud6 = new Cloud(520,80,70,blue);

        fish1 = new Fish1();
        dagat = new Waves();
        chest = new Chest();
        record = new RecordPlayer(707.33,523);
        rainbow = new Rainbow();
        coral1 = new Coral(0);
        coral2 = new Coral(300);

        sky = new Sky(400, 0, new Color( 176, 206, 255), 400, 600, new Color (59, 0, 100 ));
        stars = new Stars(400,400);

        elements.add(sky);
        elements.add(stars);
        elements.add(rainbow);
        elements.add(dagat);
        elements.add(dolphin);
        elements.add(mrSun);
        elements.add(cloud1);
        elements.add(cloud2);
        elements.add(cloud3);
        elements.add(cloud4);
        elements.add(cloud5);
        elements.add(cloud6);
        elements.add(fish1);
        elements.add(record);
        elements.add(coral1);
        elements.add(coral2);
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
        
        // sky.draw(g2d);
        // mrSun.draw(g2d);

        // for (int i = 0; i < clouds.size(); i++) {
        //     clouds.get(i).draw(g2d);
        // }

        // dolphin.draw(g2d);
        // dagat.draw(g2d);
        // dolphin.draw(g2d);
        // fish1.draw(g2d);
        // chest.draw(g2d);
        // record.draw(g2d); 


        // if (fish1.getX() == 600) {
        //     fish1.draw(g2d);
        // }



    }  

    public Dolphin getDolphin(){
        return dolphin;
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