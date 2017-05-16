/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author SENA
 */
public class EQUIPO {
    private int id;
    private String nombre;
    private  PABELLON PABELLON1;
    private JUGADOR JUGADOR1;
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
    
    public void setPABELLON1(PABELLON PABELLON1p)
    {
    this.PABELLON1=PABELLON1p;
    }
            
    public PABELLON PABELLON1 () 
    { 
    return PABELLON1;
    }
    
    public void setJUGADOR1(JUGADOR JUGADOR1p)
    {
    this.JUGADOR1=JUGADOR1p;
    }
    public JUGADOR JUGADOR1 ()
    {
    return JUGADOR1;
    }        
    
    
}
