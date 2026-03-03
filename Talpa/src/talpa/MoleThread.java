/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talpa;

/**
 *
 * @author Utente
 */

import javax.swing.*;
import java.awt.*;
import java.util.Random;


public class MoleThread extends Thread {
    
    
     private JPanel[] buche;
     private Random random = new Random();
     
     public MoleThread(JPanel[] buche) {
        this.buche = buche;
    }
     
      @Override
    public void run() {

        while (true) {

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                break;
            }

            int index = random.nextInt(buche.length);

            SwingUtilities.invokeLater(() ->
                    buche[index].setBackground(Color.GREEN)
            );

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }

            SwingUtilities.invokeLater(() ->
                    buche[index].setBackground(new Color(139, 69, 19))
            );
        }
    }
}
