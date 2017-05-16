/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad2;

/**
 *
 * @author SENA
 */
public class Arbitro {
     private String Nombre;
     private String Colegio;
    
   public void setNombre(String nombreP)
   {
     this.Nombre= nombreP;
   }
   public String getNombre()
   {
    return this.Nombre;
   }
   
   public void setColegio(String colegioP)
   {
     this.Colegio= colegioP;
   }
   public String getColegio()
   {
    return this.Colegio;
   }

}
