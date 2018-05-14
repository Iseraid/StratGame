/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestGame;

/**
 *
 * @author Тест
 */
public class Map {
    
    int MapX;
    int MapY;
    public HexGrid HG;
                                                                    
    public Map(int x,int y) {
        
        MapX = x;
        MapY = y;
        HG = new HexGrid(x, y);
        
        
    }
    
}
