/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestGame;

import java.util.Scanner;

/**
 *
 * @author Тест
 */
public class TestGame {

    /*
     * @param args the command line arguments
     */
    
    //public static TestGame Game;
    public static Map CurrentMap;
    
    public static void RunTheGame(){
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        }); 
    };
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //генератор карты для игры
        //
        //
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new StartFrame().setVisible(true);
        });
        
        

        
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
    
}
