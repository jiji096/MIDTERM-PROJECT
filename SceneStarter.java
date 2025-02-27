import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class SceneStarter {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        SceneFrame scene = new SceneFrame(800, 600);
        scene.setUpGUI();
        //scene.setUpButtonListener();

    }

}