/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

/**
 *
 * @author sergey
 */
public class Unit {
    public Point GP;
    public Point HP;
    
    public Unit(int px, int py, boolean t){
        GP = new Point(0,0);
        HP = new Point(0,0);
        if(t){
            TBS.GlobalUnitCounter++;
            //
            GP.x = px;
            GP.y = py;
            HP = Map.GlobalToHexPoint(GP);
            System.out.printf("x = %d, y = %d \n n=%d \n", HP.x, HP.y, TBS.GlobalUnitCounter);
            TBS.currentMap.HG.Grid[HP.x][HP.y].HexUnitList.add(this);  
        }else{
            TBS.GlobalUnitCounter++;
            //
            HP.x = px;
            HP.y = py;
            int tmpGX = (int) Math.round((HP.x*TBS.hexSize+TBS.hexSize/2)/TBS.c30);
            GP = new Point(tmpGX,(int) Math.round((HP.y + 0.5)*TBS.hexSize+((HP.x%2)*TBS.hexSize*0.5)));//HexUnitList.size()//TBS.currentMap.HG.Grid[HP.x][HP.y].Building[1].BuildingType
            System.out.printf("x = %d, y = %d \n n=%d \n", HP.x, HP.y, TBS.GlobalUnitCounter);
            TBS.currentMap.HG.Grid[HP.x][HP.y].HexUnitList.add(this);
        }
    }
    
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.RED);
	g2d.drawRect(GP.x-5, GP.y-5, 10, 10);
    }
    
    public void MoveToPoint(int gx, int gy){
        GP.x = gx;
        GP.y = gy;
        HP = Map.GlobalToHexPoint(GP);
        TBS.currentMap.HG.Grid[HP.x][HP.y].HexUnitList.add(this);
    }
    
    public void DeleteUnit(int ulIndex){
        TBS.currentMap.HG.Grid[TBS.UnitList.get(ulIndex).HP.x][TBS.UnitList.get(ulIndex).HP.y].HexUnitList.remove(this);
        TBS.UnitList.remove(ulIndex);
    }
}
