/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package plants.TDA;

/**
 *
 * @author Javier
 */
public class Pila {
    Lista_Doble pila;
            
    public Pila()
    {
        pila=new Lista_Doble();
    }
    
    public void Insertar(Object dato)
    {
        pila.InsertarInicio(dato);
    }
    
    public Object Extraer()
    {
        return pila.ExtraerInicio();
    }
    
    public boolean vacia()
    {
        return pila.esVacia();
    }
    
    public int cantidadElementos()
    {
        return this.pila.tamano();
    }
}
