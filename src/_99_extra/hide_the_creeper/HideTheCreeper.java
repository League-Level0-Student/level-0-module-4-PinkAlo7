package _99_extra.hide_the_creeper;

import processing.core.PApplet;
import processing.core.PImage;

public class HideTheCreeper extends PApplet {
	static final int WIDTH = 600;
	static final int HEIGHT = 600;
	PImage creeper;
	// @Override
	int x = 4;
	int y = 595;

	public void settings() {
		size(WIDTH, HEIGHT);

	}

	@Override
	public void setup() {
		PImage minecraft = loadImage("minecraft.png");
		minecraft.resize(WIDTH, HEIGHT);
		background(minecraft);
		creeper = loadImage("creeper.png");
		creeper.resize(10, 10);

	}

	@Override
	public void draw() {
		image(creeper, x, y);
		if (mousePressed) {
			println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");
			
			
		if(isNear(mouseX,x) && isNear(mouseY,y)) {
		
			fill(0,255,0);
		}
		else { 
			fill(255, 0, 0);
		}
		ellipse(mouseX, mouseY, 13, 13);
		}
	}

	boolean isNear(int a, int b) {
		if (abs(a - b) < 10)
			return true;
		else
			return false;
	}

	static public void main(String[] args) {
		PApplet.main(HideTheCreeper.class.getName());
	}
}
