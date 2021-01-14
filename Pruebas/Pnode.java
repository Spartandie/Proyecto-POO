/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.poo;

/**
 *
 * @author spart
 */
public class Pnode {
    private Pnode next, prev;
    private String nombre;
    private float precio;
    private int id;

    public Pnode() {
    }
    
    
    
    
    public void Pnode()
    {
        this.precio=0;
        this.nombre="";
        this.id=0;
        this.next = null;
        this.prev=null;
    }
    
    public Pnode(String nombre, float precio, int id) {
        this.next = null;
        this.nombre = nombre;
        this.precio = precio;
        this.id = id;
        this.prev=null;
    }
    
    public Pnode(Pnode next, Pnode prev, String nombre, float precio, int id) {
        this.next = next;
        this.nombre = nombre;
        this.precio = precio;
        this.id = id;
        this.prev=prev;
    }
    
    

    public Pnode getNext() {
        return next;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public int getid() {
        return id;
    }
    
    public Pnode getPrev() {
        return prev;
    }

    public void setNext(Pnode next) {
        this.next = next;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setPrev(Pnode prev) {
        this.prev = prev;
    }

    
    public void remove_node(Pnode n){
        n.setPrev(null);
        n.setNext(null);
    } 
    
}
