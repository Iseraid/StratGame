/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestGame;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Vectarrio
 */
public class GrPanel extends JPanel {
    
    @Override
    public void paint(Graphics g) {
        TestGame.draw(g);
    }
}
