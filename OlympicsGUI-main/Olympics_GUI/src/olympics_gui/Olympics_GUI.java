/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package olympics_gui;
// DUO: Alejandra Reyes & Hanne Mendoza

import GamesFront.Games;
import java.util.Scanner;


public class Olympics_GUI {  
        
        public static void main(String args[]) {        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Games.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Games.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Games.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Games.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
            Scanner leer = new Scanner (System.in);
            System.out.println("* * * * * M E N U * * * * * ");
            System.out.println("1. GUI Olympics");
            System.out.println("2. ATM");
            System.out.println("3. Salir del programa");
            int opcion = leer.nextInt();
            
            while (opcion>0 && opcion<3){
                switch (opcion){
                  case 1:
                    new Games().setVisible(true);
                    break;
                    
                  case 2:
                      break;
                      
                  default:
                      System.exit(0);
                         
                }
                
            System.out.println("* * * * * M E N U * * * * * ");
            System.out.println("1. GUI Olympics");
            System.out.println("2. ATM");
            System.out.println("3. Salir del programa");
            opcion = leer.nextInt();
            }
            
           
            
    }
}
    

