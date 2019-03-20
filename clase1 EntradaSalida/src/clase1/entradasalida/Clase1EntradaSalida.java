/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1.entradasalida;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Clase1EntradaSalida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("hola mundo");
        int edad;
        edad = 33;
        System.out.println(" su edad es "+ edad);
        Scanner MiScanner;
        MiScanner=new Scanner (System.in);
        System.out.println("por favor ingrese su edad");
        edad= MiScanner.nextInt();
        System.out.println(" su edad es "+ edad);
        // TODO code application logic here
    }
    
}
