/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.HashMap;
import java.util.Properties;

/**
 *
 * @author Тест
 */
public class Hex {
    
    public HashMap<String,Float> attribute;
    public Construction Building[];
    
    public Hex() {
        
        attribute = new HashMap();
        //attribute.put("Лес", new Float(0.1));
        Building = new Construction[6];
        for (int i = 0; i<6; i++)
        {
            Building[i] = new Construction();
        }
        
    }
    
    public void draw(int x, int y, Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.RED);
	g2d.drawOval(x, y, TestGame.hexSize, TestGame.hexSize);
    }
    public void drawConstructions(int x, int y, Graphics g) {
        
    }
    
    
}

