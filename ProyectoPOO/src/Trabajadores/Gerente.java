/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajadores;




import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import Trabajadores.reproductores.CD_PLAYER;
import Trabajadores.reproductores.DVD_PLAYER;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import productos.Pnode;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;
import proyectopoo.KeyboardInput;

/**
 *
 * @author spart
 */
public class Gerente extends Trabajador {
    
    private Pnode head;
    private Pnode tail;
    public int n;
    
    KeyboardInput in = new KeyboardInput();
    /**
     * Const sin paso de atrubitos
     */
    
    
    public Gerente() {
        this.head=null;
        this.tail=null;
    }

    /**
     * 
     * @param head es el head de la lista 
     * @param tail es el tail de la lista
     */
    public Gerente(Pnode head, Pnode tail) {
        this.head = head;
        this.tail = tail;
    }
    /**
     * 
     * @return  head es el head de la lista 
     */
    public Pnode getHead() {
        return head;
    }
    /**
     * 
     * @return tail es el tail de la lista
     */
    public Pnode getTail() {
        return tail;
    }

    public int getN() {
        return n;
    }
    
    
    /**
     * 
     * @param head es el head de la lista 
     */
    public void setHead(Pnode head) {
        this.head = head;
    }
    /**
     * 
     * @param tail es el tail de la lista
     */
    public void setTail(Pnode tail) {
        this.tail = tail;
    }

    public void setN(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "Plist{" + "head=" + head + ", tail=" + tail + ", n=" + n + '}';
    }
    
    
    
    
    
    /**
     * Funcion para imprimir lista
     * @param l es la lista
     * 
     */
    public boolean print_list(Gerente l){
        if(l.is_empty(l))
        {
            return false;
        }
        Pnode t = new Pnode();
        
        System.out.println("\n------------------- IMPRIMIENDO LISTA DE PRODUCTOS ----------------------\n");
        
        for(t=l.getHead(); t!=l.getTail(); t=t.getNext()){
            
            System.out.println("Nombre: "+t.getNombre());
            System.out.println("Precio: $"+t.getPrecio());
            System.out.println("ID: "+t.getId());
            System.out.println("Tipo de prod: "+t.getTipo());
            System.out.println("Existencias: "+t.getExistencias());
            System.out.println("");
             
        }
        System.out.println("Nombre: "+t.getNombre());
        System.out.println("Precio: $"+t.getPrecio());
        System.out.println("ID: "+t.getId());
        System.out.println("Tipo de prod: "+t.getTipo());
        System.out.println("Existencias: "+t.getExistencias());
        System.out.println("");
        System.out.println("\n-------------------------------------------------------------\n");
        return true;
    }
    
    public boolean print_list_headphones(Gerente l){
        if(l.is_empty(l))
        {
            return false;
        }
        Pnode t = new Pnode();
        
        System.out.println("\n------------------- IMPRIMIENDO LISTA DE Audifonos ----------------------\n");
        
        for(t=l.getHead(); t!=l.getTail(); t=t.getNext()){
            if(Objects.equals(t.getTipo(), "Audifonos")){
                System.out.println("Nombre: "+t.getNombre());
                System.out.println("Precio: $"+t.getPrecio());
                System.out.println("ID: "+t.getId());
                System.out.println("Tipo de prod: "+t.getTipo());
                System.out.println("Color: "+t.getColor());
                System.out.println("Existencias: "+t.getExistencias());
                System.out.println("");
            }
             
        }
        if(Objects.equals(t.getTipo(), "Audifonos"))
        {
            System.out.println("Nombre: "+t.getNombre());
            System.out.println("Precio: $"+t.getPrecio());
            System.out.println("ID: "+t.getId());
            System.out.println("Tipo de prod: "+t.getTipo());
            System.out.println("Color: "+t.getColor());
            System.out.println("Existencias: "+t.getExistencias());
            System.out.println("");
        }
        System.out.println("\n-------------------------------------------------------------\n");
        return true;
    }
    
    
    
