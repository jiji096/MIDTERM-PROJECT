import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class SceneFrame extends JComponent implements ActionListener, MouseListener { 
    private JFrame frame;
    private JButton rotate, clockwise;
    private SceneCanvas scene;
    private int width;
    private int height;
    private int state1 = 0;
    //private int state2 = 0;
    private int day = 0;
    private Timer loopie;
    private JLabel areaClick;
    private File music;
    private Clip clip;

    
    public SceneFrame(int w, int h){
        frame = new JFrame();
        width = w;
        height = h;
       
        // rotate = new JButton("rotate");
        // clockwise = new JButton("clockwise");
        scene = new SceneCanvas(w, h);
        loopie = new Timer(100, this);
    }

    public void setUpGUI() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
        //Container contentPane = frame.getContentPane();
        scene.setPreferredSize(new Dimension(width,height));

        // JPanel buttons = new JPanel();
        // buttons.setLayout(new GridLayout(1,2));
        // buttons.add(rotate);
        // buttons.add(clockwise);

        music = new File("Symphony.AIFF");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(music);
        clip = AudioSystem.getClip();
        clip.open(audioStream);

        areaClick = new JLabel();
        areaClick.setBounds(692,510, 30, 30);
        areaClick.setOpaque(false);
        areaClick.addMouseListener(this);

        //contentPane.add(scene, "Center");
        //contentPane.add(buttons, BorderLayout.SOUTH);
        //contentPane.add(areaClick, BorderLayout.SOUTH);
        frame.add(areaClick);
        frame.add(scene);

        frame.setTitle("Midterm Project - Lopez - Nellas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setFocusable(true);
        frame.setVisible(true);


        // rotate.addActionListener(this);
        // clockwise.addActionListener(this);
        this.addMouseListener(this);
    }

    @Override 
    public void mouseClicked(MouseEvent e){
        if (e.getSource() == areaClick){
            state1+=1;
            if (state1%2 == 0) {
                if(!loopie.isRunning()){
                    loopie.start();
                    clip.start();
                }
            }
            else {
                if(loopie.isRunning()){
                    loopie.stop();
                    clip.stop();
                }
            }
        }

        // else if (e.getSource() == areaClick){
        // }
    }

    @Override
    public void mousePressed(MouseEvent e){

    }

    @Override
    public void mouseReleased(MouseEvent e){

    }

    @Override
    public void mouseEntered(MouseEvent e){

    }

    @Override
    public void mouseExited(MouseEvent e){

    }


    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == loopie){
            update();
        }
    }

    private void update(){
        Dolphin d = scene.getDolphin();
        RecordPlayer r = scene.getRecordPlayer();
        Fish1 f1 = scene.getFish1();
        Rainbow rb = scene.getRainbow();
        Sun sun = scene.getSun();
        Sky sky = scene.getSky();
        Stars stars = scene.getStars();

        d.rotate();
        sun.rotate();
        f1.moveLeft();
        sky.rotate();
        r.rotate();
        //stars.rotate();
        
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

        //starts
        if (day < 60 || day > 270) {
            stars.setTransparency(0);
        }
        if (day > 270 && day < 360) {
            stars.turnTransparent();
        }
        else {
            stars.turnOpaque();
        }

        System.out.println(stars.getTransparency());
        System.out.println("day: " + day);

        scene.repaint();

    }
}
    
    // public void setUpButtonListener(){
    //     ActionListener buttonListener = new ActionListener(){
    //         loopie = new Timer(10, buttonListener);

    //             public void actionPerformed(ActionEvent x){

    //                 JButton b = (JButton) x.getSource();
    //                 Dolphin d = scene.getDolphin();
    //                 RecordPlayer r = scene.getRecordPlayer();
    //                 Fish1 f1 = scene.getFish1();
    //                 Rainbow rb = scene.getRainbow();
    //                 Sun sun = scene.getSun();
        
    //                 System.out.println("hey loop");
    
    //                 if (b == rotate){
                        
    //                     // scene.run();
    //                     d.rotate();
    //                     sun.rotate();
    //                     f1.moveLeft();
    //                     day+=5;
    //                     if (day > 60 && day < 270) {
    //                         rb.setTransparency(0);
    //                     }
    //                     if (day <= 30 || day >= 270) {
    //                         state2 = 0;
    //                     }
    //                     else {
    //                         state2 = 1;
    //                     }
    //                     if (day == 360) {
    //                         day = 0;
    //                     }
    //                     if (day > 270 && day < 360) {
    //                         rb.turnOpaque();
    //                     }
    //                     else {
    //                         rb.turnTransparent();
    //                     }
    //                     System.out.println(rb.getTransparency());
    //                     System.out.println("day: " + day);
    //                 }    
    
    //                 // else if (b == clockwise){
    //                 //     d.rotateCC();
    //                 // }
    
    //                 scene.repaint();
                    
    //             }
            
    //     }
    //     rotate.addActionListener(buttonListener);
    //     clockwise.addActionListener(buttonListener);

    // }