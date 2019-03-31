package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseMotionListener, MouseListener {
	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;

	private JFrame window;
	private Timer timer;

	// Polymorph bluePoly;
	// Polymorph redPoly;
	// Polymorph movingPoly;
	ArrayList<Polymorph> pm = new ArrayList<>();

	public static void main(String[] args) {
		new PolymorphWindow().buildWindow();
	}

	public void buildWindow() {
		window = new JFrame("IT'S MORPHIN' TIME!");
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);
		window.addMouseMotionListener(this);
		window.addMouseListener(this);
		pm.add(new BluePolymorph(60, 80, 50, 50));
		pm.add(new RedPolymorph(55, 55, 50, 50));
		pm.add(new MovingPolymorph(50, 50, 50, 50));
		pm.add(new MovingPolymorph(50, 10, 50, 50));
		pm.add(new PolymorphCircle(300, 300, 70, 70));
		pm.add(new PolymorphMouse(300, 300, 50, 50));
		pm.add(new PolymorphImage(400, 400, 50, 50));
		pm.add(new PolymorphJOption(100, 100, 50, 50));
		// bluePoly = new BluePolymorph(50, 50, 50, 50);
		// redPoly = new RedPolymorph(100, 100, 50, 50);
		// movingPoly = new MovingPolymorph(200, 100, 50, 50);
		timer = new Timer(1000 / 30, this);
		timer.start();
	}

	public void paintComponent(Graphics g) {
		// draw background
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 500, 500);
		// redPoly.draw(g);
		// draw polymorph
		// bluePoly.draw(g);
		// movingPoly.draw(g);
		for (Polymorph p : pm) {
			p.draw(g);
			p.update();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		// bluePoly.update();
		// redPoly.update();
		// movingPoly.update();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

		for (Polymorph p : pm) {
			if (p instanceof PolymorphMouse) {
				((PolymorphMouse) p).update(e.getX(), e.getY());
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("df");
		for (Polymorph p : pm) {
			if (p instanceof PolymorphJOption) {
				if (e.getX() > p.getX() && e.getX() < p.getX() + 50 && e.getY() > p.getY()
						&& e.getY() < p.getY() - 50) {
					JOptionPane.showMessageDialog(null, "Hello");
				}
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
