/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication8;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Utente
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Creazione del frame (finestra principale)
        JFrame frame = new JFrame("Finestra Principale");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Creazione del pannello
        PannelloConSfondo panel = new  PannelloConSfondo();

        // Collegamento del pannello al frame
        frame.add(panel);

        // Rendo visibile la finestra
        frame.setVisible(true);
    }
    
}
