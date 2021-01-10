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
        
        for(t=l.getHead(); t!=l.getTail(); t=t.getNext()){
            System.out.println("Nombre: "+t.getNombre());
            System.out.println("Precio: $"+t.getPrecio());
            System.out.println("ID: "+t.getid());
        }
        System.out.println("Nombre: "+t.getNombre());
        System.out.println("Precio: $"+t.getPrecio());
        System.out.println("ID: "+t.getid());
        
        
        System.out.println("\n----------Recorriendo estructura--------------\n");
        
        t=l.getHead();
        
        String opc;
        System.out.println("S=SIGUIENTE\n P=PREVIO\n Otro=Salir");
        while(true){
            
            
            System.out.println("Nombre: "+t.getNombre());
            System.out.println("Precio: $"+t.getPrecio());
            System.out.println("ID: "+t.getid());
            
            System.out.println("");
            
            opc = in.readString();
            switch(opc){
                
                case "S":
                    t=t.getNext();
                break;
                
                case "P":
                    t=t.getPrev();
                break;
                
                
                default:
                    break;
                        
                
            }
            
            if(Objects.equals(opc, "S")!=true && Objects.equals("P", opc)!=true){
                break;
            }
        }
        
        
    }
           
  
}


