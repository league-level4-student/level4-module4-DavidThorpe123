package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class PolymorphJOption extends Polymorph {
	BufferedImage bi;

	PolymorphJOption(int x, int y, int width, int height) {
		super(x, y, width, height);

	}

	@Override
	public void draw(Graphics g) {
		//System.out.println("pX " + getX());
		//System.out.println("pY " + getY());
		g.setColor(Color.BLACK);
		g.fillRect(getX(), getY(), 50, 50);
	}

	public void update() {

	}

}