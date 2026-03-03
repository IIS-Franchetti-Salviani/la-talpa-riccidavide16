/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package talpa;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Utente
 */
public class TalpaMain {

   static JPanel[] buche = new JPanel[6];
   
    public static void main(String[] args) {
        // TODO code application logic here
    // Creazione finestra
        JFrame frame = new JFrame("Whac A Mole");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // Pannello principale con griglia 2x3
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 3, 10, 10));
        panel.setBackground(Color.DARK_GRAY);

        // Creazione 6 buche
        for (int i = 0; i < 6; i++) {
            buche[i] = new JPanel();
            buche[i].setBackground(new Color(115, 39, 20)); // marrone
            panel.add(buche[i]);
        }

        frame.add(panel);
        frame.setVisible(true);

        // THREAD TALPA
        Thread moleThread = new Thread(new Runnable() {

            Random random = new Random();

            @Override
            public void run() {

                while (true) {

                    try {
                        Thread.sleep(2000); // tempo tra una talpa e l'altra
                    } catch (InterruptedException e) {
                        break;
                    }

                    int index = random.nextInt(6);

                    // Mostra talpa (verde)
                    SwingUtilities.invokeLater(() ->
                            buche[index].setBackground(Color.GREEN)
                    );

                    try {
                        Thread.sleep(1000); // tempo visibile
                    } catch (InterruptedException e) {
                        break;
                    }

                    // Nasconde talpa (marrone)
                    SwingUtilities.invokeLater(() ->
                            buche[index].setBackground(new Color(139, 69, 19))
                    );
                }
            }
        });

        moleThread.start();
    }
}
    
