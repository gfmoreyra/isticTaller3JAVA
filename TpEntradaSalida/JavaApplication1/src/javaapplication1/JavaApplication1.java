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
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    
        public static void main(String[] args) 
        {
        FuncionesEstaticas.Saludar();
        FuncionesEstaticas.SaludarConNombre("Florencia");
        FuncionesEstaticas.SaludarConNombreyApellido("Florencia", "Moreyra");
        FuncionesEstaticas.SaludarConNombreYEdad("Florencia",23);
        FuncionesEstaticas.SumarSinRetorno(4,5);
        FuncionesEstaticas.SumarConRetorno(5, 3);
        FuncionesEstaticas.Promedio(5, 5, 5);
        FuncionesEstaticas.CalcularPerimetro(5, 5, 5, 5);
        FuncionesEstaticas.PromedioRectangulo(2, 5, 2, 5);
        FuncionesEstaticas.CompraTotal(15, 3);
        FuncionesEstaticas.RepartirPremio(500000, 2);
        FuncionesEstaticas.CalcularSueldo(10, 10);
        FuncionesEstaticas.CalcularImpuesto(800);
         }
    
}
