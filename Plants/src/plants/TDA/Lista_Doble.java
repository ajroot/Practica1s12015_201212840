/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package plants.TDA;

import plants.Plantas;

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
        Object devolver=null;
        Nodo temporal=null;
        if(inicio!=null)
        {
            devolver=inicio.getObjeto();
            
            if(fin!=inicio)
            {
                temporal=inicio.getSiguiente();
                temporal.setAnterior(null);
                inicio=temporal;
            }
            else
            {
                inicio=fin=null;           
            }
            
        }
        return devolver;
    }
    
    public Object ExtraerFinal()
    {
        Object devolver=null;
        Nodo temporal=null;
        if(fin!=null)
        {
            devolver=fin.getObjeto();
            
            if(fin!=inicio)
            {
                temporal=fin.getAnterior();
                temporal.setSiguiente(null);
                fin=temporal;
            }
            else
            {
                inicio=fin=null;
            }
            
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
            System.out.println(temp.getObjeto());
            temp=temp.getSiguiente();
            
        }
    }
    
    public void MostrarAlrevez()//Recorrer matriz
    {
        Nodo temp=fin;
        while(temp!=null)
        {
            //aqui mostrara independiente de que objeto sea
            System.out.println(temp.getObjeto());
            temp=temp.getAnterior();
            
        }
    }
    public void Vaciar()//Recorrer matriz
    {
        Nodo temporal;
        while(inicio!=null)
        {
            temporal=fin.getAnterior();
        if(temporal==null)
        {
            //temporal.setSiguiente(null);
            fin=inicio=temporal;
        }
        else
        {
            temporal.setSiguiente(null);
            fin=temporal;
        }
        }
        
    }
    
    public void Eliminar(Object comparar)
    {
        Nodo temp=inicio;
        while(temp!=null)
        {
            //aqui mostrara independiente de que objeto sea
            if(comparar==temp.getObjeto())
            {
                if((inicio.getObjeto()!=comparar)&&(fin.getObjeto()!=comparar))
                {
                    temp.getSiguiente().setAnterior(temp.getAnterior());
                    temp.getAnterior().setSiguiente(temp.getSiguiente());
                }
                else
                {
                    if(comparar==inicio.getObjeto())
                    {
                        temp.getSiguiente().setAnterior(null);
                        inicio=temp.getSiguiente();
                    }
                    else
                    {
                       temp.getAnterior().setSiguiente(null);
                       fin=temp.getAnterior();
                    }
                }
                {
                    
                }
                
            }
            
            temp=temp.getSiguiente();
            
        }
    }
    
}



