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
    private String tipo="";
    private boolean AtaqueDirecto=false;
    
    public String getTipo()
    {
        return this.tipo;
    }
    public void setTipo(String tip)
    {
        this.tipo=tip;
    }

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
    
    public void limpiar()
    {
        String nombre="";
        int canitdad=0;
        int imagen=0;
        int puntos=0;
        boolean AtaqueDirecto=false;
    }
    
}
