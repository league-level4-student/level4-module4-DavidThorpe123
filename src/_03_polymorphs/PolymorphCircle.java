package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class PolymorphCircle extends Polymorph {
	double angle = 0;

	PolymorphCircle(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(getX(), getY(), 50, 50);
	}

	public void update() {
		int x2 = getX();
		int y2 = getY();
		angle += 0.1;
		y2 += Math.sin(angle) * 10;
		x2 += Math.cos(angle) * 10;
		setY(y2);
		setX(x2);

	}

}