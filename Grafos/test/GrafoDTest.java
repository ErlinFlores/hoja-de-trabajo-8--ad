/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Darwin Rivas
 */
public class GrafoDTest {
    
    public GrafoDTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of add method, of class GrafoD.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        String label = "";
        GrafoD instance = new GrafoD();
        instance.add(label);
        
    }

    /**
     * Test of addEdge method, of class GrafoD.
     */
    @Test
    public void testAddEdge() {
        System.out.println("addEdge");
        String vtx1 = "";
        String vtx2 = "";
        int distancia = 100;
        GrafoD instance = new GrafoD();
        instance.addEdge(vtx1, vtx2, distancia);
        
        
    }

    /**
     * Test of remove method, of class GrafoD.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        String label = "";
        GrafoD instance = new GrafoD();
        String expResult = "";
        String result = instance.remove(label);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of removeVertice method, of class GrafoD.
     */
    @Test
    public void testRemoveVertice() {
        System.out.println("removeVertice");
        String label1 = "Guatemala";
        String label2 = "Izabal";
        GrafoD instance = new GrafoD();
        int expResult = 1000000;
        int result = instance.removeVertice(label1, label2);
        assertEquals(expResult, result);
       
    }

  
}