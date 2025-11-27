/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examen2_25550584;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Examen2_25550584 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner captu = new Scanner (System.in);
          int num,primo,noprimo,resi = 0,i= 0, j;
          
          System.out.println("*******************************");
          System.out.println("***PATRONES DE ESTRELLAS*******");
          System.out.println("*******************************");
          
          System.out.println("");
          System.out.println("Brindame un numero mayor a 2: ");
          System.out.println("Para salir introduce el numero 0: ");
          num = captu.nextInt();
          if (num == 1) {
              System.out.println("Mijo ese no es un numero mayor a 2 >:(");
                          
        }else if (num > 2) {
                if (resi != 0) {
                    System.out.println(num + "*");
                }
        }
            
       // }
         //   }
           // {
             // do {
                  for (i = 2; i < num; i++) {
                    for ( j = 2; j == num; j++) {
                      System.out.println(i + "*");
                    }
                      
                  }
                  System.out.println("-*******************************-");
                     for ( i = 1; i <= num; i++) {
                  System.out.println(i + ". ");
                         for (int k = 0; k < num; k++) {
                             System.out.println("*");
                             
                         }
                  System.out.println("-*******************************-");
                     }
    }
    }
    