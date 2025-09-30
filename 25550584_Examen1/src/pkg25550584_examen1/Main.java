/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg25550584_examen1;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Main {

    
    public static void main(String[] args) {
  
double Saldo = 5000;
double PIN;
double Menu;
double Retirar;
double actual;
double depositar;

        
  System.out.println("******************************");
  System.out.println("*********Bienvenido***********");
  System.out.println("******************************");
        
  System.out.println();
  System.out.println("Ingrese su PIN: ");
  
  Scanner captu = new Scanner (System.in);
  PIN = captu.nextDouble();
  
  if (PIN == 1234){
      System.out.println();
      System.out.println();
      System.out.println("**********Bienvenido************");
      System.out.println("Que es lo que le gustaria hacer?");
      System.out.println("Para consultar saldo coloque 1");
      System.out.println("Para retirar dinero coloque 2");
      System.out.println("Para depositar dinero coloque 3");
      System.out.println("********************************");
      Scanner captu2 = new Scanner (System.in);
      Menu= captu2.nextDouble();
        if (Menu == 1){
            System.out.println("Su saldo actual es de ");
            System.out.println (Saldo);
            
        }if(Menu == 2){
            System.out.println("Cuanto es el monto que necesita retirar de su cuenta?");
            Scanner captu3 = new Scanner (System.in);
            Retirar = captu3.nextDouble();
            actual = Saldo - Retirar;
            System.out.println("Su saldo ahora seria de ");
            System.out.println(actual);
        }if(Menu == 3){  
           System.out.println("Cuanto es el monto que necesita depositar en su cuenta?");
            Scanner captu4 = new Scanner (System.in);
            depositar = captu4.nextDouble();
            actual = Saldo + depositar;
            System.out.println("Su saldo ahora seria de ");
            System.out.println(actual); 
       }else{
      System.out.println("Acceso Denegado");
      
  
    }
    
  }
  
    }
    
}
