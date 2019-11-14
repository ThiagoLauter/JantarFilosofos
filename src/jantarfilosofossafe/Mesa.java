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
    public ArrayList<Semaphore> garfos; 

    public Mesa() {
        this.garfos = new ArrayList<>();
    }  
}
