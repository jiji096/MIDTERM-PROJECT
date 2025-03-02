/** 
    This is the SceneCanvas class, which extends JComponent.
    It initializes an ArrayList of DrawingObjects, that stores
    all the elements added to the scene.

    @author Janelle Angela C. Lopez (242682)
    @author Aldrin Joseph T. Nellas (243215)
	@version February 15, 2025
	
	I have not discussed the Java language code in my program 
	with anyone other than my instructor or the teaching assistants 
	assigned to this course.

	I have not used Java language code obtained from another student, 
	or any other unauthorized source, either modified or unmodified.

	If any Java language code or documentation used in my program 
	was obtained from another source, such as a textbook or website, 
	that has been clearly noted with a proper citation in the comments 
	of my program.
**/

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class SceneCanvas extends JComponent { 
    private DrawingObject Null = null;
    private ArrayList<DrawingObject> elements = new ArrayList<>();
    
    public SceneCanvas(){
        
        Color blue = new Color(100,149,237);
        Color darkBlue = new Color(	66, 117, 209);

        elements.add(new Sky(400, 0, new Color( 176, 206, 255), 400, 600, new Color (59, 0, 100 )));
        elements.add(new Stars());
        elements.add(new Rainbow());
        elements.add(new Waves());
        elements.add(new Dolphin(400,1100));
        elements.add(new smallDolphin(200, 800));
        elements.add(new Sun());
        elements.add(new Cloud(105, 70, 70, darkBlue));
        elements.add(new Cloud(100,65,70,blue));
        elements.add(new Cloud(5, 80, 70, darkBlue));
        elements.add(new Cloud(0,75,70,blue));
        elements.add(new Cloud(525, 85, 70, darkBlue));
        elements.add(new Cloud(520,80,70,blue));
        elements.add(new Fish1());
        elements.add(new Fish2());
        elements.add(new Fish3());
        elements.add(new RecordPlayer(707.33,523));
        elements.add(new Chest());
        elements.add(new Ocean());
        elements.add(new Coral(0,new Color(76, 190, 193),new Color(53, 150, 147)));
        elements.add(new Coral(250, new Color(180, 221, 93), new Color(136, 166, 73)));
        elements.add(new Coral(610, new Color(159, 225, 255), new Color(93, 135, 155)));
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

    
    public DrawingObject getObject(String x) {
        for(DrawingObject y : elements) {
            if (y.getClass().toString().replaceAll("class ", "").equals(x)) return y;
        }
        return Null;
    }

}