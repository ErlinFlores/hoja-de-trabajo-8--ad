/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Darwin Rivas
 */
public interface Grafo<V,E>
{
public  void add (V label);
// pre : label is a non-null label for vertex
// post : a vertex with label is added to graph
// if vertex with label is already in graph , no action
public void addEdge (V vtx1, V vtx2, int label);
// pre : vtx1 and vtx2 are labels of existing vertices
// post : an edge (possibly directed) is inserted between
// vtx1 and vtx2 .
public  V remove (V label) ;
// pre : label is non-null vertex label
// post : vertex with " equals " label is removed , if found
public V removeVertice(V label1,V label2);
//pres:
//post: remove edge between label1, label2

}