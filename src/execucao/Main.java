/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execucao;

import java.util.Scanner;
import jantarfilosofossafe.Mesa;
import jantarfilosofossafe.Filosofo;

/**
 *
 * @author aluno
 */
public class Main {
   public static void main(String[] args) {
      int qfg;
      Scanner teclado = new Scanner(System.in);
      System.out.println("Digite a quantidade de garfos esta é igual a de filósofos: ");
      qfg = teclado.nextInt();
      Mesa mesa = new Mesa(qfg);
      Filosofo[] filosofos = new Filosofo[qfg];
      for (int i = 0; i < qfg; i++) {
         filosofos[i] = new Filosofo(i);
      }
      for (int i = 0; i < qfg; i++) {
         filosofos[i].start();
      }
   }

}
