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
    
    /**
     * Contructor que sirve para crear un nodo de tipo Pnode el cual ya viene inicializado con
     * datos predeterminados.
     */
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

    /**
     * Contructor que sirve para crear un nodo de tipo Pnode el cual se le pasan como parametros
     * la informacion que este guardara en su interior.
     * @param nombre es el nombre de nuestro producto almacenado en nuestro nodo.
     * @param precio es el precio de nuestro producto.
     * @param it es el id de nuestro producto.
     * @param tipo especifica el tipo de nuestro producto.
     * @param existencias especifica el numero de unidades actuales de nuestro producto.
     * @param color es el color de nuestro producto.
     */
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

    /**
     * 
     */
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
     * funcion de tipo get que regresa el color de nuestro producto.
     * @return color regresa el color de nuestro producto.
     */
    public String getColor() {
        return color;
    }

    /**
     * funcion de tipo setter que se encarga de insertarle una nueva direccion a un nodo existente.
     * @param next es de tipo Pnode y guardara la direccion de un nuevo nodo que le sigue al 
     * nodo actual.
     */
    public void setNext(Pnode next) {
        this.next = next;
    }

    /**
     * funcion de tipo setter que se encargar de insertarle una nueva direccion a un nodo existente.
     * @param prev trae la direccion del nodo o del Null que esta antes del nodo actual.
     */
    public void setPrev(Pnode prev) {
        this.prev = prev;
    }

    /** 
     * funcion de tipo setter que se encarga de insertarle el nombre a nuestro nodo.
     * @param nombre es el nombre que le asignaremos a nuestro nodo. 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * funcion de tipo setter que se encarga de insertar el precio del producto a nuestro nodo.
     * @param precio es el precio que le asignaremos a nuestro nodo.
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * funcion de tipo setter que se encarga de insertarle la id del prodcuto a nuestro nodo.
     * @param id es la id del producto que almacena nuestro nodo.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * funcion de tipo setter que se encarga de insertar el tipo del prodcuto a nuestro nodo.
     * @param tipo es el tipo al que pertenece nuetsro prodcuto almacenado en nuestro nodo.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * funcion de tipo setter que se encarga de insertar el numero de unidades del producto
     * a nuestro nodo.
     * @param existencias es el numero de existencias de nuestro producto.
     */
    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    /**
     * funcion de tipo setter que se encarga de insertar el nombre del autor del 
     * producto en nuestro nodo.
     * @param autor de tipo String nos pasa el nombre del autor del producto almacenado.
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * funcion de tipo setter que se encarga de insertar genero del producto en 
     * nuestro nodo.
     * @param genero  es de tipo String y tiene almacenado el genero al que pertenece el producto
     * en cuestion.
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * funcion de tipo setter que se encarga de insertar el numero de minutos al producto
     * almacenado en nuestro nodo.
     * @param minutos es el numero de minutos de duracion de nuestro producto.
     */
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    /**
     * funcion de tipo setter que se encarga de insertar el numero de segundos al producto
     * almacenado en nuestro nodo.
     * @param segundos es el numero de segundos de duracion de nuestro producto.
     */
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    /**
     * funcion de tipo setter que se encarga de insertar el color a nuestro producto
     * almacenado en nuestro nodo.
     * @param color es de tipo String encargada de indicar de que color es nuestro producto.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * funcion de tipo setter que se encarga de insertar el titulo de nuestras canciones.
     * @param i de tipo entero se encarga de indicar en que columna se encuentra
     * la cancion a nombrar.
     * @param nombreCancion de tipo String trae consigo el nombre de nuestra cancion.
     */
    public void setNombreCanciones(int i, String nombreCancion) {
        
        this.canciones[i] = nombreCancion;
        
    }

    /**
     * funcion de tipo getter que se encarga de encontrar el nombre de una cancion en especifico.
     * @param i es de tipo entero y nos servira como indice para encontrar la cancion solicitada.
     * @return this.canciones[ i ] regresa el nombre que se encontro en el arreglo con el indice.
     */
    public String getNombreCancion(int i) {
        return this.canciones[i];
    }

    /**
     * funcion de tipo setter encargada de insertar el numero de Pistas musicales a nuestro nodo actual.
     * @param nPistas es de tipo entero e indica la cantidad de pistas que se pose actualmente.
     */
    public void setnPistas(int nPistas) {
        this.nPistas = nPistas;
    }

    /**
     * funcion de tipo getter que se encarga de regresar el numero de Pistas musicales guardadas en nuestro nodo actual.
     * @return nPistas regresa el numero exacto de Pistas guardadas.
     */
    public int getnPistas() {
        return nPistas;
    }

    /**
     * funcion dedicada a regresar un arreglo de tipo String que almacenara las canciones guardadas en este nodo.
     * @return canciones regresa el nombre de las canciones guardadas en este nodo.
     */
    public String[] getCanciones() {
        return canciones;
    }

    /**
     * funcion dedicada a eleminar un nodo tipo Producto.
     * @param n es un nodo tipo Producto
     */
    public void remove_node(Pnode n){
        n.setPrev(null);
        n.setNext(null);
    } 
    
}
