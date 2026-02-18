/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication8;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Utente
 */
public class PannelloConSfondo extends panello{
    
     private Image immagine;

    public PannelloConSfondo() {
        // Percorso immagine (dal desktop)
       ImageIcon icon = new ImageIcon("img/prato.jpg");
        immagine = icon.getImage();
    }
    

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(immagine, 0, 0, getWidth(), getHeight(), this);
    }

    
}
