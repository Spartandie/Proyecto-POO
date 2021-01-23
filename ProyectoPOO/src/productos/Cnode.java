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
 * Simula un objeto de tipo nodo denominado Cnode, nos servira para guardar
 * informacion y la dirección de otros nodos del mismo tipo. Es una extencion de Pnode
 * por lo cual heredara atributos de este, este nodo servira para crear una Estructura
 * de Datos de tipo Pila. 
 * @author spart
 */
public class Cnode extends Pnode{
    
    private Cnode next;
    private int cant;

    /**
     * Constructor de un Objeto tipo Cnode vacio.
     */
    public Cnode() {
    }

    /**
     * Constructor de un Objeto de tipo Cnode al cual sele pasan como parametros
     * la informacion que se guardara en su interior y en la superClase Pnode.
     * @param cant de tipo entero. representa la cantidad de unidades que se pose actualmente.
     * @param nombre El nombre de nuestros productos. 
     * @param precio El precio de nuestros productos.
     * @param id El codigo de barras de nuestros productos.
     * @param tipo El tipo de nuestros productos.
     */
    public Cnode(int cant, String nombre, float precio, int id, String tipo) {
        super(nombre, precio, id, tipo);
        this.cant=cant;
    }
    
    /**
     * Constructor de un Objeto de tipo Cnode al cual sele pasan como parametros
     * la informacion que se guardara en su interior y en la superClase Pnode.
     * @param cant de tipo entero. representa la cantidad de unidades que se pose actualmente.
     * @param nombre El nombre de nuestros productos. 
     * @param precio El precio de nuestros productos.
     * @param id El codigo de barras de nuestros productos.
     * @param tipo El tipo de nuestros productos.
     * @param autor El autor de nuestro producto, referente a la musica.
     * @param genero El genero de nuestro producto, referente a la musica.
     */
    public Cnode(int cant, String nombre, float precio, int id, String tipo, String autor, String genero) {
        super(nombre, precio, id, tipo, autor, genero);
        this.cant=cant;
    }
    
    /**
     * Constructor de un Objeto de tipo Cnode al cual sele pasan como parametros
     * la informacion que se guardara en su interior y en la superClase Pnode.
     * @param nombre El nombre de nuestros productos.
     * @param precio El precio de nuestros productos.
     * @param id El codigo de barras de nuestros productos.
     * @param tipo El tipo de nuestros productos.
     * @param color El tipo de color de nuestros productos. 
     */
    public Cnode(String nombre, float precio, int id, String tipo,  String color) {
        super(nombre, precio, id, tipo, color);
    }

    /**
     * Constructor de un Objeto de tipo Cnode al cual sele pasan como parametros
     * la informacion que se guardara en su interior y en la superClase Pnode.
     * @param nombre El nombre de nuestros productos. 
     * @param precio El precio de nuestros productos.
     * @param id El codigo de barras de nuestros productos.
     * @param tipo El tipo de nuestros productos.
     * @param autor El autor de nuestros productos.
     * @param genero El genero de nuestros productos.
     * @param minutos La cantidad de minutos que conforma nuestro producto.
     * @param segundos La cantidad de segundos de conforma nuestro producto.
     */
    public Cnode(String nombre, float precio, int id, String tipo, String autor, String genero, int minutos, int segundos) {
        super(nombre, precio, id, tipo, autor, genero, minutos, segundos);
    }

    /**
     * Constructor de un Objeto de tipo Cnode al cual sele pasan como parametros
     * la informacion que se guardara en su interior y en la superClase Pnode.
     * @param nombre El nombre de nuestros productos.
     * @param precio El precio de nuestros productos.
     * @param id El codigo de barras de nuestros productos.
     * @param tipo El tipo de nuestros productos.
     * @param autor El autor de nuestro producto.
     * @param genero El genero de nuestro producto.
     */
    public Cnode(String nombre, float precio, int id, String tipo, String autor, String genero) {
        super(nombre, precio, id, tipo, autor, genero);
    }

    /**
     * Se optiene la direccion del nodo que le sigue de tipo Cnode.
     */
    @Override
    public Cnode getNext() {
        return next;
    }

    /**
     * Se optiene la cantidad de productos de nuestro nodo de tipo Cnode.
     */
    public int getCant() {
        return cant;
    }

    /**
     * Se inserta la direccion del siguiente nodo de tipo Cnode.
     */
    public void setNext(Cnode next) {
        this.next = next;
    }

    /**
     * Se inserta la cantidad de nuestro producto dentro del nodo de tipo Cnode.
     */
    public void setCant(int cant) {
        this.cant = cant;
    }

    /**
     * Sirve para eliminar un nodo de tipo Cnode cuando no se necesite.
     * @param c de tipo Vendedor. 
     * @param opc de tipo entero, Indica el nodo a eliminar.
     * @param l de tipo Gerente.
     */
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
    
    /**
     * Su funcion es eliminar el nodo cuando ya no se necesita.
     */
    public void del_cnode(Cnode n){
        n.setNext(null);
        
    }
    
}
