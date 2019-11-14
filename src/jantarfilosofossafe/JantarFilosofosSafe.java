/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jantarfilosofossafe;

import java.util.concurrent.Semaphore;

/**
 *
 * @author T
 */
public class JantarFilosofosSafe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Semaphore semaforo = new Semaphore(1);

        Thread Filosofo1 = new Thread(new Runnable() {

            @Override
            public void run() {
                while (true) {
                    int fazer = (int) (Math.random() * 1);
                    switch (fazer) {
                        case 0:
                            System.out.println("filosofo 1 comendo");

                            break;
                        case 1:
                            System.out.println("filosofo 1 pensando");

                            break;
                    }
                }
            }
        });

    }

}
