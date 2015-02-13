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
public class Lista_Doble {
    private Nodo inicio;
    private Nodo fin;
    
    public Lista_Doble()
    {
        inicio=null;
        fin=null;
        
    }
    
    public void InsertarInicio(Object x)
    {
        if(inicio==null)
        {
            inicio=new Nodo( x,null,null);
            fin=inicio;
        }
        else
        {
            Nodo nuevo=new Nodo(x,null, inicio);
            inicio.setAnterior(nuevo);
            inicio=nuevo;
        }
    }
    
    public boolean esVacia()
    {
        return (inicio==null)? true:false;
    }
    
    public void InsertarFinal(Object x)
    {
        if(inicio==null)
        {
            inicio=new Nodo( x,null,null);
            fin=inicio;
        }
        else
        {
            Nodo nuevo=new Nodo(x,fin,null);
            fin.setSiguiente(nuevo);
            fin=nuevo;
        }
    }
    
    
    public Object ExtraerInicio()
    {
        Object devolver=inicio.getObjeto();
        Nodo temporal=inicio.getSiguiente();
        if(inicio==null)
        {
             inicio=temporal;           
        }
        else
        {
            temporal.setAnterior(null);
            inicio=temporal;
        }
        return devolver;
    }
    
    public Object ExtraerFinal()
    {
        Object devolver=fin.getObjeto();
        Nodo temporal=fin.getAnterior();
        if(fin==null)
        {
            //temporal.setSiguiente(null);
            fin=temporal;
        }
        else
        {
            temporal.setSiguiente(null);
            fin=temporal;
        }
        return devolver;
    }
    
    public void Mostrar()//Recorrer matriz
    {
        Nodo temp=inicio;
        while(temp!=null)
        {
            //aqui mostrara independiente de que objeto sea
            temp=temp.getSiguiente();
        }
    }
    
}
