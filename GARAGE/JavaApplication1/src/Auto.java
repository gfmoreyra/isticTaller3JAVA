
import java.util.Date;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Auto {
     public String numeroPatente;
     private Date FechaIngreso;
     private Date FechaSalida;
  
     // Metodo constructores
public Auto(String Patente)
{
    this.numeroPatente = Patente;
}
//Metodo sobrecargado

public Auto (String numeroPatente, Date FechaIngreso, Date FechaSalida){
 this.numeroPatente = numeroPatente;
 this.FechaIngreso = FechaIngreso;
 this.FechaSalida = FechaSalida;
}

    Auto(JTextField txtPatente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
        
    
          
}


 //getters and setters

   
