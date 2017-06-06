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
public class Jugador {
      private int id;
    private String nombre;
    private  Equipo EQUIPO1;
    private Partido parti1;
    public void setParti1(Partido parti1p)
    {
    this.parti1=parti1p;
    }
            
    public Partido parti1 () 
    { 
    return parti1;
    }
    
    public void setid(int idp)
    {
    this.id=idp;
    }
    
    public int getid () 
    { 
    return id;  
    }
    
    public void setnombre(String nombrep)
    {
    this.nombre=nombrep;
    }
    
    public String getnombre () 
    { 
    return nombre;  
    }
    
    public void setEQUIPO1(Equipo EQUIPO1p)
    {
    this.EQUIPO1=EQUIPO1p;
    }
            
    public Equipo EQUIPO1 () 
    { 
    return EQUIPO1;
    }
}

