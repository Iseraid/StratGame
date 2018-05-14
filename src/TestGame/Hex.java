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
    public Properties p;
    public Construction Building[];
    //int test;
    
    public Hex() {
        
        //test = 0;
        attribute = new HashMap();
        //attribute.put("Лес", new Float(0.1));
        p = new Properties();
        Building = new Construction[6];
        for (int i = 0; i<6; i++)
        {
            Building[i] = new Construction();
        }
        //p.setProperty(key, value);  //Добавить ключи!!!1!11Ё!1!
        
    }
    
    public void draw(int x, int y, Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.RED);
	g2d.drawOval(x, y, TestGame.hexSize, TestGame.hexSize);
    }
    public void drawConstructions(int x, int y, Graphics g) {
        
    }
    
    
}

