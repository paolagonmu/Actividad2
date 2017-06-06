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
    private Estadistica estadistica1;
   private String descripcion;
   private int numero_partidos;
    
   public void SetEstadistica1(Estadistica estadistica1){
       this.estadistica1=estadistica1;
   }
   public Estadistica GetEstadistica1(){
       return estadistica1;
   }
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
