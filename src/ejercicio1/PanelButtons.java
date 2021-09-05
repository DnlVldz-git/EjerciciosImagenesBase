/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;
/**
 *
 * @author dani_
 */
public class PanelButtons extends JPanel{
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    
    public PanelButtons(){
        super.setSize(800, 200);
        super.setBackground(Color.WHITE);
        super.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));    
        
        btn1 = new JButton("Cuadrante 1");
        btn2 = new JButton("Cuadrante 2");
        btn3 = new JButton("Cuadrante 3");
        btn4 = new JButton("Cuadrante 4");
        
        add(Box.createRigidArea(new Dimension(200, 0)));
        add(btn1);
        add(Box.createRigidArea(new Dimension(30, 0)));
        add(btn2);
        add(Box.createRigidArea(new Dimension(30, 0))); 
        add(btn3);
        add(Box.createRigidArea(new Dimension(30, 0)));
        add(btn4);                                        
    }

    public JButton getBtn1() {
        return btn1;
    }

    public JButton getBtn2() {
        return btn2;
    }

    public JButton getBtn3() {
        return btn3;
    }

    public JButton getBtn4() {
        return btn4;
    }
            
}
