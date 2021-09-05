/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;
import java.awt.BorderLayout;
import javax.swing.*;
/**
 *
 * @author dani_
 */
public class PrincipalFrame extends JFrame{
    private PnlBotn pnlBtn;
    
    public PrincipalFrame(){
        super.setSize(900, 700);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(new BorderLayout());
        
        pnlBtn = new PnlBotn();
        
        add(pnlBtn);
        
        super.setVisible(true);               
    }
    
     public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ejercicio1.PrincipalFrame();

            }
        });
    }
        
}
