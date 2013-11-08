/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Darwin Rivas
 */

import java.util.*;

public class Implementacion {
    
    private static Scanner input = new Scanner(System.in);
    private static String label,label1,inicio,destino,label2;
    private static int opcion=0;
    
    public static void main(String args[])
	{
            while(opcion!=4){
                System.out.println("1) Rutas mas corta");
                System.out.println("2) Centro de Grafo");
                System.out.println("3) Cambio de rutas");
                System.out.println("4) Salir del Progama");
               
                while(true){
                  String line=input.nextLine();      
                    try {
                       opcion=Integer.parseInt(line);
                       break;
                       }
                        catch (NumberFormatException e) {
                                // do nothing.
                      }
                   
                }  
                
               
          
            
	}
    }
}

   