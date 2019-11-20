/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jantarfilosofossafe;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;

/**
 *
 * @author aluno
 */
public class Mesa {
    public static ArrayList<Semaphore> garfos;
    static ArrayList<Integer> dados;

    public static void quantidade(final int qg) {
        garfos = new ArrayList<Semaphore>(qg);
        for (int i = 0; i < qg; i++) {
            garfos.add(new Semaphore(1));
        }
        dados = new ArrayList<Integer>(qg);
        for (int i = 0; i < qg; i++) {
            dados.add(i,0);
        }
    }

    public static void mostarDados() {
        for (int i = 0; i < dados.size(); i++) {
            System.out.printf(dados.get(i)+"\t");
        }
        System.out.printf("\n");
    } 
}
