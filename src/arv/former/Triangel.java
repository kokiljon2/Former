/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arv.former;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author khaok01
 */
public class Triangel extends Form {

    private int bas;
    private int höjd;
    private boolean fylld;
    private int startX;
    private int startY;

    public Triangel(int yP, int xP, int b, int h, boolean f) {
        super(yP, xP);
        this.bas = b;
        this.höjd = h;
        this.fylld = f;
        color = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        int[] xPoints = {xPos, xPos + bas / 2, xPos + bas};
        int[] yPoints = {yPos, yPos - höjd, yPos};
        g.fillPolygon(xPoints, yPoints, 3);
    }

    @Override
    public String whatAmI() {
        return "Jag är Triangel";
    }

    @Override
    public double getArea() {
        return (bas * höjd) / 2;
    }
}
