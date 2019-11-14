/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author T
 */
public class Filosofo {
    //Atributos
    String nome;
    public Filosofo(String nome) {
        
    }

    public void existe() {
        while (true) {
            int fazer = (int) (Math.random() * 1);
            switch (fazer) {
                case 0:
                    System.out.println("filosofo "+nome+" quer comer");
                    
                    break;
                case 1:
                    
                    System.out.println("filosofo " + nome + " pensando");
                    break;
            }
        }
    }
}
