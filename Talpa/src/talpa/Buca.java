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
import java.awt.event.*;

public class Buca extends JButton {

    private boolean haTalpa = false;
    private Gestore gameManager;

    public Buca(Gestore gameManager) {
        this.gameManager = gameManager;

        setBackground(Color.BLACK);

        addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (haTalpa) {
                    gameManager.aggiungiPunti(10);
                    nascondiTalpa();
                }
            }
        });
    }

    public void mostraTalpa() {
        haTalpa = true;
        setBackground(Color.GREEN);
    }

    public void nascondiTalpa() {
        haTalpa = false;
        setBackground(Color.BLACK);
    }
}