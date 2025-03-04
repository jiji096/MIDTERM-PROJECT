import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;
import javax.swing.*;


public class SceneFrame extends JComponent implements ActionListener, MouseListener { 
    private JFrame frame;
    private SceneCanvas scene;
    private int width;
    private int height;
    private int state1 = 0;
    private int day = 0;
    private Timer loopie;
    private JLabel playClick, chestClick;
    private File music;
    private Clip clip;

    
    public SceneFrame(int w, int h){
        frame = new JFrame();
        width = w;
        height = h;
       
        scene = new SceneCanvas();
        loopie = new Timer(100, this);
    }

    public void setUpGUI() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
        scene.setPreferredSize(new Dimension(width,height));

        music = new File("audio.AIFF");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(music);
        clip = AudioSystem.getClip();
        clip.open(audioStream);

        playClick = new JLabel();
        playClick.setBounds(692,510, 30, 30);
        playClick.setOpaque(false);
        playClick.addMouseListener(this);

        chestClick = new JLabel();
        chestClick.setBounds(60, 540, 30, 30);
        chestClick.setOpaque(false);
        chestClick.addMouseListener(this);

        frame.add(playClick);
        frame.add(chestClick);
        frame.add(scene);

        frame.setTitle("Midterm Project - Lopez - Nellas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setFocusable(true);
        frame.setVisible(true);

        this.addMouseListener(this);
    }

    @Override 
    public void mouseClicked(MouseEvent e){
        Chest chest = (Chest) scene.getObject("Chest");
        if (e.getSource() == playClick){
            state1+=1;
            if (state1%2 == 0) {
                if(!loopie.isRunning()){
                    loopie.start();
                    clip.start();
                    clip.loop(Clip.LOOP_CONTINUOUSLY);
                }
            }
            else {
                if(loopie.isRunning()){
                    loopie.stop();
                    clip.stop();
                }
            }
        }
        if (e.getSource() == chestClick){
            chest.changeState();
        }
    }


    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == loopie){
            update();
        }
    }

    private void update(){
        Dolphin d = (Dolphin) scene.getObject("Dolphin");
        smallDolphin d1 = (smallDolphin) scene.getObject("smallDolphin");
        RecordPlayer r = (RecordPlayer)  scene.getObject("RecordPlayer");
        Fish1 f1 = (Fish1) scene.getObject("Fish1");
        Fish2 f2 = (Fish2) scene.getObject("Fish2");
        Fish3 f3 = (Fish3) scene.getObject("Fish3");
        Rainbow rb = (Rainbow) scene.getObject("Rainbow");
        Sun sun = (Sun) scene.getObject("Sun");
        Sky sky = (Sky) scene.getObject("Sky");
        Stars stars = (Stars) scene.getObject("Stars");

        d.rotate();
        d1.rotate();
        sun.rotate();
        f1.moveLeft();
        f2.move();
        f3.move();
        sky.rotate();
        r.rotate();
        
        day+=5/3;
        //rainbow
        if (day == 360) {
            day = 0;
        }
        
        if (day > 60 && day < 270) {
            rb.setTransparency(0);
        }
        if (day > 270 && day < 360) {
            rb.turnOpaque();
        }
        else {
            rb.turnTransparent();
        }

        //stars
        if (day < 60 || day > 270) {
            stars.setTransparency(0);
        }
        if (day > 240 && day < 360) {
            stars.turnTransparent();
        }
        else {
            stars.turnOpaque();
        }

        scene.repaint();

    }

    @Override
    public void mousePressed(MouseEvent e){}
    @Override
    public void mouseReleased(MouseEvent e){}
    @Override
    public void mouseEntered(MouseEvent e){}
    @Override
    public void mouseExited(MouseEvent e){}
}