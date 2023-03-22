package _99_extra.pin_the_tail;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import processing.core.PApplet;
import processing.core.PImage;

public class PinTheTail extends PApplet {
    static final int WIDTH = 840;
    static final int HEIGHT = 1373;
    PImage donkey;
    PImage tail;
	private PImage pink;
   // @Override
   int x = 626;
    int y = 649;
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        donkey = loadImage("donkey.jpg");
        tail = loadImage("tail.png");
        pink = loadImage("pink backround.jpg");
        pink.resize(WIDTH,HEIGHT);
        size(WIDTH,HEIGHT);
        tail.resize(365,365);
    }

    @Override
    
    public void draw() {
        background (donkey);
        rect(0,0,30,30);
        
        if (dist(0,0,mouseX,mouseY)<30) {
        background(donkey);
        }
        else {
        	background(pink);
        }
        
        
        image(tail, x, y);
        if (mousePressed) {
        	background(donkey);
        	x = mouseX;
			y = mouseY;
        	if(dist(x,y,626,649) <13) {
        		playWhoohoo();
        		
        	}
			println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");
			
				
        }
        
    }

    

	static public void main(String[] args) {
        PApplet.main(PinTheTail.class.getName());
    }
    
    /*********************** DO NOT MODIFY THE CODE BELOW ********************/

    Clip clip = null;

    public void playDoh() {
        if (clip == null || !clip.isActive()) {
            clip = playSound("homer-doh.wav");
        }
    }

    public void playWhoohoo() {
        if (clip == null || !clip.isActive()) {
            clip = playSound("homer-woohoo.wav");
        }
    }

    public Clip getSong(String fileName) {
        String path = "src/";
        Clip clip = null;

        // Note: use .wav files
        try {
            clip = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File(path + fileName));
            clip.open(inputStream);
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage() + " for " + path + fileName);
        }

        return clip;
    }

    public Clip playSound(String fileName) {
        final Clip clip = getSong(fileName);

        new Thread(new Runnable() {
            @Override
            public void run() {
                clip.start();
            }
        }).start();

        return clip;
    }
}
