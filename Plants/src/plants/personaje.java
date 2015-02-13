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
    private int puntos=0;
    private boolean AtaqueDirecto=false;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCanitdad() {
        return canitdad;
    }

    public void setCanitdad(int canitdad) {
        this.canitdad = canitdad;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public boolean isAtaqueDirecto() {
        return AtaqueDirecto;
    }

    public void setAtaqueDirecto(boolean AtaqueDirecto) {
        this.AtaqueDirecto = AtaqueDirecto;
    }
    
    
}
