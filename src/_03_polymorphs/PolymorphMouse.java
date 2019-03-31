package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class PolymorphMouse extends Polymorph {

	PolymorphMouse(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(getX(), getY(), 50, 50);
	}

	public void update(int mX, int mY) {
		setX(mX);
		setY(mY);
	}

}