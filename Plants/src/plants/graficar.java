/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plants;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import plants.TDA.Lista_Doble;
import plants.TDA.Pila;

/**
 *
 * @author javier
 */
public class graficar {
    
    
    
    public void escribirArchivo(String Texto,String path,String tipo) throws IOException
    {
        path="C:\\Users\\javier\\Documents\\1semestre 2015\\edd\\Practica1s12015_201212840\\Plants\\src\\plants\\Reportes\\"+tipo+".txt";
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {

        fichero = new FileWriter(path);
        pw = new PrintWriter(fichero);
        pw.println(Texto);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }
    
    public void generarGraficaJugadores(items jugPlantas, items jugZombies) throws IOException
    {
        Lista_Doble extrasPlantas=new Lista_Doble();
        extrasPlantas=jugPlantas.getExtras();
        Lista_Doble extrasZombies=new Lista_Doble();
        extrasZombies=jugZombies.getExtras();
        String nodosPlantas="nodo0 [label=\""+jugPlantas.getNombre()+"\"];\n "
                + "nodo1 [label=\""+jugPlantas.getCantidad()+"\"];\n";
        int cantidadNodos=0;
        for (int i=2;i<(extrasPlantas.tamano()+2);i++)
        {
            cantidadNodos++;
            nodosPlantas= nodosPlantas+ "nodo"+i+" [label=\""+extrasPlantas.ExtraerInicio()+"\"];\n";
        }
        String enlace="";
        for (int i=0;i<(cantidadNodos+1);i++)
        {
            enlace=enlace+"nodo"+i+" -> nodo"+(i+1)+";\n";
        }
        
        String nodosZombies="nodos0 [label=\""+jugZombies.getNombre()+"\"];\n "
                + "nodos1 [label=\""+jugZombies.getCantidad()+"\"];\n";
        int cantidadNodosZombies=0;
        for (int i=2;i<(extrasZombies.tamano()+2);i++)
        {
            cantidadNodosZombies++;
            nodosZombies= nodosZombies+ "nodos"+i+" [label=\""+extrasZombies.ExtraerInicio()+"\"];\n";
            
        }
        System.out.println("nodos Zombies "+nodosZombies);
        String enlaceZombies="";
        for (int i=0;i<(cantidadNodos+1);i++)
        {
            enlaceZombies=enlaceZombies+"nodos"+i+" -> nodos"+(i+1)+";\n";
        }
        System.out.println("enlaces zombies"+enlaceZombies);
        
        String texto="digraph G{ \n" +
            " rankidir = LR;\n" +
            " node[shape = record]; \n" +
            " rankidir = UD;\n" +
            " {  rank = same; \n" +
            " Plantas;\n" +nodosPlantas +
            "Plantas -> nodo0\n" +enlace +
            "};{ \n" +
            " rank = same; \n" +
            " Zombis;\n" +nodosZombies +
            "Zombis -> nodos0;\n" +enlaceZombies+
            "}; Jugador -> Plantas; \n" +
            " Plantas -> Zombis; \n" +
            " } ";
        escribirArchivo(texto,"","jugadores");
        graficar("jugadores");
        
    }
    
    
    
    
    
    public void graficarPersonajes(Lista_Doble plan, Lista_Doble zom) throws IOException
    {
        Plantas planta=new Plantas();
        Plantas zombie=new Plantas();
        int tam=plan.tamano();
        System.out.println(tam);
        String nodosPlantas="";
        String nodosZombies="";
        String texto="digraph G{ \n" +
            " rankidir = LR;\n" +
            " node[shape = record]; \n" +
            " rankidir = UD;\n";
        char letra=97;
        Lista_Doble nombres=new Lista_Doble();    
        for(int i=0;i<tam;i++)
        {
            letra++;
            planta=(Plantas)plan.ExtraerInicio();
            nombres.InsertarFinal(planta.getNuevo().getNombre());
            texto=texto+" {  rank = same; \n " +
            planta.getNuevo().getNombre()+";\n"+
                    "nodo"+letra+"1[label=\"Puntuacion: "+planta.getNuevo().getPuntos()+"\"];\n"
                    +"nodo"+letra+"2[label=\"Dispara: "+planta.getNuevo().getAtaque()+"\"];\n"
                    +"nodo"+letra+"3[label=\"Puntos: "+planta.getNuevo().getPuntos()+"\"];\n"
                    +"nodo"+letra+"4[label=\"Imagen: "+planta.getNuevo().getImagen()+"\"];\n"
                    +"nodo"+letra+"1 -> nodo"+letra+"2;\n"
                    +"nodo"+letra+"2 -> nodo"+letra+"3;\n"
                    +"nodo"+letra+"3 -> nodo"+letra+"4};\n";
        }
        int control=0;
        control=nombres.tamano();
        String temporal1,temporal2;
        temporal1=temporal2="";
        texto=texto+"personajes";
        for(int i=0;i<control;i++)
        {
            {
             temporal1=(String)nombres.ExtraerInicio();
            texto=texto+"->"+temporal1+";\n"+temporal1;   
            }
            
        }
        
        texto=texto+"}";
        
        escribirArchivo(texto,"","personajesPlantas");
        graficar("personajesPlantas");
        graficarPersZombies(zom);
    }
    
    
    public void graficarPersZombies(Lista_Doble zom) throws IOException
    {
        Plantas planta=new Plantas();
        Plantas zombie=new Plantas();
        int tam=zom.tamano();
        System.out.println(tam);
        String nodosPlantas="";
        String nodosZombies="";
        String texto="digraph G{ \n" +
            " rankidir = LR;\n" +
            " node[shape = record]; \n" +
            " rankidir = UD;\n";
        char letra=97;
        Lista_Doble nombres=new Lista_Doble();    
        for(int i=0;i<tam;i++)
        {
            letra++;
            planta=(Plantas)zom.ExtraerInicio();
            nombres.InsertarFinal(planta.getNuevo().getNombre());
            texto=texto+" {  rank = same; \n " +
            planta.getNuevo().getNombre()+";\n"+
                    "nodo"+letra+"1[label=\"Puntuacion: "+planta.getNuevo().getPuntos()+"\"];\n"
                    +"nodo"+letra+"2[label=\"Dispara: "+planta.getNuevo().getAtaque()+"\"];\n"
                    +"nodo"+letra+"3[label=\"Puntos: "+planta.getNuevo().getPuntos()+"\"];\n"
                    +"nodo"+letra+"4[label=\"Imagen: "+planta.getNuevo().getImagen()+"\"];\n"
                    +"nodo"+letra+"1 -> nodo"+letra+"2;\n"
                    +"nodo"+letra+"2 -> nodo"+letra+"3;\n"
                    +"nodo"+letra+"3 -> nodo"+letra+"4};\n";
        }
        int control=0;
        control=nombres.tamano();
        String temporal1,temporal2;
        temporal1=temporal2="";
        texto=texto+"personajes";
        for(int i=0;i<control;i++)
        {
            {
             temporal1=(String)nombres.ExtraerInicio();
            texto=texto+"->"+temporal1+";\n"+temporal1;   
            }
            
        }
        
        texto=texto+"}";
        
        escribirArchivo(texto,"","personajesPlantas");
        graficar("personajesPlantas");
    }
    
    
    public void graficarPila(Pila plantas) throws IOException
    {
        
                /*digraph G {
                nodesep=0.05;
                rankdir=LR;
                node [shape=record,width=.1,height=.1];
                node0 [label = "<f0> labl |<f1> |<f2> |<f3> |<f4> |<f5> |<f6> | ",height=2.5];
                }*/
        objeto temp=new objeto();
//temporal.Insertar(plantas.Extraer());
        String texto="digraph G {\n"+
                "nodesep=0.05;\n"+
                "rankdir=LR;\n"+
                "node [shape=record,width=.1,height=.1];\n"+
                "node0 [label =\"";
        int tam=plantas.cantidadElementos();
        System.out.println("la pila tiene un tamaño de; "+tam);
        for(int i=0;i<tam;i++)
        {
            temp=(objeto)plantas.Extraer();
            texto=texto+"<f"+i+">"+temp.getNombre()+"|";
        }
        
        texto=texto+"\",height=2.5];\n" +
                        "}";
        escribirArchivo(texto,"","pila");
        graficar("pila");
    }
    
    
    public void graficar(String tipo)
    {
        try{
           String dotPath="C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe"; 
           String fileInputPath="C:\\Users\\javier\\Documents\\1semestre 2015\\edd\\Practica1s12015_201212840\\Plants\\src\\plants\\Reportes\\"+tipo+".txt";
           String fileOutputPath="C:\\Users\\javier\\Documents\\1semestre 2015\\edd\\Practica1s12015_201212840\\Plants\\src\\plants\\Reportes\\"+tipo+".png";
           String tParam="-Tjpg";
           String tOParam="-o";
           
           
           String[] cmd=new String[5];
           cmd[0]=dotPath;
           cmd[1]=tParam;
           cmd[2]=fileInputPath;
           cmd[3]=tOParam;
           cmd[4]=fileOutputPath;
           
           Runtime rt=Runtime.getRuntime();
           rt.exec(cmd);
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            
        }

    }

}
