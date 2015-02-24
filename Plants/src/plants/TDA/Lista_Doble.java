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
        Object devolver=null;
        Nodo temporal=null;
        if(inicio!=null)
        {
            //temporal.setSiguiente(null);
            devolver=inicio.getObjeto();
            //System.out.println("Se obtuvo "+devolver);
            
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
            //temporal.setSiguiente(null);
            devolver=fin.getObjeto();
            //System.out.println("Se obtuvo "+devolver);
            
            if(fin!=inicio)
            {
                temporal=fin.getAnterior();
                //System.out.println("Temporal es igual a "+temporal);
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
    
    
    public Object EliminarPosicion(int numero)
    {
        int pos=0;
        Nodo temp=inicio;
        Object comparar;
        Object Retornar=null;
        while(temp!=null)
        {
            //aqui mostrara independiente de que objeto sea
            pos++;
            if(numero==pos)
            {
                comparar=temp.getObjeto();
                if((inicio.getObjeto()!=comparar)&&(fin.getObjeto()!=comparar))
                {
                    Retornar=comparar;
                    temp.getSiguiente().setAnterior(temp.getAnterior());
                    temp.getAnterior().setSiguiente(temp.getSiguiente());
                }
                else
                {
                    if(comparar==inicio.getObjeto())
                    {
                        Retornar=comparar;
                        temp.getSiguiente().setAnterior(null);
                        inicio=temp.getSiguiente();
                    }
                    else
                    {
                        Retornar=comparar;
                       temp.getAnterior().setSiguiente(null);
                       fin=temp.getAnterior();
                    }
                }
                {
                    
                }
                
            }
            
            temp=temp.getSiguiente();
            
        }
        return Retornar;
    }
}
