/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestGame;

import java.util.Properties;

/**
 *
 * @author Тест
 */
public class Hex {
    
    public Properties p;
    public Construction Building[];
    //int test;
    
    public Hex() {
        
        //test = 0;
        p = new Properties();
        Building = new Construction[6];
        for (int i = 0; i<6; i++)
        {
            Building[i].BuildingType = 0;
        }
        //p.setProperty(key, value);  //Добавить ключи!!!1!11Ё!1!
        
    }
    
    
}

