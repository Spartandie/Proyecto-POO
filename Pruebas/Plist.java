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
public class Plist {
    private Pnode head;
    private Pnode tail;
    
    
    KeyboardInput in = new KeyboardInput();
    public Plist() {
        this.head=null;
        this.tail=null;
    }

    
    public Plist(Pnode head, Pnode tail) {
        this.head = head;
        this.tail = tail;
    }

    public Pnode getHead() {
        return head;
    }

    public Pnode getTail() {
        return tail;
    }

    public void setHead(Pnode head) {
        this.head = head;
    }

    public void setTail(Pnode tail) {
        this.tail = tail;
    }
    
    public boolean print_list(Plist l){
        if(l.is_empty(l))
        {
            return false;
        }
        Pnode t = new Pnode();
        for(t=l.getHead(); t!=l.getTail(); t=t.getNext()){
            System.out.println("Nombre: "+t.getNombre());
            System.out.println("Precio: $"+t.getPrecio());
            System.out.println("ID: "+t.getid());
        }
        System.out.println("Nombre: "+t.getNombre());
        System.out.println("Precio: $"+t.getPrecio());
        System.out.println("ID: "+t.getid());
        return true;
    }
    
    public boolean is_empty(Plist l){
        if(l.getHead()==null){
            return true;
        }
        return false;
    }
    
    public boolean rec_list(Plist l){
        if(l.is_empty(l))
        {
            return false;
        }
        Pnode t = new Pnode();
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
        return true;
    }
    
    public boolean del_list(Plist l){
        Pnode t = new Pnode();
        if(l.getHead()!=null){
            l.setHead(null);
            l.setTail(null);
        }
        return false;
    }
    
    public void del_first_node(Plist l){
        if(l.getHead()!=l.getTail())
        {
            
            l.getHead().getPrev().setNext(l.getHead().getNext());
            l.getHead().setPrev(null);
            l.getHead().getNext().setPrev(l.getTail());
            l.getHead().setPrev(null);
            l.setHead(l.getTail().getNext());
        }
        else{
            l.getHead().setPrev(null);
            l.getHead().setNext(null);
            l.setHead(null);
            l.setTail(null);
            
        }
        
    }
   
    public void del_last_node(Plist l){
        if(l.getHead()!=l.getTail()){
            l.getHead().setPrev(l.getTail().getPrev());
            l.getTail().getPrev().setNext(l.getHead());
            l.getTail().setPrev(null);
            l.getTail().setNext(null);
            l.setTail(l.getHead().getPrev());
        }
        else{
            l.getTail().setPrev(null);
            l.getTail().setNext(null);
            l.setHead(null);
            l.setTail(null);
        }
    }
    
    public void del_node(Plist l, Pnode n){
        if(l.getHead()==l.getTail()){
            n.remove_node(n);
            return;
        }
        else
        {
           
            if(n==l.getHead()){
                l.del_first_node(l);
                return;
            }
            if(n==l.getTail()){
                l.del_last_node(l);
                return;
            }
            n.getPrev().setNext(n.getNext());
            n.getNext().setPrev(n.getPrev());
            n.remove_node(n);
            return;
                
            
        }
    }
    
    public Pnode search_node(Plist l, String nombre){
        if(l.is_empty(l)==false){
            Pnode t = new Pnode();
            for(t=l.getHead(); t!=l.getTail(); t=t.getNext()){
                if(Objects.equals(t.getNombre(), nombre)==true){
                    return t;
                }   
            }
            if(Objects.equals(t.getNombre(), nombre)==true){
                    return t;
            }   
            return null;
        }
        
        return null;
    }
}