    public boolean print_list_Cds(Gerente l){
        if(l.is_empty(l))
        {
            return false;
        }
        Pnode t = new Pnode();
        
        System.out.println("\n------------------- IMPRIMIENDO LISTA DE Cds ----------------------\n");
        
        for(t=l.getHead(); t!=l.getTail(); t=t.getNext()){
            if(Objects.equals(t.getTipo(), "CD")){
                System.out.println("Nombre: "+t.getNombre());
                System.out.println("Precio: $"+t.getPrecio());
                System.out.println("ID: "+t.getId());
                System.out.println("Tipo de prod: "+t.getTipo());
                System.out.println("Existencias: "+t.getExistencias());
                System.out.println("");
            }
             
        }
        if(Objects.equals(t.getTipo(), "CD"))
        {
            System.out.println("Nombre: "+t.getNombre());
            System.out.println("Precio: $"+t.getPrecio());
            System.out.println("ID: "+t.getId());
            System.out.println("Tipo de prod: "+t.getTipo());
            System.out.println("Existencias: "+t.getExistencias());
            System.out.println("");
        }
        System.out.println("\n-------------------------------------------------------------\n");
        return true;
    }
    
    
    
    public boolean print_list_DVDs(Gerente l){
        if(l.is_empty(l))
        {
            return false;
        }
        Pnode t = new Pnode();
        
        System.out.println("\n------------------- IMPRIMIENDO LISTA DE DVDs ----------------------\n");
        
        for(t=l.getHead(); t!=l.getTail(); t=t.getNext()){
            if(Objects.equals(t.getTipo(), "DVD")){
                System.out.println("Nombre: "+t.getNombre());
                System.out.println("Precio: $"+t.getPrecio());
                System.out.println("ID: "+t.getId());
                System.out.println("Tipo de prod: "+t.getTipo());
                System.out.println("Existencias: "+t.getExistencias());
                System.out.println("");
            }
             
        }
        if(Objects.equals(t.getTipo(), "DVD"))
        {
            System.out.println("Nombre: "+t.getNombre());
            System.out.println("Precio: $"+t.getPrecio());
            System.out.println("ID: "+t.getId());
            System.out.println("Tipo de prod: "+t.getTipo());
            System.out.println("Existencias: "+t.getExistencias());
            System.out.println("");
        }
        System.out.println("\n-------------------------------------------------------------\n");
        return true;
    }
    
    /**
     * Funcion para ver si la lista esta vacia
     * @param l es la lista
     * 
     */
    public boolean is_empty(Gerente l){
        if(l.getHead()==null && l.getTail()==null){
            return true;
        }
        return false;
    }
   
