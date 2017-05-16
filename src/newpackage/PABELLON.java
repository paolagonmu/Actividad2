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
public class PABELLON {
   private int id;
    private String nombre;
    private  EQUIPO EQUIPO1;
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
    
    public void setEQUIPO1(EQUIPO EQUIPO1p)
    {
    this.EQUIPO1=EQUIPO1p;
    }
            
    public EQUIPO EQUIPO1 () 
    { 
    return EQUIPO1;
    }  
}
