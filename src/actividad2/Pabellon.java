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
public class Pabellon {
    private int id;
    private String nombre;
    private  Equipo EQUIPO1;
    private Clausura Clausura1;
    
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
    public void setClausura1(Clausura Clausura1p)
    {
    this.EQUIPO1=Clausura1p;
    }
            
    public Clausura Clausura1 () 
    { 
    return Clausura1;
    }
}
