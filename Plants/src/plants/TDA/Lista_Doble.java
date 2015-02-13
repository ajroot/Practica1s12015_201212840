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
    
    boolean esVacia()
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
        inicio=inicio.getSiguiente();
        if(inicio==null)
        {
            inicio.setAnterior(null);
        }
        else
        {
            fin=null;
        }
        return devolver;
    }
    
    public Object ExtrarFinal()
    {
        Object devolver=fin.getObjeto();
        fin=fin.getAnterior();
        if(fin==null)
        {
            fin.setSiguiente(null);
        }
        else
        {
            fin=null;
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
