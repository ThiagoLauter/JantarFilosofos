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
            sleep((int) (Math.random() * 500));
        } catch (InterruptedException ex) {
            Logger.getLogger(Filosofo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void come() {

        int esquerda = idFilosofo;
        int direita = (idFilosofo + 1) % .Mesa.garfos.size();

        System.out.println("Filosofo " + idFilosofo + " pegando garfos");
        Mesa.garfos[esquerda].acquire;
        Mesa.garfos[diretita].acquire;
        System.out.println("Filosofo " + idFilosofo + " comendo...");
        try {
            sleep((int) (Math.random() * 1000));
        } catch (InterruptedException ex) {
            Logger.getLogger(Filosofo.class.getName()).log(Level.SEVERE, null, ex);

        }
        System.out.println("Filosofo " + idFilosofo + " soltando garfos");
        Mesa.garfos[esquerda].acquire;
        Mesa.garfos[diretita].rele;

    }

    public void existe() {
        while (true) {
            pensa();
            come();
        }
    }
    
    public Filosofo(int id){
      idFilosofo = id;  
    }
}
