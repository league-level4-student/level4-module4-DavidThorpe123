package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    private int x;
    private int y;
    private int width = 50;
    private int height = 50;
    
    Polymorph(int x, int y, int width, int height){
   	 this.x = x;
   	 this.y = y;
   	 this.width = width;
   	 this.height = height;
    }
    public int getX() {
    	return x;
    }
    public int getY() {
    	return y;
    }
    public void setX(int x2) {
    	x = x2;
    }
    public void setY(int y2) {
    	y = y2;
    }
    public int getWidth() {
    	return width;
    }
    public int getHeight() {
    	return height;
    }
    public void setWidth(int width2) {
    	width = width2;
    }
    public void setHeight(int height2) {
    	height = height2;
    }
    
    
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);
}
