package _99_extra.pong;

import processing.core.PApplet;
import processing.core.PImage;

public class Pong extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
   int x=50;
   int y=20;
   int xspeed = 9;
   int yspeed = 9;
   PImage backgroundImage;
   
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	backgroundImage = loadImage("pongbackground.jpg");
    	backgroundImage.resize(800, 600);
    }

    @Override
    public void draw() {
background(backgroundImage);
fill(245, 66, 179);
stroke(206, 66, 245);
ellipse(x,y,20,20);
x=x+xspeed;
if(x > width||x<0) {
	xspeed =-xspeed;
	
}
y=y+yspeed;
if(y > height||y<0) {
	yspeed=-yspeed;
}
if(mousePressed){
    println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");
}
fill(255, 0, 0);
stroke(255,0,0);
rect(mouseX,mouseY,80,5);
}



    static public void main(String[] args) {
        PApplet.main(Pong.class.getName());
    }
}