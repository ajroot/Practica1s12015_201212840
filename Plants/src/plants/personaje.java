/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package plants;

/**
 *
 * @author Javier
 */
public class personaje {
    private String nombre="";
    private int canitdad=0;
    private int imagen=0;
    
    void setNombre(String name)
    {
        this.nombre=name;
    }
    
    void setCantidad(int cant)
    {
        this.canitdad=cant;
    }
    
    void setImagen(int img)
    {
        this.imagen=img;
    }
    
    String getNombre()
    {
        return this.nombre;
    }
    
    int getCantidad()
    {
        return this.canitdad;
    }
    
    int getImagen()
    {
        return this.imagen;
    }
}
