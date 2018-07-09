/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestGame;

import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author Тест
 */
public class Map {
    
    int MapX;
    int MapY;
    public HexGrid HG;
    //public ArrayList<Unit> UnitList;
                                                                    
    public Map(Point size) {
        MapX = size.x;
        MapY = size.y;
        HG = new HexGrid(size.x, size.y);
        //UnitList = new ArrayList<>();
        //UnitList.add(new Unit(1,1,false));
        //UnitList.add(new Unit(10,80,true));
    }
    public Map(int x,int y) {
        MapX = x;
        MapY = y;
        HG = new HexGrid(x, y);
        //UnitList = new ArrayList<>();
    }
    
    public static Point GlobalToHexPoint(Point gp){
        int tmpX = (int) Math.floor(gp.x*TBS.c30/TBS.hexSize); 
        return new Point(tmpX,(int) Math.floor((gp.y-(tmpX%2)*TBS.hexSize/2)/TBS.hexSize));
    }
    
    public void draw(Graphics g) {
        HG.draw(g);
    }
    
}
