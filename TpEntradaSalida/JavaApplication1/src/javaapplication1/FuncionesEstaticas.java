/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author gfmoreyra
 */
public class FuncionesEstaticas 
{
    public static void Saludar ()
    {
        System.out.println("Bienvenido a Java");
        System.out.println("---------------------------");
    }
    public static void SaludarConNombre (String Nombre)
    {
        System.out.println("Bienvenido "+ Nombre+"  a Java");
        System.out.println("---------------------------");
        
    }   
    public static void SaludarConNombreyApellido (String Nombre, String Apellido)
    {
        System.out.println(" Su Nombre es "+Nombre+" y "+Apellido+" es su Apellido");
        System.out.println("---------------------------");
    }
    public static void SaludarConNombreYEdad (String Nombre, int Edad) 
    {
        System.out.println("Usted se llama "+Nombre+" y tiene "+Edad+" años de edad");
        System.out.println("---------------------------");
    }
    public static void SumarSinRetorno (int NumeroUno, int NumeroDos)
    {
      int Suma;
      Suma = NumeroUno + NumeroDos;
        System.out.println("Suma es "+Suma);  
        System.out.println("---------------------------");
    }
     public static void SumarConRetorno (int NumeroUno, int NumeroDos) 
     {
      int Resultado;
      Resultado = NumeroUno + NumeroDos;
       System.out.println("Resultado es "+Resultado);
         System.out.println("--------------------------");
     }
     public static void Promedio (int NumeroUno, int NumeroDos, int NumeroTres)
     {
      int Promedio;
      Promedio = NumeroUno + NumeroDos + NumeroTres / 3;
         System.out.println("Promedio es "+Promedio);
         System.out.println("--------------------------");
     }
     
        

public static void CalcularPerimetro (int NumeroUno, int NumeroDos, int NumeroTres, int NumeroCuatro )
     {
      int Perimetro;
      Perimetro = NumeroUno + NumeroDos + NumeroTres + NumeroCuatro ;
         System.out.println(" El Perimetro es "+Perimetro);
         System.out.println("--------------------------");
     }
public static void PromedioRectangulo (int LadoUno, int LadoDos, int LadoTres, int LadoCuatro )
     {
      int Rectangulo;
      Rectangulo = LadoUno + LadoDos + LadoTres + LadoCuatro ;
         System.out.println(" La superficie es "+Rectangulo);
         System.out.println("--------------------------");
     }
public static void CompraTotal (int Precio, int Cantidad)
     {
      int Total;
      Total = Precio * Cantidad;
         System.out.println(" El total es "+Total);
         System.out.println("--------------------------");
     }
public static void RepartirPremio (int Ganadores, int  MontoTotal )
     {
      int Premio;
      Premio = Ganadores / MontoTotal  ;
         System.out.println(" El dinero que le corresponde a cada uno es "+Premio);
         System.out.println("--------------------------");
     }
public static void CalcularSueldo (int ValorHora, int CantidadHora )
     {
      int Sueldo;
      int Descuento;
      int Total;
      Sueldo = ValorHora * CantidadHora;
      Descuento = Sueldo * 15 / 100;
      Total= Sueldo - Descuento;
         System.out.println(" El sueldo que le corresponde es "+Total);
         System.out.println("--------------------------");
     }
public static void CalcularImpuesto (int ValorProducto )
     {
      int PrecioFinal;
      int Impuesto;
      Impuesto= ValorProducto * 35 / 100;
      PrecioFinal = ValorProducto + Impuesto;
         System.out.println(" El Precio Final es "+PrecioFinal);
         System.out.println("--------------------------");
     }

}
