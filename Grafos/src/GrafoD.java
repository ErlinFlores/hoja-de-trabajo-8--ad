/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Darwin Rivas
 * Mario Galvez
 */
public class GrafoD implements Grafo<String,String>{
    
    private ArrayList<String> Nodos;// lista de nodos del grafo
    private int[][] vertices; //matriz de vertices entre nodos
    private int[][] Floyd; // matriz de las rutas mas cortas
    private int[] centro;
    
    
    public GrafoD(){
           Nodos = new ArrayList<String>();
           add("Guatemala");
           add("Izaba");
           add("Peten");
           add("Chiquimula");
           add("Huehuetenango");
           vertices=new int[Nodos.size()][Nodos.size()];
          for(int i=0;i<Nodos.size();i++){
            for(int j=0;j<Nodos.size();j++){
                vertices[i][j]=10000000;
            }
          }
           
          Floyd=vertices;
          
    }

    
    @Override
    public void add(String label) {
        
        Nodos.add(label);
    }

   
    @Override
   public void addEdge(String vtx1, String vtx2, int distancia) {
        
        int inicio=0,destino=0;
        
        for(int i=0;i<Nodos.size();i++){
            if(Nodos.get(i)==vtx1){
                inicio=i;
            }if(Nodos.get(i)==vtx2){
                destino=i;
            }
         vertices[inicio][destino]=distancia;
        
        }   
    }
    
    @Override
    public String remove(String label){
        String removido="";
        for(int i=0;i<Nodos.size();i++){
            if(Nodos.get(i)==label){
                removido=Nodos.remove(i);
               }       
            }
        return removido;
    }

   @Override
    public int removeVertice(String label1, String label2){
        int inicio=0,destino=0;
        
        for(int i=0;i<Nodos.size();i++){
            if(Nodos.get(i)==label1){
                inicio=i;
            }if(Nodos.get(i)==label2){
                destino=i;
            }
         vertices[inicio][destino]=1000000;
            
         
        }
    
        return vertices[inicio][destino];
    }
    
   public void FloydWarshall(int[][] matriz){
        for(int k=0;k<matriz.length;k++){
            for(int i=0;i<matriz.length;i++){
                for(int j=0;j<matriz.length;j++){
                    Floyd[i][j]=Math.min(matriz[i][j],matriz[i][k]+matriz[k][j]);
        }
      }
    }       
  }
   public String centroGrafo(){
      int menor=1000000;
     for(int k=0;k<Nodos.size();k++){
         for(int i=0;i<Nodos.size();i++){
             centro[k]+=Floyd[k][i];
             if(centro[k]<menor){
                 menor=centro[k];
             }
         }
     }
     return Nodos.get(menor);
   }  
}


