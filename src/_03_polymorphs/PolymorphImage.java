package _03_polymorphs;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PolymorphImage extends Polymorph {
	BufferedImage bi;

	PolymorphImage(int x, int y, int width, int height) {
		super(x, y, width, height);
		try {
			bi = ImageIO.read(this.getClass().getResourceAsStream("fog.png"));
		} catch (IOException e) {
			e.getStackTrace();
		}
	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(bi, getX(), getY(), null);
	}

	public void update() {

	}

}