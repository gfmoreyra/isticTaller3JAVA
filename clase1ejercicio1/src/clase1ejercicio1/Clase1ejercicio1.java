/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1ejercicio1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Clase1ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("ingrese un numero para verificar si es primo");
        int numero;
        int i;
      
        Scanner MiScanner;
        MiScanner=new Scanner (System.in);
        System.out.println("por favor ingrese el numero");
        numero= MiScanner.nextInt();
        for (i=0; i <numero; i ++)
        {
           // System.out.println(i);
            if ( numero%i==0)
            {
                break;
            }
         } 
                
      if(i==numero)
      {
          System.out.println("es primo");
      }
      else
      {
          System.out.println("no es primo");
      }
        // TODO code application logic here
    }
    
}
