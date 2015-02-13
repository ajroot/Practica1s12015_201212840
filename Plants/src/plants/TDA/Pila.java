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
            
    Pila()
    {
        pila=new Lista_Doble();
    }
    
    public void Insertar(Object dato)
    {
        pila.InsertarInicio(dato);
    }
    
    Object Extraer()
    {
        return pila.ExtraerInicio();
    }
    
    boolean vacia()
    {
        return pila.esVacia();
    }
}
