/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talpa;

/**
 *
 * @author Utente
 */

public class MoleThread extends Thread {

    private Gestore gameManager;

    public MoleThread(Gestore gameManager) {
        this.gameManager = gameManager;
    }

    @Override
    public void run() {

        while (true) {

            try {
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            gameManager.spawnMole();
        }
    }
}


