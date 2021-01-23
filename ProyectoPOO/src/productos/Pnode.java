/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

import java.util.logging.Logger;

/**
 * Objeto denominado Pnode que sirve de nodo que conformara una Estructura e Datos de tipo
 * Lista Doblemente enlazada Circular, los nodos serviran para guardar la informacion
 * de nuestros productos.
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

    /**
     * funcion de tipo get que regresa next.
     * @return next regresa la direccion del nodo que le sigue al nodo actual. 
     */
    public Pnode getNext() {
        return next;
    }

    /**
     * funcion de tipo get que regresa prev
     * @return prev regresa la direccion que esta antes de nuestro nodo actual.
     */
    public Pnode getPrev() {
        return prev;
    }

    /**
     * funcion de tipo get que regresa nombre.
     * @return nombre regresa el nombre de nuestro producto guardado en el nodo actual.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * funcion de tipo get que regresa precio.
     * @return nombre regresa el nombre de nuestro producto guardado en el nodo actual.
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * funcion de tipo get que regresa nombre.
     * @return nombre regresa el nombre de nuestro producto guardado en el nodo actual.
     */
    public int getId() {
        return id;
    }

    /**
     * funcion de tipo get que regresa tipo.
     * @return tipo regresa el tipo al que pertenece nuestro producto.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * funcion de tipo get que regresa las existencias.
     * @return existencias es el numero de unidades de nuestro producto en la tiendita.
     */
    public int getExistencias() {
        return existencias;
    }

    /**
     * funcion de tipo get que regresa el autor de nuestro producto.
     * @return autor es el nombre del autor de nuestro producto.
     */
    public String getAutor() {
        return autor;
    }

    /**
     * funcion de tipo get que regresa el genero de nuestro producto.
     * @return genero es el genero al que pertenece nuestro producto.
     */
    public String getGenero() {
        return genero;
    }

    /**
     * funcion de tipo get que regresa el numero de minutos que conforma nuestro producto.
     * @return minutos refleja el numero de minutos que conforma nuestro producto.
     */
    public int getMinutos() {
        return minutos;
    }

    /**
     * funcion de tipo get que regresa el numero de segundos que conforma nuestro producto.
     * @return segundos refleja el numero de segundos que conforma nuestro producto.
     */
    public int getSegundos() {
        return segundos;
    }

    /**
     * 
     */
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
