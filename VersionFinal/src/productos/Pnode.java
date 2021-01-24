/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

import java.util.logging.Logger;

/**
 *
 * @author spart
 */

public class Pnode {
    
    private Pnode next, prev;
    private String nombre;
    private float precio;
    private int id;
    private String tipo;
    private int existencias;
    private String autor;
    private int segundos;
    private String genero;
    private int minutos;
    private String color;
    private String[] canciones = new String[100];
    private int nPistas;
    
    
    public Pnode(){
        this.next=null;
        this.prev=null;
        this.autor=null;
        this.color=null;
        this.existencias=0;
        this.genero=null;
        this.id=0;
        this.minutos=0;
        this.nombre=null;
        this.precio=0;
        this.tipo=null;
        this.canciones=null;
        this.nPistas=0;
        
    }

    public Pnode(String nombre, float precio, int id, String tipo, int existencias, String color) {
        this.nombre = nombre;
        this.precio = precio;
        this.id = id;
        this.tipo = tipo;
        this.existencias = existencias;
        this.color = color;
        this.next=null;
        this.prev=null;
    }

    public Pnode(String nombre, float precio, int id, String tipo, int existencias, String autor, String genero, int minutos,int nPistas) {
        this.nombre = nombre;
        this.precio = precio;
        this.id = id;
        this.tipo = tipo;
        this.existencias = existencias;
        this.autor = autor;
        this.genero = genero;
        this.minutos = minutos;
        this.next=null;
        this.prev=null;
        this.nPistas=nPistas;
    }
    
    
    
    public Pnode(String nombre, float precio, int id, String tipo, String autor, String genero, int nPistas, String[] canciones) {
        this.nombre = nombre;
        this.precio = precio;
        this.id = id;
        this.tipo = tipo;
       
        this.autor = autor;
        this.genero = genero;
        
        this.next=null;
        this.prev=null;
        this.nPistas=nPistas;
        this.canciones=canciones;
    }
    

    public Pnode(String nombre, float precio, int id, String tipo, int existencias, String autor, String genero) {
        this.nombre = nombre;
        this.precio = precio;
        this.id = id;
        this.tipo = tipo;
        this.existencias = existencias;
        this.autor = autor;
        this.genero = genero;
        this.next=null;
        this.prev=null;
        this.canciones=null;
    }

    public Pnode(String nombre, float precio, int id, String tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.id = id;
        this.tipo = tipo;
        this.next=null;
        this.prev=null;
   
    }
    
    public Pnode(String nombre, float precio, int id, String tipo, String color) {
        this.nombre = nombre;
        this.precio = precio;
        this.id = id;
        this.tipo = tipo;
        this.color = color;
        this.next=null;
        this.prev=null;
    }
    

    public Pnode(String nombre, float precio, int id, String tipo, String autor, String genero, int minutos, int segundos) {
        this.nombre = nombre;
        this.precio = precio;
        this.id = id;
        this.tipo = tipo;
        this.autor = autor;
        this.genero = genero;
        this.minutos = minutos;
        this.segundos = segundos;
        this.next=null;
        this.prev=null;
        
    }

    public Pnode(String nombre, float precio, int id, String tipo,  String autor, String genero) {
        this.nombre = nombre;
        this.precio = precio;
        this.id = id;
        this.tipo = tipo;
        this.autor = autor;
        this.genero = genero;
        this.next=null;
        this.prev=null;
    }

    public Pnode getNext() {
        return next;
    }

    public Pnode getPrev() {
        return prev;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public int getExistencias() {
        return existencias;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public String getColor() {
        return color;
    }

    public void setNext(Pnode next) {
        this.next = next;
    }

    public void setPrev(Pnode prev) {
        this.prev = prev;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNombreCanciones(int i, String nombreCancion) {
        
        this.canciones[i] = nombreCancion;
        
    }

    public String getNombreCancion(int i) {
        return this.canciones[i];
    }

    public void setnPistas(int nPistas) {
        this.nPistas = nPistas;
    }

    public int getnPistas() {
        return nPistas;
    }

    public String[] getCanciones() {
        return canciones;
    }

   
    

    
   

    
    
    

    /**
     * 
     * @param n es un nodo tipo Producto
     */
    public void remove_node(Pnode n){
        n.setPrev(null);
        n.setNext(null);
    } 
    
   
    
    
    
    
    
    
}
