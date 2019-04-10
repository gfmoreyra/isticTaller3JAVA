/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpentradasalida;

/**
 *
 * @author PC
 */
public class FuncionesEstaticas {
    public static void Saludar ()
    {
        System.out.println("Bienvenido a Java");
    }
    public static void SaludarConNombre (String Nombre)
    {
        System.out.println("Bienvenido "+ Nombre+"  a Java");
        
    }   
    public static void SaludarConNombreyApellido (String Nombre, String Apellido)
    {
        System.out.println(" Su Nombre es "+Nombre+" y "+Apellido+" es su Apellido");
    }
    public static void SaludarConNombreYEdad (String Nombre, int Edad) 
    {
        System.out.println("Usted se llama "+Nombre+" y tiene "+Edad+" años de edad");
    }
    public static void SumarSinRetorno (int NumeroUno, int NumeroDos)
    {
      int Suma;
      Suma = NumeroUno + NumeroDos;
        System.out.println("Suma es" +Suma);  
    }
     public static void SumarConRetorno (int NumeroUno, int NumeroDos) 
     {
      int Resultado;
      Resulado
     }
}
