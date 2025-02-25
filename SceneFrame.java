import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SceneFrame extends JComponent implements ActionListener { 
    private JFrame frame;
    private JButton rotate, clockwise;
    private SceneCanvas scene;
    private int width;
    private int height;
    private int state1 = 0;
    private int state2 = 0;
    private int day = 0;
    private Timer loopie;
    
    public SceneFrame(int w, int h){
        frame = new JFrame();
        width = w;
        height = h;
       
        rotate = new JButton("rotate");
        clockwise = new JButton("clockwise");
        scene = new SceneCanvas(w, h);

        loopie = new Timer(20, this);
    }

    public void setUpGUI(){
        Container contentPane = frame.getContentPane();
        scene.setPreferredSize(new Dimension(width,height));

        JPanel buttons = new JPanel();
        buttons.setLayout(new GridLayout(1,2));
        buttons.add(rotate);
        buttons.add(clockwise);

        contentPane.add(scene, "Center");
        contentPane.add(buttons, BorderLayout.SOUTH);

        frame.setTitle("Midterm Project - Lopez - Nellas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setFocusable(true);
        frame.setVisible(true);

        rotate.addActionListener(this);
        clockwise.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        //JButton b = (JButton) e.getSource();

        if (e.getSource() == loopie){
            update();
        }

        else if (e.getSource() == rotate){
            if(!loopie.isRunning()){
                loopie.start();
            }
        }

        else if (e.getSource() == clockwise){
            if(loopie.isRunning()){
                loopie.stop();
            }
        }
    }

    private void update(){
        Dolphin d = scene.getDolphin();
        RecordPlayer r = scene.getRecordPlayer();
        Fish1 f1 = scene.getFish1();
        Rainbow rb = scene.getRainbow();
        Sun sun = scene.getSun();
        Sky sky = scene.getSky();

        d.rotate();
        sun.rotate();
        f1.moveLeft();
        sky.rotate();
        
        day+=5;
        if (day > 60 && day < 270) {
            rb.setTransparency(0);
        }
        if (day <= 30 || day >= 270) {
            state2 = 0;
        }
        else {
            state2 = 1;
        }
        if (day == 360) {
            day = 0;
        }
        if (day > 270 && day < 360) {
            rb.turnOpaque();
        }
        else {
            rb.turnTransparent();
        }
        System.out.println(rb.getTransparency());
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