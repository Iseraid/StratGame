/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestGame;

import java.awt.Graphics;

/**
 *
 * @author Тест
 */
public class HexGrid {
    
    public Hex Grid[][];
            
    public HexGrid(int x, int y) {
        
        Grid = new Hex[x][y];
        for (int j = 0; j < y; j++)
            for (int i = 0; i < x; i++){
                Grid[i][j] = new Hex();
            }   
    }
    
    public void draw(Graphics g){
        for (int j = 0; j<Grid[0].length; j++){
            for (int i = 0; i<Grid.length; i++){
                Grid[i][j].draw(i*TestGame.hexSize+((j%2)*TestGame.hexSize/2),j*(TestGame.hexSize*9/10),g);
            }
        }
    }
    
}