    /**
     * Funcion para borrar lista
     * @param l es la lista
     * 
     */
    public boolean del_list(Gerente l){
        Pnode t = new Pnode();
        if(l.getHead()!=null){
            l.setHead(null);
            l.setTail(null);
        }
        return false;
    }
    /**
     * Elimina el primer nodo
     * @param l es la lista
     */
    public void del_first_node(Gerente l){
        if(l.getHead()!=l.getTail())
        {
            
            l.getTail().setNext(l.getHead().getNext());
            l.getHead().setPrev(null);
            l.getHead().getNext().setPrev(l.getTail());
            l.getHead().setNext(null);
            l.setHead(l.getTail().getNext());
        }
        else{
            //QUIZAS ESTE MAL
            l.getHead().setPrev(null);
            l.getHead().setNext(null);
            l.setHead(null);
            l.setTail(null);
            
        }
        
    }
    /**
     * Elimina el ultimo nodo
     * @param l es la lista
     */
    public void del_last_node(Gerente l){
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
    /**
     * CHECAR FUNCION Y SUBFUNCIONES
     * Borra un nodo dado
     * @param l es la lista
     * @param n es el nodo
     */
    public void del_node(Gerente l, Pnode n){
        if(l.getHead()==l.getTail()){
            l.del_first_node(l);
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
    /**
     * Busca un nodo por su nombre
     * @param l es la lista
     * @param c es la lista del carrito, por si se necesita
     * @param p1 es la lista del Reprodcutor CD, por si se necesita
     * @param p2 es la lista del DVD, por si se necesita
     * @return 
     */
    public Pnode search_node(Gerente l, Vendedor c, CD_PLAYER p1, DVD_PLAYER p2){
        if(l.is_empty(l)!=false){
            System.out.println("Lista vacia");
            return null;
        }
        int opc;
        Pnode node = new Pnode();
        KeyboardInput in = new KeyboardInput();
        System.out.print("Buscar por:\n1)Nombre\n2)ID\n---> ");
        opc=in.readInteger(); 
        switch(opc)
        {
            case 1:
                String name;
                System.out.println("Ingrese el nombre a buscar: ");
                name = in.readString();
                node=l.search_name(l, name);
            break;
            
            case 2:
                int id;
                System.out.println("Ingrese el ID a buscar: ");
                id = in.readInteger();
                node=l.search_id(l, id);
            break;
            
            default:
                System.out.println("Opcion invalida");
                return null;
            
            
        }
        if(node!=null){
            if(Objects.equals("Audifonos", node.getTipo())!=true){
                if(Objects.equals("DVD", node.getTipo())){
                    System.out.println("Nombre DVD: "+node.getNombre());
                    System.out.println("Precio: $"+node.getPrecio());
                    System.out.println("");
                    System.out.print("\nQue quieres hacer? \n1)Agregar al carrito\n2)Insertar en DVD\n3)Agregar existencias\n4)Salir\n---> ");
                    opc=in.readInteger();
                    switch(opc){
                        
                        case 1:
                            c.add_carrito(c, node);
                            System.out.print("Buscar otro disco?\n1)Si\n2)No\n---> ");
                            opc=in.readInteger();
                            if(opc==1){
                                
                                l.search_node(l, c, p1, p2);
                            }
                            return null;
                        
                        
                        case 2:
                            Pnode t = new Pnode(node.getNombre(), node.getPrecio(), node.getId(), node.getTipo(), node.getAutor(), node.getGenero());
                            p2.add_product(p2, t);
                            p2.rec_list(p2, t);
                            System.out.print("Buscar otro producto?\n1)Si\n2)No\n---> ");
                            opc=in.readInteger();
                            if(opc==1){
                                
                                l.search_node(l, c, p1, p2);
                            }
                            return null;
                        
                        
                        case 3:
                            l.add_existencias(node);
                            return null;
                        
                        
                        default:
                            return null;
                        
                    }
                }
                else{
                    
                    System.out.println("Nombre album: "+node.getNombre());
                    System.out.println("Precio: $"+node.getPrecio());
                    System.out.println("");
                    System.out.print("\nQue quieres hacer? \n1)Agregar al carrito\n2)Insertar en CD\n3)Agregar existencias\n4)Salir\n---> ");
                    opc=in.readInteger();
                    switch(opc){
                        
                        case 1:
                            c.add_carrito(c, node);
                            System.out.print("Buscar otro Producto?\n1)Si\n2)No\n---> ");
                            opc=in.readInteger();
                            if(opc==1){
                                
                                l.search_node(l, c, p1, p2);
                            }
                            return null;
                        
                        
                        case 2:
                            Pnode t = new Pnode(node.getNombre(), node.getPrecio(), node.getId(), node.getTipo(), node.getAutor(), node.getGenero(), node.getnPistas(), node.getCanciones());
                            
                            
                          
                            if(p1.add_product(p1, t)){
                                p1.rec_list(p1, t);
                            }
                       
                            System.out.print("Buscar otro disco?\n1)Si\n2)No\n---> ");
                            opc=in.readInteger();
                            if(opc==1){
                                
                                l.search_node(l, c, p1, p2);
                            }
                            return null;
                        
                        
                        case 3:
                            l.add_existencias(node);
                            return null;
                        
                    }
                }
                
                
            }
            else{
                System.out.println("Nombre de los audifonos: "+node.getNombre());
                System.out.println("Color: "+node.getColor());
                System.out.println("Precio: $"+node.getPrecio());
                System.out.println("");
                System.out.print("\nQue quieres hacer? \n1)Agregar al carrito\n2)Salir\n---> ");
                opc=in.readInteger();
                    switch(opc){
                        
                        case 1:
                            c.add_carrito(c, node);
                        break;
                        
                        case 2:
                            return null;
                        
                        
                    }
            }
                
        }
        else{
            System.out.println("No se encontró el producto");
        }
        return node;
        
    }
    
    public Pnode search_name(Gerente l, String nombre){
        
        Pnode t = new Pnode();
        for(t=l.getHead(); t!=l.getTail(); t=t.getNext()){
                if(Objects.equals(toUpperCase(t.getNombre()), toUpperCase(nombre))==true){
                    System.out.println("Producto encontrado");
                    return t;
                }   
        }
        if(Objects.equals(toUpperCase(t.getNombre()), toUpperCase(nombre))==true){
            System.out.println("Producto encontrado");
            return t;
        }   
        return null;
    }
    
    public Pnode search_id(Gerente l, int id){
        Pnode t = new Pnode();
        for(t=l.getHead(); t!=l.getTail(); t=t.getNext()){
                
                if(Objects.equals(t.getId(), id)==true){
                    System.out.println("Producto encontrado");
                    return t;
                }   
        }
        if(Objects.equals(t.getId(), id)==true){
            System.out.println("Producto encontrado");
            return t;
        }   
        return null;
    }
    /**
     * Agrega un producto
     * @param l es la lista
     * @param n es un Pnode, por si se necesita
     * 
     */
    
    @Override
    public boolean add_product(Gerente l, Pnode n){
        
        float precio;
        int id, opc, nPistas, minutos, segundos, existencias;
        //String tipo, nombre, color, autor, genero;
        
        System.out.print("Ingresa el nombre del producto: ");
        String nombre = new String(in.readString());
        
        System.out.print("Ingresa el precio: $");
        precio=in.readFloat();
        System.out.print("Ingresa el id del producto: ");
        id=in.readInteger(); 
        System.out.print("Ingresa existencias: ");
        existencias=in.readInteger(); 
        System.out.print("Ingresa el tipo de producto:\n1)Audifonos\n2)Disco\n----> ");
        opc=in.readInteger();         
        switch(opc){
        
            case 1:
                String tipo = new String("Audifonos");
                Directorio productos=new Directorio();
                productos.directorio(tipo);
                System.out.println("Ingresa el color: ");
                String color = new String(in.readString());
                Pnode node = new Pnode(nombre, precio, id, tipo, existencias, color);
                File archivos=new File("Productos/Audifonos/" +nombre+".txt");
                if(archivos.exists()==true || l.is_in_list(l, n)==true){
                    System.out.println("Este producto ya existe, eliminelo para añadir mas inventario \no "
                            + "agregue el producto con un nombre diferente");
                    
                }
                else{
            try {
                archivos.createNewFile();
            
                System.out.println(archivos.exists());
                FileWriter fw = new FileWriter(archivos);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(nombre+ '\n');
                String prize= String.valueOf(precio);
                bw.write(prize+ '\n');
                String ID= String.valueOf(id);
                bw.write(ID+ '\n');
                bw.write(tipo+ '\n');
                String existences= String.valueOf(existencias);
                bw.write(existences+ '\n');
                bw.write(color+ '\n');
                bw.close();
                    
                }catch (IOException ex) {
                Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
            }
                }
                if(l.is_in_list(l, node)){
                    return false;
                }
                    
                if(l.is_empty(l)){
                    l.setHead(node);
                    l.setTail(node);
                    node.setNext(node);
                    node.setPrev(node);
                    l.setN(1);
                }
                else{
                    l.getTail().setNext(node);
                    l.getHead().setPrev(node);
                    node.setPrev(l.getTail());
                    node.setNext(l.getHead());
                    l.setTail(node);
                    l.setN(l.getN()+1);
                }
                System.out.print("Quieres agregar otro producto?\n1)Si\n2)No\n---> ");
                opc=in.readInteger();
                if(opc==1){
                    l.add_product(l, null);
                }
                return true;
            
                
            case 2:
                Directorio discos=new Directorio();
                discos.directorio("Discos");
                System.out.println("Autor: ");
                String autor = new String(in.readString());
                System.out.println("Numero de pistas: ");
                nPistas = in.readInteger();
                System.out.println("Genero: ");
                String genero = new String(in.readString());
                System.out.print("\nSelecciona el tipo de disco\n1)DVD\n2)CD\n----> ");
                opc=in.readInteger();
                switch(opc){
                    case 1:
                        tipo = "DVD";
                        discos.directorio("Discos/"+ tipo);
                        System.out.println("Minutos: ");
                        minutos = in.readInteger();
                        Pnode node2 = new Pnode(nombre, precio, id, tipo, existencias, autor, genero, minutos, nPistas);
                        File dv=new File("Productos/Discos/DVD/" +nombre+".txt");
                        if(dv.exists()==true){
                              System.out.println("Este producto ya existe, eliminelo para añadir mas inventario \no "
                            + "agregue el producto con un nombre diferente");
                                    }
                        else{
                try {
                dv.createNewFile();
                System.out.println(dv.exists());
                FileWriter fw = new FileWriter(dv);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(nombre+ '\n');
                String prize= String.valueOf(precio);
                bw.write(prize+ '\n');
                String ID= String.valueOf(id);
                bw.write(ID+ '\n');
                bw.write(tipo+ '\n');
                String existences= String.valueOf(existencias);
                bw.write(existences+ '\n');
                bw.write(autor+ '\n');
                bw.write(genero+ '\n');
                String minutes= String.valueOf(minutos);
                bw.write(minutes+ '\n');
                String npistas = String.valueOf(nPistas);
                bw.write(npistas+ '\n');
                bw.close();
                    
                }catch (IOException ex) {
                Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex); 
                        }
               
            }
                        if(l.is_in_list(l, node2)){
                            return false;
                        }
                        if(l.is_empty(l)){
                            l.setHead(node2);
                            l.setTail(node2);
                            node2.setNext(node2);
                            node2.setPrev(node2);
                            l.setN(1);
                        }
                        else{
                            l.getTail().setNext(node2);
                            l.getHead().setPrev(node2);
                            node2.setPrev(l.getTail());
                            node2.setNext(l.getHead());
                            l.setTail(node2);
                            l.setN(l.getN()+1);
                            
                    
                        }
                        System.out.print("Quieres agregar otro producto?\n1)Si\n2)No\n---> ");
                        opc=in.readInteger();
                        if(opc==1){
                            l.add_product(l, null);
                        }
                        return true;
                        
                    case 2:
                        String nombreCancion;
                        tipo = "CD";
                        discos.directorio("Discos/"+ tipo);
                        System.out.println("Minutos que dura la reproducción del CD: ");
                        int min=in.readInteger();
                        Pnode node3 = new Pnode(nombre, precio, id, tipo, existencias, autor, genero,min, nPistas);
                        File cd=new File("Productos/Discos/CD/" +nombre+".txt");
                        if(cd.exists()==true){
                               System.out.println("Este producto ya existe, eliminelo para añadir mas inventario \no "
                            + "agregue el producto con un nombre diferente");
                                    }
                        else{
                           try {
                           cd.createNewFile();
                           System.out.println(cd.exists());
                           FileWriter fw = new FileWriter(cd);
                           BufferedWriter bw = new BufferedWriter(fw);
                           bw.write(nombre+ '\n');
                           String prize= String.valueOf(precio);
                           bw.write(prize+ '\n');
                           String ID= String.valueOf(id);
                           bw.write(ID+ '\n');
                           bw.write(tipo+ '\n');
                           String existences= String.valueOf(existencias);
                           bw.write(existences+ '\n');
                           bw.write(autor+ '\n');
                           bw.write(genero+ '\n');
                           String minutes= String.valueOf(min);
                           bw.write(minutes+ '\n');
                           String npistas = String.valueOf(nPistas);
                           bw.write(npistas+ '\n');
                           Scanner in2 = new Scanner(System.in);
                           for (int i = 0; i < nPistas; i++) {
                                  System.out.print("Ingrese a continuación el nombre de la cancion "+(i+1)+": ");
                                  nombreCancion =  in.readString();
                                  node3.setNombreCanciones(i, nombreCancion);
                                  bw.write(nombreCancion+ '\n');
                                  
                           }
                           bw.close();
                               
                          
                    
                }catch (IOException ex) {
                Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
            }  
                        }
                       
                        
                        if(l.is_in_list(l, node3)){
                            return false;
                        }
                        if(l.is_empty(l)){
                            l.setHead(node3);
                            l.setTail(node3);
                            node3.setNext(node3);
                            node3.setPrev(node3);
                            l.setN(1);
                        }
                        else{
                            
                            l.getTail().setNext(node3);
                            l.getHead().setPrev(node3);
                            node3.setPrev(l.getTail());
                            node3.setNext(l.getHead());
                            l.setTail(node3);
                            l.setN(l.getN()+1);
                            
                    
                        }
                        System.out.print("Quieres agregar otro producto?\n1)Si\n2)No\n---> ");
                        opc=in.readInteger();
                        if(opc==1){
                            l.add_product(l, null);
                        }
                        return true;
                    
                    
                        
                    default:
                        System.out.println("Opcion no valida");
                       
                    break;
                }
                
              
                
               
            break;
                
            default:
                System.out.println("Opcion no valida");
            break;
        }
        
         return true;       
        
        
    }
    
    
    public void add_existencias(Pnode n){
        int ex=0;
        System.out.print("Actualmente se tienen "+n.getExistencias()+" existecias del Producto\nCuantas existencias se añadiran?\n---> ");
        ex = in.readInteger();
        n.setExistencias(n.getExistencias()+ex);
        System.out.println("Nuevas existencias del producto: "+n.getExistencias());
    }   
    
    
    public boolean is_in_list(Gerente l, Pnode n){
        Pnode t = new Pnode();
        if(l.is_empty(l)){
            return false;
        }
        for(t=l.getHead(); t!=l.getTail(); t = t.getNext()){
            if(Objects.equals(t.getNombre(), n.getNombre()) || Objects.equals(t.getId(), n.getId())){
                return true;
            }
        }
        if(Objects.equals(t.getNombre(), n.getNombre()) || Objects.equals(t.getId(), n.getId())){
            return true;
        }
        return false;
    }
    
    
    public void refresh_list(Gerente l) throws IOException{
        
        File dir = new File("Productos");
        String[] ficheros = dir.list();
        if(ficheros != null){
            l.listarFicherosPorCarpeta(dir, l);

        }
        else{
            System.out.println("Error al actualizar base de datos");
        }
       
        
        
    }
    
    
    public void listarFicherosPorCarpeta(final File carpeta, Gerente l) throws FileNotFoundException, IOException {
    for (final File ficheroEntrada : carpeta.listFiles()) {
        if (ficheroEntrada.isDirectory()) {
            listarFicherosPorCarpeta(ficheroEntrada, l);
        } else {
            
            FileReader fr = new FileReader (ficheroEntrada);
            BufferedReader br = new BufferedReader(fr);
            String nombre = br.readLine();
            
            float precio = Float.parseFloat(br.readLine());
           
            int id = Integer.parseInt(br.readLine());
            
            String tipo = br.readLine();
            
            int existencias = Integer.parseInt(br.readLine());
            
            
            
            
            if(Objects.equals(tipo,"Audifonos")){
                String color = br.readLine();
                
                Pnode n = new Pnode(nombre, precio, id, tipo, existencias, color);
                l.add_fin(l, n);
            }else{
                if(Objects.equals(tipo,"DVD")){
                  
                    String artista = br.readLine();
                    String genero = br.readLine();
        
                    int minutos = Integer.parseInt(br.readLine());
                    
                    int nPistas = Integer.parseInt(br.readLine());
                    
                    Pnode n = new Pnode(nombre, precio, id, tipo, existencias, artista, genero, minutos,nPistas );
                    l.add_fin(l, n);
                }
                else{
                    String artista = br.readLine();
                    String genero = br.readLine();
                    int minutos = Integer.parseInt(br.readLine());
                    int nPistas = Integer.parseInt(br.readLine());
                    String nombreCancion;
                    Pnode n = new Pnode(nombre, precio, id, tipo, existencias, artista, genero,minutos, nPistas);
            
                    for(int i = 0; i<nPistas;i++){
                        nombreCancion = br.readLine();
                        n.setNombreCanciones(i, nombreCancion);
                    }
                    l.add_fin(l, n);
                   
                }
            }
            
            
            
        }
    }
}

    
    public boolean add_fin(Gerente l, Pnode n){
        if(l==null){
            return false;
        }
        if(l.getHead()==null){
            l.setHead(n);
            l.setTail(n);
            n.setPrev(n);
            n.setNext(n);
            l.setN(1);
            return true;
        }
        l.getHead().setPrev(n);
        l.getTail().setNext(n);
        n.setNext(l.getHead());
        n.setPrev(l.getTail());
        l.setTail(n);
        
        return true;
    }
    
     public BufferedReader getBuffered(String link){

        FileReader lector  = null;
        BufferedReader br = null;
        try {
             File Arch=new File(link);
            if(!Arch.exists()){
               System.out.println("No existe el archivo");
            }else{
               lector = new FileReader(link);
               br = new BufferedReader(lector);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return br;
    }
    
}



