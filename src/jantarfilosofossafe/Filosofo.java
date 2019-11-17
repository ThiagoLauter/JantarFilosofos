/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jantarfilosofossafe;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aluno
 */
public class Filosofo extends Thread {

    private int idFilosofo;

    public void pensa() {
        System.out.println("Filosofo " + idFilosofo + " pensando...");
        try {
            sleep((int) (Math.random() * 50000));
        } catch (InterruptedException ex) {
            System.out.println("Erro quando " + idFilosofo + " quis pensar");
        }
    }

    public void come() {
        int esquerda = idFilosofo;
        int direita = (idFilosofo + 1) % Mesa.garfos.size();
        try {
            System.out.println("Filosofo " + idFilosofo + " pensou em pegar os garfos.");
            if (Mesa.garfos.get(esquerda).availablePermits() > 0 & Mesa.garfos.get(direita).availablePermits() > 0) {
                Mesa.garfos.get(esquerda).acquire();
                System.out.println("Filosofo " + idFilosofo + " pegou garfo esquerdo.");
                Mesa.garfos.get(direita).acquire();
                System.out.println("Filosofo " + idFilosofo + " pegou garfo direito.");
                System.out.println("Filosofo " + idFilosofo + " comendo...");
                sleep((int) (Math.random() * 10000));
                System.out.println("Filosofo " + idFilosofo + " soltando garfos");
                Mesa.garfos.get(esquerda).release();
                Mesa.garfos.get(direita).release();
                System.out.println("Filosofo " + idFilosofo + " soltou garfos");

            } else {
                System.out.println("Filosofo " + idFilosofo + " viu que um ou mais garfos não estavam disponíveis.");
            }
        } catch (InterruptedException ex) {
            System.out.println("Filosofo " + idFilosofo + " foi interrompido");
        }
    }

    public void existe() {
        while (true) {
            this.pensa();
            this.come();
        }
    }

    @Override
    public void run() {
        this.existe();
    }

    public Filosofo(int id) {
        this.idFilosofo = id;
    }
}
