/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import ejercicio2.*;

/**
 *
 * @author dani_
 */
public class PrincipalFrame extends JFrame {

    private JPanelImagen pnlImage1;
    private JPanelImagen pnlImage2;
    private PanelButtons pnlBtns;
    private JButton btnEj1;
    private JButton btnEj2;
    private JPanel pnl;
    private JPanelImagen2 pnlImage3;
    private PnlBotn pnlBtn;

    public PrincipalFrame() {

        super.setSize(300, 200);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(new BorderLayout());
        super.setLocationRelativeTo(null);

        pnlBtns = new PanelButtons();
        pnlImage1 = new JPanelImagen("img.png");

        pnl = new JPanel();

        btnEj1 = new JButton("Ejercicio 1");
        btnEj2 = new JButton("Ejercicio 2");

        pnlImage3 = new JPanelImagen2("img_orig.png");
        pnlBtn = new PnlBotn();

        pnl.setSize(900, 700);

        pnl.add(Box.createRigidArea(new Dimension(0, 100)));
        pnl.add(btnEj1);
        pnl.add(btnEj2);

        add(pnl);

        btnEj1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                remove(pnl);
                add(pnlImage1, BorderLayout.CENTER);
                add(pnlBtns, BorderLayout.SOUTH);
                setSize(900, 700);
            }
        });

        btnEj2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                remove(pnl);
                add(pnlImage3, BorderLayout.CENTER);
                add(pnlBtn, BorderLayout.SOUTH);
                setSize(900, 700);
            }
        });

        pnlBtn.getBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                                                                                                   
                    BufferedImage img_orig = ImageIO.read(new File("img_orig.png"));
                    
                    BufferedImage img = new BufferedImage(img_orig.getHeight(), img_orig.getWidth(),BufferedImage.TYPE_INT_RGB);
                    //ancho
                    for (int x = 0; x < img_orig.getHeight(); x++) {
                        //alto
                        for (int y = 0; y <  img_orig.getWidth(); y++) {

                            Color nuevoColor = new Color(img_orig.getRGB(y, x));

                            img.setRGB(x, y, nuevoColor.getRGB());

                        }
                    }
                    ImageIO.write(img, "png", new File("img_rotada.png"));
                    remove(pnlImage3);
                    pnlImage3 = new JPanelImagen2("img_rotada.png");
                    add(pnlImage3);
                    setSize(700, 900);
                    setSize(700, 900);
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        pnlBtns.getBtn1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {

                    BufferedImage img = ImageIO.read(new File("img.png"));

                    //ancho
                    for (int x = 0; x < img.getWidth() / 2; x++) {
                        //alto
                        for (int y = 0; y < img.getHeight() / 2; y++) {

                            Color nuevoColor = new Color(255, 255, 255);

                            img.setRGB(x, y, nuevoColor.getRGB());

                        }
                    }
                    ImageIO.write(img, "png", new File("img2.png"));
                    remove(pnlImage1);
                    pnlImage1 = new JPanelImagen("img2.png");
                    add(pnlImage1);
                    setSize(900, 701);
                    setSize(900, 700);
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }

            }
        });

        pnlBtns.getBtn2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    BufferedImage img = ImageIO.read(new File("img.png"));
                    //ancho
                    for (int x = img.getWidth() / 2; x < img.getWidth(); x++) {
                        //alto
                        for (int y = 0; y < img.getHeight() / 2; y++) {

                            Color nuevoColor = new Color(255, 255, 255);

                            img.setRGB(x, y, nuevoColor.getRGB());

                        }
                    }
                    ImageIO.write(img, "png", new File("img2.png"));
                    remove(pnlImage1);
                    pnlImage1 = new JPanelImagen("img2.png");
                    add(pnlImage1);
                    setSize(900, 701);
                    setSize(900, 700);
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        pnlBtns.getBtn3().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    BufferedImage img = ImageIO.read(new File("img.png"));
                    //ancho
                    for (int x = 0; x < img.getWidth() / 2; x++) {
                        //alto
                        for (int y = img.getHeight() / 2; y < img.getHeight(); y++) {

                            Color nuevoColor = new Color(255, 255, 255);

                            img.setRGB(x, y, nuevoColor.getRGB());

                        }
                    }
                    ImageIO.write(img, "png", new File("img2.png"));
                    remove(pnlImage1);
                    pnlImage1 = new JPanelImagen("img2.png");
                    add(pnlImage1);
                    setSize(900, 701);
                    setSize(900, 700);
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        pnlBtns.getBtn4().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    BufferedImage img = ImageIO.read(new File("img.png"));
                    //ancho
                    for (int x = img.getWidth() / 2; x < img.getWidth(); x++) {
                        //alto
                        for (int y = img.getHeight() / 2; y < img.getHeight(); y++) {

                            Color nuevoColor = new Color(255, 255, 255);

                            img.setRGB(x, y, nuevoColor.getRGB());

                        }
                    }
                    ImageIO.write(img, "png", new File("img2.png"));
                    remove(pnlImage1);
                    pnlImage1 = new JPanelImagen("img2.png");
                    add(pnlImage1);
                    setSize(900, 701);
                    setSize(900, 700);
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        });
        
        

        super.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PrincipalFrame();

            }
        });
    }

}
