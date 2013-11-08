/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Darwin Rivas
 */
public class GrafoD implements Grafo<String,String>{
    
    private String[] Nodos; // lista de nodos del grafo
    private int[][] vertices; //matriz de vertices entre nodos
    private int[][] Floyd; // matriz de las rutas mas cortas
    
    
    public GrafoD(){
        
        Nodos=new String[];
        
        
    }

    @Override
    public void add(String label) {
        
    }

    @Override
    public void addEdge(String vtx1, String vtx2, String label) {
        
    }

    @Override
    public String remove(String label) {
    
        
        
        return label;
    }

    @Override
    public String removeVertice(String label1, String laber2) {
        for(int i=0;i<Nodos.length;i++){
            
        }
        
    
        return null;
    }
    
   
    
}
