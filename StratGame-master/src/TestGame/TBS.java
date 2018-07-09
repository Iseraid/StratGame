/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestGame;

import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Тест
 */
public class TBS {

    /*
     * @param args the command line arguments
     */
    
    //public static TestGame Game;
    public static Map currentMap;
    public static ArrayList<Unit> UnitList;
    
    public static GrPanel panel;
    public static int hexSize = 60;
    
    public static double c30 = 1.0/Math.cos(Math.toRadians(30));
    
    public static int GlobalUnitCounter = 0;
    
    public static void draw(Graphics g) {
        currentMap.draw(g);        
    }
    
    public static void RunTheGame(){
        
        
    };
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //генератор карты для игры
        //
        //
        
        Point mapSize = XYDlg("Enter map size");
        if ((mapSize.x==0) && (mapSize.y==0)){
            return;
        }
        currentMap = new Map(mapSize);
        TBS.UnitList = new ArrayList<>();
        for(int i=0; i<currentMap.MapX; i++){
            for(int i1=0; i1<currentMap.MapY; i1++){
               TBS.UnitList.add(new Unit(i,i1,false)); 
               //TBS.UnitList.get(0).DeleteUnit(0);
            }
        }
        UnitList.add(new Unit(10,80,true));
        TBS.UnitList.get(3).DeleteUnit(3);
        JFrame frame = new JFrame("Celtic Bumblebee");
        panel = new GrPanel();
        frame.add(panel);
        frame.setSize(1024, 768);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        //System.out.println("Запущен TestGame.java");
        
        /*Scanner scan = new Scanner(System.in);          //редактор карты
        System.out.println("Введите размеры карты:");
        int x = scan.nextInt();
        int y = scan.nextInt();
        
        Map TMap = new Map(x,y);
        
        System.out.println("Введите координаты 'особеннной' точки:");
        int hx = scan.nextInt();
        int hy = scan.nextInt();
        TMap.HG.Grid[hx-1][hy-1].p.setProperty("Test", "1");
        //TMap.HG.Grid[hx-1][hy-1].test = 1;
        
        System.out.println("");
        for (int j = 0; j < y; j++)
            for (int i = 0; i < x; i++){
                //if ((i == hx-1)&(j == hy-1)) {
                if ("1".equals(TMap.HG.Grid[i][j].p.getProperty("Test"))){
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }
                
                //System.out.print(TMap.HG.Grid[i][j].p.getProperty("Test"));
                
                
                if (i == x-1)
                    System.out.println("");
            
            
        }*/
        
        
        System.out.println("Program ended (very nice)");
        
    }
    
    public static Point XYDlg(String caption){
        JTextField xField = new JTextField();
        JTextField yField = new JTextField(); 
        Object[] message = {
            "X:", xField,
            "Y:", yField
        };

        int option = JOptionPane.showConfirmDialog(null, message, caption, JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            int mx = Integer.parseInt(xField.getText());
            int my = Integer.parseInt(yField.getText());
            if (mx>0 && my>0){
                return new Point(mx,my);
            } else {
                return new Point (0,0);
            }
        } else {
            return new Point (0,0);
        }
    }
    
}
