/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sounds;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class BGMusic {

    private Clip clip;
    private int loop;
    public BGMusic(int loop){
        this.loop = loop;
    }

    public void playBackgroundAudio(String fileName) {
        try {
            // Create a Clip instance
            this.clip = AudioSystem.getClip();

            // Open an audio file
            File file = new File(fileName);
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(file);

            // Load the audio data into the Clip instance
            this.clip.open(inputStream);

            // Start playing the audio in the background
            this.clip.loop(this.loop);

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public void stopBackgroundAudio() {
        if (this.clip != null) {
            this.clip.stop();
            this.clip.flush();
            this.clip.close();
        }
    }


}
