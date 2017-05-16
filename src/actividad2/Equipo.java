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
public class Equipo {
    private int id;
    private String nombre;
    private  Pabellon PABELLON1;
    private Jugador JUGADOR1;
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
    
    public void setPABELLON1(Pabellon PABELLON1p)
    {
    this.PABELLON1=PABELLON1p;
    }
            
    public Pabellon PABELLON1 () 
    { 
    return PABELLON1;
    }
    
    public void setJUGADOR1(Jugador JUGADOR1p)
    {
    this.JUGADOR1=JUGADOR1p;
    }
    public Jugador JUGADOR1 ()
    {
    return JUGADOR1;
    } 
}