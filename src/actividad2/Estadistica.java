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
public class Estadistica{
    private Partido partido1;
    private Jugador jugador1;
    public void setPartido1(Partido partido1p)
    {
    this.partido1=partido1p;
    }
            
    public Partido partido1 () 
    { 
    return partido1;
    }
     public void setJugador1(Jugador jugador1p)
    {
    this.jugador1=jugador1p;
    }
            
    public Jugador jugador1 () 
    { 
    return jugador1;
    }
}
