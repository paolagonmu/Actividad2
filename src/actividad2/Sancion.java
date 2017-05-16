/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad2;

/**
 *
 * @author sena
 */
public class Sancion {
   private String descripcion;
   private int numero_partidos;
   
   public void SetDescripcion(String descripcionP){
       this.descripcion=descripcionP;
   }
        public String GetDescripcion(){
            return descripcion;
        }   
   
    public void SetNumero_Partidos(int numero_partidosP){
        this.numero_partidos=numero_partidosP;
    }
    public int GetNumero_Partidos(){
        return numero_partidos;
    }
}
