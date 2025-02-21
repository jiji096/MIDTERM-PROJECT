import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class SceneFrame extends JComponent { 
    private JFrame frame;
    private JButton rotate, clockwise;
    private SceneCanvas scene;
    private int width;
    private int height;
    
    public SceneFrame(int w, int h){
        frame = new JFrame();
        width = w;
        height = h;
       
        rotate = new JButton("rotate");
        clockwise = new JButton("clockwise");

        scene = new SceneCanvas(w, h);
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

        frame.setTitle("ERMMMM");
        //frame.add(scene);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void setUpButtonListener(){
        ActionListener buttonListener = new ActionListener(){
            public void actionPerformed(ActionEvent x){
                JButton b = (JButton) x.getSource();
                Dolphin d = scene.getDolphin();

                if (b == rotate){
                    d.rotate();
                }

                else if (b == clockwise){
                    d.rotateCC();
                }

                scene.repaint();
            }
            
        };
        rotate.addActionListener(buttonListener);
        clockwise.addActionListener(buttonListener);

    }
}