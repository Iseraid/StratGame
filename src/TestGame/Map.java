/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestGame;

import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author Тест
 */
public class Map {
    
    int MapX;
    int MapY;
    public HexGrid HG;
                                                                    
    public Map(Point size) {
        MapX = size.x;
        MapY = size.y;
        HG = new HexGrid(size.x, size.y);
    }
    public Map(int x,int y) {
        MapX = x;
        MapY = y;
        HG = new HexGrid(x, y);
    }
    
    public void draw(Graphics g) {
        HG.draw(g);
    }
    
}
