/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arv.former;

import java.awt.Color;
import java.awt.Point;
import java.awt.Graphics;
import java.io.Serializable;

/**
 *
 * @author khaok01
 */
public abstract class Form implements Serializable{

    protected int yPos;
    protected int xPos;
    protected boolean running=false;
    protected boolean positivRiktning;
    protected Color color;
    protected boolean Höger =true;
    protected int width;

    public Form(int yP, int xP) {
        this.yPos = yP;
        this.xPos = xP;
    }

    public int getXpos() {
        return this.xPos;
    }

    public int getYpos() {
        return this.yPos;
    }

    public Point getPos() {
        return new Point(xPos, yPos);
    }

    public void setRunning(boolean run) {
        this.running = run;
    }
    
    public void getWidth(int w){
        this.width=w;
    }

    public void move(int x, int y) {
        if(Höger){
            xPos+=5;
            if(xPos>450){
                Höger=false;
            }
        }else{
            xPos-=5;
            if(xPos<000){
                Höger=true;
            }
        }
    }

    public abstract void draw(Graphics g);

    public abstract String whatAmI();

    public abstract double getArea();

}
