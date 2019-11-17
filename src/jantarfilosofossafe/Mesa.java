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

    public static void quantidade(final int qg) {
        garfos = new ArrayList<Semaphore>(qg);
        for (int i = 0; i < qg; i++) {
            garfos.add(new Semaphore(1));
        }
    }
}
