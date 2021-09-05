/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;
/**
 *
 * @author dani_
 */
public class PnlBotn extends JPanel{
    private JButton btn;   
    
    public PnlBotn(){
        super.setSize(800, 200);
        super.setBackground(Color.WHITE);
        super.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));  
        
        btn = new JButton("Rotar");       
        add(Box.createRigidArea(new Dimension(400, 0)));
        add(btn);
       
    }    


    public JButton getBtn() {
        return btn;
    }
}
