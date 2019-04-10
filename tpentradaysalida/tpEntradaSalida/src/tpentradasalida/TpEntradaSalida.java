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
public class TpEntradaSalida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FuncionesEstaticas.Saludar();
        FuncionesEstaticas.SaludarConNombre("Florencia");
        FuncionesEstaticas.SaludarConNombreyApellido("Florencia", "Moreyra");
        FuncionesEstaticas.SaludarConNombreYEdad("Florencia",23);
        FuncionesEstaticas.SumarSinRetorno(4,5);
    }
   
     
}
