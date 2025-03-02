/** 
    This is the SceneStarter class which contains the main method. 
    It instantiates the SceneFrame object and calls its setUpGUI method.
	
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

import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class SceneStarter {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        SceneFrame scene = new SceneFrame(800, 600);
        scene.setUpGUI();
    }  
}