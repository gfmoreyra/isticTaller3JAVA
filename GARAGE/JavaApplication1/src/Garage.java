
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Garage {

 
  private String ListadoAuto;
  private String ListaAutoFacturado;
    
    
    
      static void IngresarAuto(Auto AutoEntrante) throws IOException {
      
        System.out.println(AutoEntrante.numeroPatente); 
          
         FileWriter Archivo;
          Archivo= new FileWriter ("Estacionados.txt", true);
          PrintWriter Escritor;
          Escritor = new PrintWriter(Archivo);
          Escritor.println(AutoEntrante.numeroPatente);
          Archivo.close();

        
          
    }
}
