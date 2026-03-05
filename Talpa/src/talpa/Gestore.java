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





public class Gestore {

    private JFrame frame;
    private JPanel panelCentro;
    private JLabel labelPunteggio;

    private Buca[] buche = new Buca[6];
    private int punteggio = 0;

    private Random random = new Random();
    private MoleThread moleThread;

    public Gestore() {

        frame = new JFrame("Whac A Mole");
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Pannello centro
        panelCentro = new JPanel();
        panelCentro.setLayout(new GridLayout(2, 3, 10, 10));

        for (int i = 0; i < 6; i++) {
            buche[i] = new Buca(this);
            panelCentro.add(buche[i]);
        }

        // Punteggio
        labelPunteggio = new JLabel("Punteggio: 0");
        labelPunteggio.setHorizontalAlignment(SwingConstants.CENTER);
        labelPunteggio.setFont(new Font("Arial", Font.BOLD, 20));

        frame.add(panelCentro, BorderLayout.CENTER);
        frame.add(labelPunteggio, BorderLayout.SOUTH);

        frame.setVisible(true);

        // Avvio thread
        moleThread = new MoleThread(this);
        moleThread.start();
    }

    public void spawnMole() {

        int index = random.nextInt(6);

        buche[index].mostraTalpa();

        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        buche[index].nascondiTalpa();
    }

    public void aggiungiPunti(int punti) {
        punteggio += punti;
        labelPunteggio.setText("Punteggio: " + punteggio);
    }
}
