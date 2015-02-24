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
public class cola {
    Lista_Doble cola;
    
    public cola()
    {
        cola=new Lista_Doble();
    }
    
    boolean vacia()
    {
        return cola.esVacia();
    }
    
    public void insertar(Object x)
    {
        cola.InsertarFinal(x);
    }
    
    public Object extraer()    
    {
       return cola.ExtraerInicio();
    }
}
