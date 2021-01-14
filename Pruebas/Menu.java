/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.poo;

import java.util.Objects;

/**
 *
 * @author spart
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KeyboardInput in = new KeyboardInput();
        
        
        Plist l = new Plist();
        float precio;
        int id;
        String nombre;
        Pnode t = new Pnode();
        
        System.out.println("----------Creando estructura--------------\n");
        
        
        for(int i=0;i<3;i++){
            System.out.println("Ingresa el nombre del producto: ");
            nombre=in.readString();
            System.out.println("Ingresa el precio:");
            precio=in.readFloat();
            System.out.println("Ingresa el id del producto:");
            id=in.readInteger();          
            Pnode node = new Pnode(null, null, nombre, precio, id);
                
            if(l.is_empty(l)){
                l.setHead(node);
                l.setTail(node);
            }
            else{
                l.getTail().setNext(node);
                l.getHead().setPrev(node);
                node.setPrev(l.getTail());
                node.setNext(l.getHead());
                l.setTail(node);
                    
            }
        }
        
        System.out.println("\n----------Imprimiendo estructura--------------\n");
        
        l.print_list(l);
        System.out.println("Nombre  a borrar");
        nombre = in.readString();
        
        l.del_node(l, l.search_node(l, nombre));
        System.out.println("\n----------Imprimiendo estructura--------------\n");
        
        if(l.print_list(l)==false){
            System.out.println("Lista vacia");
        }
        //System.out.println("\n----------Recorriendo estructura--------------\n");
        
        //l.rec_list(l);
        
        
    }
           
  
}


