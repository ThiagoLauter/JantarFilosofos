/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jantarfilosofossafe;



/**
 *
 * @author aluno
 */
public class Filosofo extends Thread {

    private int idFilosofo;

    public void pensa() {
        try {
            sleep((int) (Math.random() * 200));
        } catch (InterruptedException ex) {
            System.out.println("Erro quando " + idFilosofo + " quis pensar");
        }
    }

    public void come() {
        int esquerda = idFilosofo%Mesa.garfos.size();
        int direita = idFilosofo-1;
        if (Mesa.garfos.get(esquerda).availablePermits() > 0 & Mesa.garfos.get(direita).availablePermits() > 0) {
            try {

                Mesa.garfos.get(esquerda).acquire();
                Mesa.garfos.get(direita).acquire();
                Mesa.dados.set(esquerda, idFilosofo);
                Mesa.dados.set(direita, idFilosofo);
                Mesa.mostarDados();
                sleep((int) (Math.random() * 200));
            } catch (InterruptedException ex) {
                System.out.println("deu ruim");
            }
            Mesa.dados.set(esquerda, 0);
            Mesa.dados.set(direita, 0);
            Mesa.mostarDados();
            Mesa.garfos.get(esquerda).release();
            Mesa.garfos.get(direita).release();
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
