/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

import Trabajadores.Vendedor;
import java.util.Objects;
import productos.Pnode;
import Trabajadores.Gerente;
/**
 *
 * @author spart
 */
public class Cnode extends Pnode{
    
    private Cnode next;
    private int cant;

    public Cnode() {
    }

    public Cnode(int cant, String nombre, float precio, int id, String tipo) {
        super(nombre, precio, id, tipo);
        this.cant=cant;
    }
    
    public Cnode(int cant, String nombre, float precio, int id, String tipo, String autor, String genero) {
        super(nombre, precio, id, tipo, autor, genero);
        this.cant=cant;
    }
    
    
    public Cnode(String nombre, float precio, int id, String tipo,  String color) {
        super(nombre, precio, id, tipo, color);
    }

    public Cnode(String nombre, float precio, int id, String tipo, String autor, String genero, int minutos, int segundos) {
        super(nombre, precio, id, tipo, autor, genero, minutos, segundos);
    }

    public Cnode(String nombre, float precio, int id, String tipo, String autor, String genero) {
        super(nombre, precio, id, tipo, autor, genero);
    }

   
    
    
    
    
    

    

    @Override
    public Cnode getNext() {
        return next;
    }

    public int getCant() {
        return cant;
    }

    public void setNext(Cnode next) {
        this.next = next;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
  
    
    
 

 
    public void del_cnode(Vendedor c, int opc, Gerente l){
        
        Vendedor temp = new Vendedor();
        Cnode t = new Cnode();
        t = c.getHead();
        Pnode t2 = new Pnode();
        Cnode temp2= new Cnode();
        if(c.getHead()==c.getTail()){
            
            
            c.setHead(null);
            c.setTail(null);
            
            return;
        }
        for(int i = 1; i!=opc; temp2 = temp2.getNext())
        {
       
            
            c.setHead(t.getNext());
            temp2.setNext(t.getNext());
            t.setNext(null);
            temp.add_carrito(temp, t);
            i++;
            
            
        }
        if(c.getTail()==t)
        {
            
            
            c.setHead(null);
            c.setTail(null);
            
        }
        else{
            c.setHead(t.getNext());
            t.setNext(null);
        }
        if(opc!=1){
            for(t=temp.getHead(); t!=temp.getTail(); t=t.getNext())
            {
                c.add_carrito(c, t);

            }
            c.add_carrito(c, t);
            temp.setHead(null);
            temp.setTail(null);
        }
        
        
        
        
    }
    
    public void del_cnode(Cnode n){
        n.setNext(null);
        
    }
    
}
