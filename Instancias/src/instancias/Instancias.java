/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancias;

/**
 *
 * @author PC
 */
public class Instancias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int Legajo;
        String Nombre;
        Alumno UnAlumno;
        UnAlumno = new Alumno();
        UnAlumno.Legajo= 77;
        UnAlumno.Mostrar();
        Alumno OtroAlumno = new Alumno();
        OtroAlumno.Legajo = 55;
        OtroAlumno.Mostrar();
       
        Calculadora UnCal = new Calculadora ();
        UnCal.NumeroUno = 10;
        UnCal.NumeroDos = 15;
        UnCal.Sumar();
        System.out.println("su resultado es" + UnCal.Resultado);
                
    }
   
    
}
