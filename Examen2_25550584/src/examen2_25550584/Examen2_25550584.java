/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen2_25550584;

import java.util.Scanner;

/**
 *
 * @author miria
 */
public class Examen2_25550584 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int num, resi = 0, i = 0, j;

        System.out.println("*******************************");
        System.out.println("***PATRONES DE ESTRELLAS*******");
        System.out.println("*******************************");

        System.out.println();
        System.out.println("Brindame un numero mayor a 2: ");
        System.out.println("Para salir introduce el numero 0: ");
        num = captu.nextInt();
        System.out.println("*******************************");

        if (num == 1) {
            System.out.println("Mijo ese no es un numero mayor a 2 >:(");
        } else if (num > 2) {
            if (resi != 0) {
                System.out.println(num + "*");
            }
        }

        
        for (i = 2; i < num; i++) {
            for (j = 2; j < num; j++) { 
                System.out.println(i + "*");
                break; 
            }
        }

        System.out.println("-*******************************-");

        
        for (i = 1; i <= num; i++) {
            System.out.println(i + ". ");
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.println("-*******************************-");
                    }
        }


    


}