import javax.swing.*;

public class SceneFrame extends JComponent { 
    private JFrame frame;
    private SceneCanvas scene;
    private int width;
    private int height;
    
    public SceneFrame(int w, int h){
        frame = new JFrame();
        width = w;
        height = h;
        scene = new SceneCanvas(w, h);
    }


    public void setUpGUI(){
        frame.setSize(width,height);
        frame.setTitle("ERMMMM");
        frame.add(scene);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}