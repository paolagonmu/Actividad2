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
public class PARTIDO {
    
    private int numespectadores;
    private int resultado;
    private ARBITRO arbitro1;
    
    public void setArbitro1(ARBITRO arbitro1P)
    {
      this.arbitro1=arbitro1P;
    }
    public ARBITRO getArbitro1(){
        return arbitro1;
    }
    
   public void setNumespectadores(int numespectadoresP)
   {
     this.numespectadores= numespectadoresP;
   }
   public int getNumespectadores()
   {
    return this.numespectadores;
   }
   
    public void setResultado(int resultadoP)
   {
     this.resultado= resultadoP;
   }
   public int getResultado()
   {
    return this.resultado;
   }
    
}
