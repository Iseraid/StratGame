/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Тест
 */
public class Hex {
    
    public HashMap<String,Float> attribute;
    public Construction Building[];
    public ArrayList<Unit> HexUnitList;
    
    public Hex() {
        
        attribute = new HashMap();
        //attribute.put("Лес", new Float(0.1));
        Building = new Construction[3];
        for (int i = 0; i<3; i++)
        {
            Building[i] = new Construction();
        }
        HexUnitList = new ArrayList<>();
        
    }
    
    public void draw(int x, int y, Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.RED);
	g2d.drawOval(x, y, TBS.hexSize, TBS.hexSize);
        //
        for(int i=0; i<HexUnitList.size(); i++){
            //System.out.println("Program ended (very nice1)");
            HexUnitList.get(i).draw(g);
        }
    }
    public void drawConstructions(int x, int y, Graphics g) {
        
    }
    
    
}

